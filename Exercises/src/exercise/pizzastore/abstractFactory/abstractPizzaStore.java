public abstract class AbstractPizzaStore{

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
    abstract Pizza createPizza(String type);
}