/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diseno5;


public class DecoradorChocolate implements DecoradorHabitacion {
    
    public void decorar(Habitacion habitacion) {
        System.out.println("Agregando chocolate gourmet a la habitación");
        habitacion.setPrecio(habitacion.getPrecio() + 30);
    }
}
