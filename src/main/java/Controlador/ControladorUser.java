/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.*;
import excepciones.DBConexionExcepcion;
import modelo.User;

/**
 *
 * @author juancamilo
 */
public class ControladorUser {

    UserDAO userDao;

    public ControladorUser() {
        this.userDao = new UserDAO();
    }

    public boolean login(String username, String password) throws DBConexionExcepcion {
        return userDao.login(username, password);
    }
    
    public boolean usuarioExistente(String userName) throws DBConexionExcepcion{
         
        return userDao.comprobarUserName(userName);
    }
    
    public boolean registrarUsuario(User user) throws DBConexionExcepcion{
        return userDao.registrarUsuario(user);
    }

}
