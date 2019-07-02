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
    private TipoServicio tipoServicio;
    private Destino destino;
    private Cliente[] pasajeros;

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

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Cliente[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Cliente[] pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    public Cliente pasajeroxId(int id){
        Cliente cli=null;
        
        for (int i = 0; i < pasajeros.length; i++) {
            if(pasajeros[i].getId()==id){
                cli =pasajeros[i];
                break;
            }
        }
        
        return cli;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }
}
