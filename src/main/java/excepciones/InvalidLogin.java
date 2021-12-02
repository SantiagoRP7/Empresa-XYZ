/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import org.apache.log4j.Logger;

/**
 *
 * @author usuario
 */
public class InvalidLogin extends Exception{
    private static final Logger LogJava = Logger.getLogger(DBConexionExcepcion.class);
    public InvalidLogin(String message) {
        super(message);
        LogJava.warn(message);
    }
}
