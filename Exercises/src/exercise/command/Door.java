package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class Door {

    private final String place;

    public Door() {
        this.place = "ignore";
    }

    public Door(String s) {
        this.place = s;
    }

    public void open(){
        System.out.println(place +" Opening Garage Door");
    }

    public void close(){
        System.out.println(place +" Closing Garage Door");
    }

    public void stop(){
        System.out.println(place +" Stopping the Garage Door");
    }
}
