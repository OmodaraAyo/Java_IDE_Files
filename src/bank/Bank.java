package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List accounts = new ArrayList();
    public Account createAccountfor(String firstName, String secondName, String pin) {
        return new Account(accounts.size()+1, firstName, secondName, pin);
    }
    public int countAccount() {
        return accounts.size()+1;
    }
    public void findAccountWith(int accountNumber, String pin) {
        Account account = (Account) accounts.get(accountNumber);
        account.getBalance();
    }
    public int balance() {
        return balance;
    }
}
