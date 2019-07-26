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

// Clase FacturaDetalle
public class FacturaDetalle {
    
    // Atributos de la clase FacturaDetalle
    private int faDetalleID;
    private int cantidad;
    private double subtotal;
    private double precioUni;
    private double precioServ;
    private int idProducto;
    private int idFacCab;
    
    // Constructor FacturaDetalle que iniciliza sin parametros necesario para instanciar sin parametros
    public FacturaDetalle(){
    }
    
    
    // Constructor FacturaDetalle con los parametros que necesita 
    public FacturaDetalle(int faDetalleID, int cantidad, double subtotal, double precioServ, int producto) {
        this.faDetalleID = faDetalleID;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.precioServ = precioServ;
        this.idProducto = producto;
    }
    
    // Setters and Getters
    
    public double getPrecioUni() {
        return precioUni;
    }

    public void setPrecioUni(double precioUni) {
        this.precioUni = precioUni;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdFacCab() {
        return idFacCab;
    }

    public void setIdFacCab(int idFacCab) {
        this.idFacCab = idFacCab;
    }

    public int getFaDetalleID() {
        return faDetalleID;
    }

    public void setFaDetalleID(int faDetalleID) {
        this.faDetalleID = faDetalleID;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPrecioServ() {
        return precioServ;
    }

    public void setPrecioServ(double precioServ) {
        this.precioServ = precioServ;
    }


    @Override
    public String toString() {
        return "FacturaDetalle{" + "faDetalleID=" + faDetalleID + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", precioServ=" + precioServ + ", producto=" + idProducto + '}';
    }

    
}
