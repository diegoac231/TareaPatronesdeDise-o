/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diseno5;

import java.util.ArrayList;
import java.util.List;

public class DecoracionGeneral {
    private Habitacion habitacion;
    private List<DecoradorHabitacion> decoradores;

    public DecoracionGeneral(Habitacion habitacion) {
        this.habitacion = habitacion;
        this.decoradores = new ArrayList<>();
    }

    public void agregarDecorador(DecoradorHabitacion decorador) {
        decoradores.add(decorador);
    }

    public void decorar() {
        for (DecoradorHabitacion decorador : decoradores) {
            decorador.decorar(habitacion);
        }
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }
}