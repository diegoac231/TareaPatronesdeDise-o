/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diseno5;

// Clase Habitación (objeto original)
public class Habitacion {
    private String tipo;
    private double precio;

    public Habitacion(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

      public void setPrecio(double precio) {
        this.precio = precio;
    }
}