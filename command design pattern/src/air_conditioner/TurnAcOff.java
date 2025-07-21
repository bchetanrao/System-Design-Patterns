package air_conditioner;
import interfaces.ICommand;

public class TurnAcOff implements ICommand {
    private AirConditioner airConditioner;

    public TurnAcOff(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }

    @Override
    public void undo() {
        airConditioner.turnOn();
    }

    @Override
    public void redo() {
        execute();
    }
    
}
