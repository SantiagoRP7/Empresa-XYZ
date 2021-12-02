package excepciones;

public class RegexStatement {
    public static final String RegexName = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";;
    public static final String RegexUserName="^[a-zA-Z0-9_.]+$";
    public static final String RegexEmail="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*" +
            "@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    public static final String RegexContrasena="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";
}
