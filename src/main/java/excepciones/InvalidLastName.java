/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;
import org.apache.log4j.Logger;

/**
 *
 * @author ADMIN
 */
public class InvalidLastName extends Exception{
    private static final Logger LogJava = Logger.getLogger(InvalidName.class);
    public InvalidLastName(String msg){
        super(msg);
        LogJava.warn(msg);
    }
    
}
