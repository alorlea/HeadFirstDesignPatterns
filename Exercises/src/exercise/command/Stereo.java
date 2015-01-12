package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class Stereo {
    private final String place;
    private int volume;

    public Stereo(String s) {
        this.place = s;
    }

    public void on() {
        System.out.println(place + " Stereo on");
    }

    public void setCD() {
        System.out.println(place + " Stereo set the music");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void off() {
        System.out.println(place + " Stereo turning off");
    }
}
