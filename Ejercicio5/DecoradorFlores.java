/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;


public class DecoradorFlores implements DecoradorHabitacion {
    @Override
    public void decorar(Habitacion habitacion) {
        System.out.println("Agregando flores frescas a la habitación");
       
        habitacion.setPrecio(habitacion.getPrecio() + 20);
    }
}

