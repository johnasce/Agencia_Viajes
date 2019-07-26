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
    private int idProveedor;
    private int cantidad;
    private int idProd;
    
    // Constructor de la clase RegistroStock
    public RegistroStock(){
    }
    
    // Sobrecarga del constructor de la clase RegistroStock
    public RegistroStock(int regID, GregorianCalendar fecha, int proveedor) {
        this.regID = regID;
        this.fecha = fecha;
        this.idProveedor = proveedor;
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

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    @Override
    public String toString() {
        return "RegistroStock{" + "regID=" + regID + ", fecha=" + fecha + ", proveedor=" + idProveedor + '}';
    }
    
    
    
}
