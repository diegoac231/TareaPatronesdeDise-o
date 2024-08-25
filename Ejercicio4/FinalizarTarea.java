/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

public class FinalizarTarea implements Comando {
    private Tarea tarea;

    public FinalizarTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void execute() {
        tarea.completar();
        System.out.println("Tarea completada: " + tarea.getNombre());
    }

    @Override
    public void undo() {
        tarea.descompletar();
        System.out.println("Tarea descompletada: " + tarea.getNombre());
    }
}