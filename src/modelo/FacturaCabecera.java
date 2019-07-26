
package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * @author ZD28 JOHN HENRY CHIQUI
 * @version 1.0
 * Clase FacturaCabecera
 */

public class FacturaCabecera {
    
    // Atributos para laclase Factura Cabecera
    private int faCabeceraID;
    private GregorianCalendar faCabeceraFecha;
    private double subtotal;
    private double total;
    private char estado;
    private double iva;
    private int idCliente;
    private int idUsuario;
    private ArrayList<FacturaDetalle> listDetalle;
    
    
    // Constructor vacio de la clase FacturaCabecra sin parametros
    public FacturaCabecera(){
    }

    // Constructor de la factura cabecera con soporte de parametros
    public FacturaCabecera(int faCabeceraID, GregorianCalendar faCabeceraFecha, double subtotal, double total, char estado, int cliente, int usuario, ArrayList<FacturaDetalle> listDetalle) {
        this.faCabeceraID = faCabeceraID;
        this.faCabeceraFecha = faCabeceraFecha;
        this.subtotal = subtotal;
        this.total = total;
        this.estado = estado;
        this.idCliente = cliente;
        this.idUsuario = usuario;
        this.listDetalle = listDetalle;
    }
    
    // Setters and Getters
    
    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getFaCabeceraID() {
        return faCabeceraID;
    }

    public void setFaCabeceraID(int faCabeceraID) {
        this.faCabeceraID = faCabeceraID;
    }

    public GregorianCalendar getFaCabeceraFecha() {
        return faCabeceraFecha;
    }

    public void setFaCabeceraFecha(GregorianCalendar faCabeceraFecha) {
        this.faCabeceraFecha = faCabeceraFecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    

    public ArrayList<FacturaDetalle> getListDetalle() {
        return listDetalle;
    }

    public void setListDetalle(ArrayList<FacturaDetalle> listDetalle) {
        this.listDetalle = listDetalle;
    }

    @Override
    public String toString() {
        return "FacturaCabecera{" + "faCabeceraID=" + faCabeceraID + ", faCabeceraFecha=" + faCabeceraFecha + ", subtotal=" + subtotal + ", total=" + total + ", estado=" + estado + ", cliente=" + idCliente + ", usuario=" + idUsuario + ", listDetalle=" + listDetalle + '}';
    }

    
}
