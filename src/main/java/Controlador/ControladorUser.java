/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.*;

/**
 *
 * @author juancamilo
 */
public class ControladorUser {

    UserDAO userDao;

    public ControladorUser() {
        this.userDao = new UserDAO();
    }

    public boolean login(String username, String password) {
        return userDao.login(username, password);
    }

}
