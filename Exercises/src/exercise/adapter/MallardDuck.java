package exercise.adapter;


/**
 * Created by Alberto on 2015-01-13.
 */
public class MallardDuck implements DuckInterface {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
