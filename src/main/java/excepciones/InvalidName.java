package excepciones;

import org.apache.log4j.Logger;

public class InvalidName extends Exception{
    private static final Logger LogJava = Logger.getLogger(InvalidName.class);
    public InvalidName(String msg){
        super(msg);
        LogJava.warn(msg);
    }
}
