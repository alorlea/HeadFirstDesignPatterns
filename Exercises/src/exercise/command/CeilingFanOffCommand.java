package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class CeilingFanOffCommand implements Command{

    private final CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
