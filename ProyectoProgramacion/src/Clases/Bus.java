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
public class Bus {
    private int id;
    private int capacidad;
    private char tipoServicio;
    private String destino;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public char getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(char tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
