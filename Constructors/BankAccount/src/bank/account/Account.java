package bank.account;

public class Account {
    private double balance;
    private int number, costumerPhoneNum;
    private String costumerName, costumerEmail;

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is: " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance: " + this.balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCostumerPhoneNum() {
        return costumerPhoneNum;
    }

    public void setCostumerPhoneNum(int costumerPhoneNum) {
        this.costumerPhoneNum = costumerPhoneNum;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getCostumerEmail() {
        return costumerEmail;
    }

    public void setCostumerEmail(String costumerEmail) {
        this.costumerEmail = costumerEmail;
    }
}
