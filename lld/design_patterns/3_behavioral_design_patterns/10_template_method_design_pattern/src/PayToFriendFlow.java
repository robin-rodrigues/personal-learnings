public class PayToFriendFlow extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Validate logic of PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% fees charged");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the amount logic of PayToFriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the full amount of PayToFriend");
    }
}
