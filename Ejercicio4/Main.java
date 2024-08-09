/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diseno4;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        Historial historial = new Historial();

        Tarea tarea = new Tarea("Tarea 1");

        CreacionTarea creacionTarea = new CreacionTarea("Tarea 2");
        historial.ejecutar(creacionTarea);

        EdicionTarea edicionTarea = new EdicionTarea(tarea, "Tarea 1 editada");
        historial.ejecutar(edicionTarea);

        FinalizarTarea finalizarTarea = new FinalizarTarea(tarea);
        historial.ejecutar(finalizarTarea);

        historial.deshacer();
        historial.deshacer();
        historial.deshacer();
    }
}