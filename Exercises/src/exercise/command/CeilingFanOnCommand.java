package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class CeilingFanOnCommand implements Command {

    private final CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }
}
