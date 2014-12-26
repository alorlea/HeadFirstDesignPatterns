package exercise.starbuzz;

/**
 * Created by Alberto on 2014-12-26.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Darkroasted Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
