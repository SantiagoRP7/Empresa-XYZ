package excepciones;

import org.apache.log4j.Logger;

public class DiferentPasswords extends Exception{
    private static final Logger LogJava = Logger.getLogger(DiferentPasswords.class);
    public DiferentPasswords(String msg){
        super(msg);
        LogJava.warn(msg);
    }
}
