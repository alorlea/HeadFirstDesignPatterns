package exercise.command;

/**
 * Created by Alberto on 2015-01-12.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public SimpleRemoteControl(Command slot) {
        this.slot = slot;
    }

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
