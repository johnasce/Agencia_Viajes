/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * @author ZD28 JOHN HENRY CHIQUI
 * @version 1.0
 * Clase Producto
 */

class Producto {
    
    // Atributs de la clase Producto
    private int proID;
    private GregorianCalendar proFecha;
    private double precio;
    private int cantidad;
    private String descripcion;
    private String lugDestino;
    private String lugPartida;
    private int duracion;
    private Tipo tipo;
    private ArrayList<RegistroStock> registroStock;
    
    // Constructor de la clase Producto sirve para inicializar sin parametros
    public Producto(){
    }
    
    
    // Constructor de la clase Producto con parametros para los atributos de clase
    public Producto(int proID, GregorianCalendar proFecha, double precio, int cantidad, String descripcion, String lugDestino, String lugPartida, int duracion, Tipo tipo, ArrayList<RegistroStock> registroStock) {
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public ArrayList<RegistroStock> getRegistroStock() {
        return registroStock;
    }

    public void setRegistroStock(ArrayList<RegistroStock> registroStock) {
        this.registroStock = registroStock;
    }
    
    
    
    
    
}
