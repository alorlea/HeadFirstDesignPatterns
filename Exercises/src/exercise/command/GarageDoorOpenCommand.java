package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class GarageDoorOpenCommand implements Command {
    Door door;

    public GarageDoorOpenCommand() {
    }

    public GarageDoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
