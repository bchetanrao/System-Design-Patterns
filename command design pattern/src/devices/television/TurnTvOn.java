package devices.television;

public class TurnTvOn implements command.ICommand {
    private Television television;

    public TurnTvOn(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }

    @Override
    public void undo() {
        television.turnOff();
    }

    @Override
    public void redo() {
        execute();
    }
    
}
