package exercise.starbuzz;

/**
 * Created by Alberto on 2014-12-26.
 */
public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
