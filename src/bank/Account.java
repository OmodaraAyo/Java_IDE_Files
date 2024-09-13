package bank;
public class Account {
    private String firstName;
    private String lastName;
    private String pin;
    private double balance;

    public Account(int accountNumber, String firstName, String secondName,String pin){
        this.firstName = firstName;
        this.lastName = secondName;
        this.pin = pin;
        this.balance = 0;
    }
    public double balance(int accountNumber, String pin) {
        boolean pinIsCorrect = pin.equals(this.pin);
        if(pinIsCorrect)return this.balance = this.balance;
        else return 0;
    }
    public double getBalance() {
        return this.balance;
    }
    public void deposit(double amount){
        if (amount > 0) balance = balance + amount;
    }
    public void withdraw(int accountNumber, String pin, double amount){
        boolean pinIsCorrect = pin.equals(this.pin);
        boolean amountLessThanOrEqualsBalance = amount <= balance;
        boolean amountIsValid = amount > 0;
        if(pinIsCorrect  && amountLessThanOrEqualsBalance && amountIsValid) balance = balance - amount;
        else balance = balance;
    }
    public void changepin(int accountNumber, String oldPin, String newPin) {
        if(oldPin.equals(this.pin)) this.pin = newPin;
    }
    public String newPin(){
        return pin;
    }
    public void closeAccount(int accountNumber, String pin){
        if(pin.equals(this.pin))
            accountNumber = 0;
            this.pin = null;
            this.balance = balance;
    }
}

