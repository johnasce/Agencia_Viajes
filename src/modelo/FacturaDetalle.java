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
    private double precioServ;
    private Producto producto;
    
    // Constructor FacturaDetalle que iniciliza sin parametros necesario para instanciar sin parametros
    public FacturaDetalle(){
    }
    
    
    // Constructor FacturaDetalle con los parametros que necesita 
    public FacturaDetalle(int faDetalleID, int cantidad, double subtotal, double precioServ, Producto producto) {
        this.faDetalleID = faDetalleID;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.precioServ = precioServ;
        this.producto = producto;
    }
    
    // Setters and Getters
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" + "faDetalleID=" + faDetalleID + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", precioServ=" + precioServ + ", producto=" + producto + '}';
    }

    
}
