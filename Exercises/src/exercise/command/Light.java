package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class Light {

    private final String place;

    public Light() {
        this.place = "ignore";
    }

    public Light(String s) {
        this.place = s;
    }

    public void on(){
        System.out.println(place+" Light is on");
    }

    public void off(){
        System.out.println(place+" Light is off");
    }
}
