/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 *
 * @author ADMIN
 */
public class DBConexionExcepcion extends Exception{
        private static final Logger LogJava = Logger.getLogger(DBConexionExcepcion.class);
    //public DBConexionExcepcion(String message) {
      //  super(message);
        //LogJava.fatal(message);
    //}

    public DBConexionExcepcion(String message, SQLException ex) {
        super(message);
        LogJava.fatal(message, ex);
    }

    public DBConexionExcepcion(String msg, ClassNotFoundException ex) {
        super(msg);
        LogJava.fatal(msg, ex);
    }

    public DBConexionExcepcion(String msg, Exception ex) {
        super(msg);
        LogJava.fatal(msg, ex);
    }
    
}
