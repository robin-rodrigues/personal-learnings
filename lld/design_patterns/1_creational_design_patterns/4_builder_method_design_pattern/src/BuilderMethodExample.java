public class BuilderMethodExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount.BankAccountBuilder("John Doe", "12345678")
                .withEmail("john.doe@example.com")
                .wantNewsLetter(true)
                .build();

        System.out.println("Name: " + account.getName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Subscribed to Newsletter: " + account.isNewsLetter());
    }
}