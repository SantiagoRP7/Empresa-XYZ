package Controlador;


import java.security.MessageDigest;


public class ControladorEncode {

    public String codificar(String md5) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
            
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }

}
