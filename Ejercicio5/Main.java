
package com.mycompany.diseno5;

public class Main {
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion("Suite", 200);
        DecoracionGeneral habitacionDecorada = new DecoracionGeneral(habitacion);

        habitacionDecorada.agregarDecorador(new DecoradorFlores());
        habitacionDecorada.agregarDecorador(new DecoradorChocolate());
        habitacionDecorada.agregarDecorador(new DecoradorVino());

        habitacionDecorada.decorar();

        System.out.println("Habitación decorada: " + habitacionDecorada.getHabitacion().getTipo());
        System.out.println("Precio total: " + habitacionDecorada.getHabitacion().getPrecio());
    }
}
