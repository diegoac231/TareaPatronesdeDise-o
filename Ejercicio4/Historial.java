/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Historial {
    private List<Comando> historial;

    public Historial() {
        this.historial = new ArrayList<>();
    }

    public void ejecutar(Comando command) {
        command.execute();
        historial.add(command);
    }

    public void deshacer() {
        if (!historial.isEmpty()) {
            Comando command = historial.remove(historial.size() - 1);
            command.undo();
        }
    }
}