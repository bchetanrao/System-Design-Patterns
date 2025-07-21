import controller.RemoteControl;
import devices.air_conditioner.AirConditioner;
import devices.air_conditioner.TurnAcOff;
import devices.air_conditioner.TurnAcOn;
import devices.television.Television;
import devices.television.TurnTvOff;
import devices.television.TurnTvOn;

public class App {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // Example usage of Command Design Pattern with AirConditioner
        System.out.println("Command Design Pattern Example For AirConditioner");
        AirConditioner ac1 = new AirConditioner("Hitachi");
        remote.setCommand(new TurnAcOn(ac1));
        remote.pressButton(); // Turns AC on
        remote.setCommand(new TurnAcOff(ac1));
        remote.pressButton(); // Turns AC off
        remote.pressUndo(); // Undo last command (turns AC on again)

        // Example usage of Command Design Pattern with Television
        System.out.println("\nCommand Design Pattern Example For Television");
        Television tv1 = new Television("Apple");
        remote.setCommand(new TurnTvOn(tv1));
        remote.pressButton(); // Turns TV on
        remote.setCommand(new TurnTvOff(tv1));
        remote.pressButton(); // Turns TV off
        remote.pressUndo(); // Undo last command (turns TV on again)
    }
}
