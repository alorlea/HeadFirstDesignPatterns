package exercise.pizzastore.abstractFactory;

import exercise.pizzastore.pizzas.Pizza;


/**
 * Created by Alberto on 2014-12-27.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        abstractPizzaStore nyStore = new NYPizzaStore();
        abstractPizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
