package exercise.pizzastore.abstractFactory;

import exercise.pizzastore.pizzas.Pizza;

public abstract class abstractPizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    //Concrete Factories need to implement this method
    protected abstract Pizza createPizza(String type);
}