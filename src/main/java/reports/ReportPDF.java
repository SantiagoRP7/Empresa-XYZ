/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reports;

import Controlador.ControladorOrder;
import Controlador.ControladorOrderProduct;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import excepciones.DBConexionExcepcion;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Order;


/**
 *
 * @author juancamilo
 */
public class ReportPDF {

    ControladorOrderProduct controladorOrderProduct;
    ControladorOrder controladorOrder;

    public ReportPDF() {
        controladorOrderProduct = new ControladorOrderProduct();
        controladorOrder = new ControladorOrder();
    }

    Document document = new Document();

    public void generatePDF(int idOrder) throws DBConexionExcepcion {
        try {
            String path = System.getProperty("user.home");
            List<String[]> orderProducts = controladorOrderProduct.selectProductsById(idOrder);
            Order order = controladorOrder.selectOrderById(idOrder);
            PdfWriter.getInstance(document, new FileOutputStream(path + "/Facturas/Reporte" +String.valueOf(idOrder) + ".pdf"));
            Image header = Image.getInstance("src/main/java/imgs/xyz.png");
            header.scaleToFit(100,100);
            header.setAlignment(Chunk.ALIGN_LEFT);
            
            Paragraph paragraph = new Paragraph();
            Paragraph infoOrder = new Paragraph();
            Paragraph infoClient = new Paragraph();
            Paragraph titleProducts = new Paragraph();
            Paragraph total = new Paragraph();
            
            paragraph.setAlignment(Paragraph.ALIGN_CENTER);
            //paragraph.add("Empresa XYZ");
            paragraph.setFont(FontFactory.getFont("Tahoma",18,Font.BOLD, BaseColor.DARK_GRAY));
            paragraph.add("Detalle de pedido \n\n");
            
            infoOrder.setAlignment(Paragraph.ALIGN_MIDDLE);
            infoOrder.add("Id pedido: " + order.getIdOrder() + "\n" + "Fecha pedido: " + order.getDateOrder());
            infoClient.add("\n\n\n");
            infoClient.setAlignment(Paragraph.ALIGN_MIDDLE);
            infoClient.add("Id cliente: " + order.getIdClient().getIdClient() + "\n" + "Nombre: " + order.getIdClient().getFullName());
            infoClient.add("\n\n\n");
            
            titleProducts.setAlignment(Paragraph.ALIGN_CENTER);
            titleProducts.setFont(FontFactory.getFont("Tahoma",12,Font.BOLD, BaseColor.DARK_GRAY));
            titleProducts.add("Productos");
            titleProducts.add("\n\n");   
            
            document.open();
            document.add(header);
            document.add(paragraph);
            document.add(infoOrder);
            document.add(infoClient);
            document.add(titleProducts);
            
            PdfPTable table = new PdfPTable(6);
            table.addCell("Id producto");
            table.addCell("Nombre");
            table.addCell("Descripcion");
            table.addCell("Precio");
            table.addCell("Cantidad");
            table.addCell("Precio total");

            double totalPriceOrder = 0;
            
            for (int i = 0; i < orderProducts.size(); i++) {
                table.addCell(orderProducts.get(i)[0]);
                table.addCell(orderProducts.get(i)[1]);
                table.addCell(orderProducts.get(i)[2]);
                table.addCell(orderProducts.get(i)[3]);
                table.addCell(orderProducts.get(i)[4]);
                table.addCell(orderProducts.get(i)[5]);
                totalPriceOrder += Double.parseDouble(orderProducts.get(i)[5]);
            }
            
            total.add("\n\n");
            total.setFont(FontFactory.getFont("Tahoma",16,Font.BOLD, BaseColor.DARK_GRAY));
            total.setAlignment(Paragraph.ALIGN_RIGHT);
            total.add("Total a pagar: " + String.valueOf(totalPriceOrder));
            total.add("\n\n\n");
            
            document.add(table);
            document.add(total);
            document.close();
            JOptionPane.showMessageDialog(null, "Archivo creado con exito");

        } catch (DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ReportPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
