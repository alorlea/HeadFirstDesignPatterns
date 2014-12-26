package exercise.starbuzz;

/**
 * Created by Alberto on 2014-12-26.
 */
public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaffeinated Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
