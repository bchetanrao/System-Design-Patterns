package adapter;

import weight_machine.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        return weightMachine.getWeight() * 0.453592; // Convert pounds to kilograms
    }
    
}
