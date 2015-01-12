package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }
}
