/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.GregorianCalendar;

/**
 * @author ZD28 JOHN HENRY CHIQUI
 * @version 1.0
 * Clase RegistroStock
 */

public class RegistroStock {
    
    // Atributos de la clase RegistroStock
    private int regID;
    private GregorianCalendar fecha;
    private Proveedor proveedor;
    
    // Constructor de la clase RegistroStock
    public RegistroStock(){
    }
    
    // Sobrecarga del constructor de la clase RegistroStock
    public RegistroStock(int regID, GregorianCalendar fecha, Proveedor proveedor) {
        this.regID = regID;
        this.fecha = fecha;
        this.proveedor = proveedor;
    }
    
    // Setter and Getters
    public int getRegID() {
        return regID;
    }

    public void setRegID(int regID) {
        this.regID = regID;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "RegistroStock{" + "regID=" + regID + ", fecha=" + fecha + ", proveedor=" + proveedor + '}';
    }
    
    
    
}
