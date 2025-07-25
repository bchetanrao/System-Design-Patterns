package devices.television;

public class TurnTvOff implements command.ICommand {
    private Television television;

    public TurnTvOff(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }

    @Override
    public void undo() {
        television.turnOn();
    }

    @Override
    public void redo() {
        execute();
    }
    
}
