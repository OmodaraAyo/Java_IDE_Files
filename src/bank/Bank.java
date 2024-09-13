package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();
    private int accountNumbers = 0;
    public Account createAccountfor(String firstName, String secondName, String pin) {
        Account newAccount = new Account(accountNumbers++, firstName, secondName, pin);
        accounts.add(newAccount);
        return newAccount;
    }
    public int countAccount() {
        return accounts.size();
    }
    public double balance(int accountNumber, String pin) {
        return accounts.get(accountNumber-1).balance(accountNumber, pin);
    }
    public void depositTo(int accountNumber, double amount) {
         accounts.get(accountNumber-1).deposit(amount);
    }
    public void withdrawFrom(int accountNumber, String pin, double amount){
        accounts.get(accountNumber-1).withdraw(accountNumber, pin, amount);
    }
    public void transfer(int senderAccountNumber, int receiversAccountNumber, double amount, String pin) {
        accounts.get(senderAccountNumber-1).balance(senderAccountNumber, pin);
        accounts.get(senderAccountNumber-1).withdraw(senderAccountNumber, pin, amount);
        accounts.get(receiversAccountNumber-1).deposit(amount);
    }
    public void changePin(int accountNumber, String oldPin, String newPin) {
        accounts.get(accountNumber-1).changepin(accountNumber,oldPin, newPin);
    }
    public boolean closeAccount(int accountNumber, String pin) {
        accounts.set(accountNumber-1, new Account(0, null, null, null));
        return true;
    }
}
