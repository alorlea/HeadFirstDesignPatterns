package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class GarageDoorUpCommand implements Command{

    private final Door garageDoor;

    public GarageDoorUpCommand(Door garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }
}
