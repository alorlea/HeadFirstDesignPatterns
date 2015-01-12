package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new Door());
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
