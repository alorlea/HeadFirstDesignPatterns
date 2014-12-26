package exercise.starbuzz;

/**
 * Created by Alberto on 2014-12-26.
 */
public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }
}
