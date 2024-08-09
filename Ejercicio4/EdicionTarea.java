/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diseno4;

public class EdicionTarea implements Comando {
    private Tarea tarea;
    private String nuevoNombre;

    public EdicionTarea(Tarea tarea, String nuevoNombre) {
        this.tarea = tarea;
        this.nuevoNombre = nuevoNombre;
    }

    @Override
    public void execute() {
        tarea.setNombre(nuevoNombre);
        System.out.println("Tarea editada: " + tarea.getNombre());
    }

    @Override
    public void undo() {
        System.out.println("Tarea restaurada: " + tarea.getNombre());
    }
}