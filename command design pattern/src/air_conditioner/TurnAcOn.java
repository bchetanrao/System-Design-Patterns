package air_conditioner;
import interfaces.ICommand;

public class TurnAcOn implements ICommand {
    private AirConditioner airConditioner;

    public TurnAcOn(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }

    @Override
    public void undo() {
        airConditioner.turnOff();
    }

    @Override
    public void redo() {
        execute();
    }
    
}
