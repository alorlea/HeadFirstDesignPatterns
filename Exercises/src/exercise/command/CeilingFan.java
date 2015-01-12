package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class CeilingFan {
    private final String place;

    public CeilingFan(String s) {
        this.place = s;
    }

    public void on(){
        System.out.println(place + "fan is on ");
    }

    public void off(){
        System.out.println(place + "fan is off");
    }
}
