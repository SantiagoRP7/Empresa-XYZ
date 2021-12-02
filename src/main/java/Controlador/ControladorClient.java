/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.ClientDAO;
import excepciones.InvalidName;
import excepciones.RegexStatement;
import java.util.ArrayList;
import java.util.List;
import modelo.Client;
//comentario
/**
 *
 * @author juancamilo
 */
public class ControladorClient {
    ClientDAO clientDao;

    public ControladorClient() {
        this.clientDao = new ClientDAO();
    }
    
    public boolean createClient(String firstName, String lastName, String email, String phone) {
        try {
            if (firstName.matches(RegexStatement.RegexName)) {
                Client client = new Client(firstName, lastName, email, phone);
                return clientDao.insertar(client);   
            }else{
                throw new InvalidName("Verificar que el nombre este bien escrito y no contenga caracteres especiales");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean eliminar (int idclient) {
    return clientDao.eliminar(idclient);
    
    }
    
     public boolean Modificar(int idclient, String firstName, String lastName, String email, String phone){
      Client client = new Client(idclient, firstName, lastName, email, phone);
         return clientDao.Modificar(client);
     }
    
    
    public List<String[]> selectClients() {
        List<Client> clients = clientDao.seleccionar();
        List<String[]> clientsReturn = new ArrayList<>();
        clients.forEach( client -> {
            String cli[] = {String.valueOf(client.getIdClient()), client.getFirstName(), client.getLastName(), client.getEmail(), client.getPhone()};
            clientsReturn.add(cli);
        });
        return clientsReturn;
    }
    
    public Client selectClientById(int idCli) {
        return clientDao.selectClientById(idCli);
    }
    
    public void updateClient(){
            System.out.println("modificado");
    }
}
