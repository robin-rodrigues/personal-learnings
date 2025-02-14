public class AdapterMethodExample {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println("Weight in KGs is: " + weightMachineAdapter.getWeightInKg());
    }
}