public abstract class PaymentFlow {

    public abstract void validateRequest();

    public abstract void calculateFees();

    public abstract void debitAmount();

    public abstract void creditAmount();

    // this is Template method: which defines the order of steps to execute the task.
    public final void sendMoney() {

        // step 1
        validateRequest();

        // step 2
        calculateFees();

        // step 3
        debitAmount();

        // step 4
        creditAmount();
    }

}