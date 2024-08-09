/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diseno4;

public class CreacionTarea implements Comando {
    private Tarea tarea;

    public CreacionTarea(String nombre) {
        this.tarea = new Tarea(nombre);
    }

    @Override
    public void execute() {
        System.out.println("Tarea creada: " + tarea.getNombre());
    }

    @Override
    public void undo() {
        System.out.println("Tarea eliminada: " + tarea.getNombre());
    }
}
