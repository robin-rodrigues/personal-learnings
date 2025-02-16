public interface VendingState {

    void insertCoin(VendingMachine product);

    void dispenseItem(VendingMachine product);
}
