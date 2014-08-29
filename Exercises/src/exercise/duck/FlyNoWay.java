package exercise.duck;

/**
 * Created by alberto on 2014-08-29.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
