import adapter.WeightMachineAdapter;
import adapter.WeightMachineAdapterImpl;
import weight_machine.WeightMachine;

public class AdapterPatternApp {
    public static void main(String[] args) throws Exception {
        WeightMachine weightMachine = new WeightMachine(150.0);
        
        // This will return weight in pounds by default
        System.out.println("Weight in pounds: " + weightMachine.getWeight() + " lbs");   
        
        // Using the adapter to get weight in kilograms
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(weightMachine);
        System.out.println("Weight in kilograms: " + weightMachineAdapter.getWeightInKg() + " kg");
    }
}
