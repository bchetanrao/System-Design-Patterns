package controller;
import command.ICommand;

public class RemoteControl {
    private ICommand command;

    public RemoteControl() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }

    public void pressRedo() {
        command.redo();
    }
}