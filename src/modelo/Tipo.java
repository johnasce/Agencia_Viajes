/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * @author ZD28 JOHN HENRY CHIQUI
 * @version 1.0
 * Clase FacturaCabecera
 */

public class Tipo {
    
    // Atributos de la clase Tipo
    private int tipoID;
    private String nombre;
    
    // Constructor de la clase Tipo 
    public Tipo(){
    }
    
    // Constructor de la clase Tipo con parametros para los atributos de la clase Tipo
    public Tipo(int tipoID, String nombre) {
        this.tipoID = tipoID;
        this.nombre = nombre;
    }
    
    // Setters and Getters
    public int getTipoID() {
        return tipoID;
    }

    public void setTipoID(int tipoID) {
        this.tipoID = tipoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
