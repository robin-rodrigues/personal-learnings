public class WorkingState implements VendingState {

    @Override
    public void insertCoin(VendingMachine product) {
        System.out.println("Already processing an item. Wait for dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine product) {
        System.out.println("Product dispensed");
        product.setMachineState(new IdleState());  // Transition back to IdleState
    }
}