/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * @author ZD28 JOHN HENRY CHIQUI
 * @version 1.0
 * Clase Proveedor
 */

public class Proveedor {
    
    // Atributos de la clase Proveedor
    private int provID;
    private String nombre;
    
    
    // Constructor de la clase Proveedor sin parametros para una instaciacion
    public Proveedor(){    
    }

    // Constructor de la clase Proveedor que permite parametros para los atributos de la clase
    public Proveedor(int provID, String nombre) {
        this.provID = provID;
        this.nombre = nombre;
    }
    
    // Setters and Getters
    public int getProvID() {
        return provID;
    }

    public void setProvID(int provID) {
        this.provID = provID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "provID=" + provID + ", nombre=" + nombre + '}';
    }
    
    
}
