public class TemplateExample {
    public static void main(String[] args) {
        PaymentFlow payToFriend = new PayToFriendFlow();
        payToFriend.sendMoney();

        PaymentFlow payToMerchant = new PayToMerchantFlow();
        payToMerchant.sendMoney();
    }
}