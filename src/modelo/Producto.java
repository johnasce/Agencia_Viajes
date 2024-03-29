/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import modelo.RegistroStock;
import modelo.RegistroStock;
import modelo.Tipo;
import modelo.Tipo;

/**
 * @author ZD28 JOHN HENRY CHIQUI
 * @version 1.0
 * Clase Producto
 */

public class Producto {
    
    // Atributs de la clase Producto
    private int proID;
    private GregorianCalendar proFecha;
    private double precio;
    private String nombre;
    private int cantidad;
    private String descripcion;
    private String lugDestino;
    private String lugPartida;
    private int duracion;
    private int tipo;
    private char tipoServ;
    private ArrayList<RegistroStock> registroStock;
    
    // Constructor de la clase Producto sirve para inicializar sin parametros
    public Producto(){
    }
    
    
    // Constructor de la clase Producto con parametros para los atributos de clase
    public Producto(int proID, GregorianCalendar proFecha, double precio, int cantidad, String descripcion, String lugDestino, String lugPartida, int duracion, int tipo, ArrayList<RegistroStock> registroStock) {
        this.proID = proID;
        this.proFecha = proFecha;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.lugDestino = lugDestino;
        this.lugPartida = lugPartida;
        this.duracion = duracion;
        this.tipo = tipo;
        this.registroStock = registroStock;
    }
    
    // Setters and Getters
    
    public char getTipoServ() {
        return tipoServ;
    }

    public void setTipoServ(char tipoServ) {
        this.tipoServ = tipoServ;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public GregorianCalendar getProFecha() {
        return proFecha;
    }

    public void setProFecha(GregorianCalendar proFecha) {
        this.proFecha = proFecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugDestino() {
        return lugDestino;
    }

    public void setLugDestino(String lugDestino) {
        this.lugDestino = lugDestino;
    }

    public String getLugPartida() {
        return lugPartida;
    }

    public void setLugPartida(String lugPartida) {
        this.lugPartida = lugPartida;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<RegistroStock> getRegistroStock() {
        return registroStock;
    }

    public void setRegistroStock(ArrayList<RegistroStock> registroStock) {
        this.registroStock = registroStock;
    }

    @Override
    public String toString() {
        return "Producto{" + "proID=" + proID + ", proFecha=" + proFecha + ", precio=" + precio + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", lugDestino=" + lugDestino + ", lugPartida=" + lugPartida + ", duracion=" + duracion + ", tipo=" + tipo + ", registroStock=" + registroStock + '}';
    }
    
    
    
    
    
}
