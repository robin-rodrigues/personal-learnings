public class VendingMachine {
    VendingState machineState;

    public VendingMachine() {
        this.machineState = new IdleState();  // Initialize with default state
    }

    public VendingState getMachineState() {
        return machineState;
    }

    public void setMachineState(VendingState machineState) {
        this.machineState = machineState;
    }

    // Delegating state-specific behavior to the current state
    public void insertCoin() {
        machineState.insertCoin(this);
    }

    public void dispenseItem() {
        machineState.dispenseItem(this);
    }
}