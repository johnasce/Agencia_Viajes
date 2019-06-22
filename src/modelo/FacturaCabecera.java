
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
    private Cliente cliente;
    private Usuario usuario;
    private ArrayList<FacturaDetalle> listDetalle;
    
    
    // Constructor vacio de la clase FacturaCabecra sin parametros
    public FacturaCabecera(){
    }

    // Constructor de la factura cabecera con soporte de parametros
    public FacturaCabecera(int faCabeceraID, GregorianCalendar faCabeceraFecha, double subtotal, double total, char estado, Cliente cliente, Usuario usuario, ArrayList<FacturaDetalle> listDetalle) {
        this.faCabeceraID = faCabeceraID;
        this.faCabeceraFecha = faCabeceraFecha;
        this.subtotal = subtotal;
        this.total = total;
        this.estado = estado;
        this.cliente = cliente;
        this.usuario = usuario;
        this.listDetalle = listDetalle;
    }
    
    // Setters and Getters
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<FacturaDetalle> getListDetalle() {
        return listDetalle;
    }

    public void setListDetalle(ArrayList<FacturaDetalle> listDetalle) {
        this.listDetalle = listDetalle;
    }

    @Override
    public String toString() {
        return "FacturaCabecera{" + "faCabeceraID=" + faCabeceraID + ", faCabeceraFecha=" + faCabeceraFecha + ", subtotal=" + subtotal + ", total=" + total + ", estado=" + estado + ", cliente=" + cliente + ", usuario=" + usuario + ", listDetalle=" + listDetalle + '}';
    }

    
}
