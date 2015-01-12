package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class GarageDoorDownCommand implements Command{

    private final Door garageDoor;

    public GarageDoorDownCommand(Door garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }
}
