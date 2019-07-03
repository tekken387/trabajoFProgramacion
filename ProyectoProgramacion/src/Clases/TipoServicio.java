/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author David
 */
public class TipoServicio {
    private int id;
    private char descripcion;
    private double precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(char descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString(){
        return String.valueOf(getDescripcion());
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
