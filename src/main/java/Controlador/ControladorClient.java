/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.ClientDAO;
import excepciones.InvalidEmail;
import excepciones.InvalidLastName;
import excepciones.InvalidName;
import excepciones.InvalidPhone;
import excepciones.RegexStatement;
import java.util.ArrayList;
import java.util.List;
import modelo.Client;

/**
 *
 * @author juancamilo
 */
public class ControladorClient {
    ClientDAO clientDao;

    public ControladorClient() {
        this.clientDao = new ClientDAO();
    }
    
    public void createClient(String firstName, String lastName, String email, String phone) throws Exception {

        
            if (firstName.matches(RegexStatement.RegexName)) {
                 
                if (lastName.matches(RegexStatement.RegexName)) {
                    if (email.matches(RegexStatement.RegexEmail)) {
                        if(phone.length()==10 || phone.length()==7){
                            Client client = new Client(firstName, lastName, email, phone);
                            clientDao.insertar(client);   
                        }else{
                            throw new InvalidPhone("Verificar que el telefono este bien escrito");
                        }
                    }else{
                    throw new InvalidEmail("Verificar que el email este bien escrito");
                    } 
                }else{
                throw new InvalidLastName("Verificar que el apellido este bien escrito y no contenga caracteres especiales");
                }
            }else{
                throw new InvalidName("Verificar que el nombre este bien escrito y no contenga caracteres especiales");
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
