public class IdleState implements VendingState {

    @Override
    public void insertCoin(VendingMachine product) {
        System.out.println("Coin Inserted");
        product.setMachineState(new WorkingState()); // Transition to WorkingState
    }

    @Override
    public void dispenseItem(VendingMachine product) {
        System.out.println("Insert a coin first!");
    }
}