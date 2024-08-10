package Ejercicio3;

public class OrderFood extends Pedido{

    String food;
    int price;
    @Override
    public void tomaPedido() {
        System.out.println("Toma pedido de la comida");
        food = "Carne"; // Para el ejemplo solo hay una comida
    }

    @Override
    public void preparacion() {
        System.out.println("Preparando la comida");
    }

    @Override
    public boolean verificarDisponibilidad() {
        boolean disponibilidad = Math.random()<0.5; //Crear un boolean aleatorio
        return disponibilidad;
    }

    @Override
    public void calculoPrecios() {
        if ("Carne".equals(food)){
            price = 50;
        }
    }
}
