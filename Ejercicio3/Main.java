package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        OrderFood orden1 = new OrderFood();
        OrderBeverage orden2 = new OrderBeverage();
        OrderDessert orden3 = new OrderDessert();

        orden1.tomaPedido();
        orden2.tomaPedido();
        orden3.tomaPedido();

        orden1.preparacion();
    }
}
