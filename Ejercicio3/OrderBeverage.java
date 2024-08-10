package Ejercicio3;

public class OrderBeverage extends Pedido{

    String beverage;
    int price;
    @Override
    public void tomaPedido() {
        System.out.println("Toma pedido de la bebida");
        beverage = "Helado"; // Para el ejemplo solo hay una comida
    }

    @Override
    public void preparacion() {
        System.out.println("Preparando la bebida");
    }

    @Override
    public boolean verificarDisponibilidad() {
        boolean disponibilidad = Math.random()<0.5; //Crear un boolean aleatorio
        return disponibilidad;
    }

    @Override
    public void calculoPrecios() {
        if ("Helado".equals(beverage)) {
            price = 2;
        }
    }
}
