package exercise.duck;

/**
 * Created by alberto on 2014-08-29.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
