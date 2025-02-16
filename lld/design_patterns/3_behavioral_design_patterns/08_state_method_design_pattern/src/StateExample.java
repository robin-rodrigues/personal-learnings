public class StateExample {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println("Machine state: " + vendingMachine.getMachineState().getClass().getSimpleName());

        vendingMachine.insertCoin();
        System.out.println("Machine state: " + vendingMachine.getMachineState().getClass().getSimpleName());

        vendingMachine.dispenseItem();
        System.out.println("Machine state: " + vendingMachine.getMachineState().getClass().getSimpleName());
    }
}