package Ejercicio3;

public class OrderDessert extends Pedido{

    String dessert;
    int price;
    @Override
    public void tomaPedido() {
        System.out.println("Toma pedido del postre");
        dessert = "Helado"; // Para el ejemplo solo hay una comida
    }

    @Override
    public void preparacion() {
        System.out.println("Preparando el postre");
    }

    @Override
    public boolean verificarDisponibilidad() {
        boolean disponibilidad = Math.random()<0.5; //Crear un boolean aleatorio
        return disponibilidad;
    }

    @Override
    public void calculoPrecios() {
        if ("Helado".equals(dessert)) {
            price = 5;
        }
    }
}
