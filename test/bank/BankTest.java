package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void test_To_CreateAccount(){
        Bank bank = new Bank();
        Account firstAccount = bank.createAccountfor("John", "daniel", "1234");
        assertEquals(1, bank.countAccount());
        Account secondAccount = bank.createAccountfor("nike", "aragho", "4321");
        assertEquals(2, bank.countAccount());
        Account thirdAccount = bank.createAccountfor("David", "Akash", "4483");
        assertEquals(3, bank.countAccount());
    }
    @Test
    public void test_ToCheckAccount_Created_Balance(){
        Bank bank = new Bank();
        bank.findAccountWith(1,"1234" );
        assertEquals(0, bank.balance());
    }
}
