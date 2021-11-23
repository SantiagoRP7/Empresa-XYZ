/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juancamilo
 */
public class User {
    private int idUser;
    private String firstName;
    private String lastName;
    private String password;
    private String telefono;

    public User() {
    }

    public User(int idUser) {
        this.idUser = idUser;
    }

    public User(String firstName, String lastName, String password, String telefono) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.telefono = telefono;
    }

    public User(int idUser, String firstName, String lastName, String password, String telefono) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.telefono = telefono;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
