public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;
    private boolean newsLetter;

    private BankAccount(BankAccountBuilder builder) {
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.email = builder.email;
        this.newsLetter = builder.newsLetter;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean isNewsLetter() {
        return newsLetter;
    }

    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsLetter;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsLetter(boolean newsLetter) {
            this.newsLetter = newsLetter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
