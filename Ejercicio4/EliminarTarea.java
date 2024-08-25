/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

public class EliminarTarea implements Comando {
    private Tarea tarea;

    public EliminarTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void execute() {
        System.out.println("Tarea eliminada: " + tarea.getNombre());
    }

    @Override
    public void undo() {
        System.out.println("Tarea restaurada: " + tarea.getNombre());
    }
}
