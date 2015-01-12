package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class StereoOffCommand implements Command{

    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
