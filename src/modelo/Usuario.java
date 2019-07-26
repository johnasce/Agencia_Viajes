/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 * @author ZD28 JOHN HENRY CHIQUI
 * @version 1.0
 * Clase Usuario Tiene una super clase que es Persona
 */
public class Usuario extends Persona{
    
    // declaracion de atributos de la clase Usuario
    private int usuarioId;
    private String nickName;
    private String password;
    private char rol;
    private char estado;
    
    // Constructor de la clase Usuario para una instancia sin paramaetros
    public Usuario(){
    }
    
    //Sobre carga de  Constructor de la clase Usuario con los atributos de clase
    public Usuario(int usuarioId, String nickName, String password, char rol) {
        this.usuarioId = usuarioId;
        this.nickName = nickName;
        this.password = password;
        this.rol = rol;
    }
    
    // Constructor con los atributos de la superclase (Persona) y atributos e la subclase (Usuario)
    public Usuario(int usuarioId, String nickName, String password, char rol, String identificacion, String nombre, String apellido, String callePrincipal, String calleSecundaria, String telefono, String emial) {
        super(identificacion, nombre, apellido, callePrincipal, calleSecundaria, telefono, emial);
        this.usuarioId = usuarioId;
        this.nickName = nickName;
        this.password = password;
        this.rol = rol;
    }
    
    // Setters y Getters para modificacion de atributos de clase

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public char getEstado() {
        return estado;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }
    

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getRol() {
        return rol;
    }

    public void setRol(char rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return super.toString().concat("Usuario{" + "usuarioId=" + usuarioId + ", nickName=" + nickName + ", password=" + password + ", rol=" + rol + '}');
    }

}
