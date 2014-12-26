package exercise.starbuzz;

/**
 * Created by Alberto on 2014-12-26.
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "HouseBlendCoffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
