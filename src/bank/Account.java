package bank;

public class Account {
    private int balance;

    public Account(int accountNumber, String firstName, String secondName,String pin){
        this.balance = 0;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amount){
        if (amount > 0) balance = balance + amount;
    }
    public void withdraw(int amount){
        if(amount > 0 && amount <= balance) balance = amount - balance;
    }
}
