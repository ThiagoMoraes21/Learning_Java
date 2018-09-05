package person.account;

public class Account {
    private String name, emailAddress;
    private double creditLimit;

    public Account() {
        this("Default name", "default@gmail.com", 50000 );
    }

    public Account(String name, double creditLimit) {
        this(name, "unknown@gmail.com", creditLimit);
    }

    public Account(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
