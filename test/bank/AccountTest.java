package bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account account;
    @BeforeEach
    public void startAllTestWithThis(){
        account = new Account(1,"John", "Daniel","3344");
    }
    @Test
    public void newAccount_balance() {
        assertEquals(0,  account.balance(1,"3344"));
    }
    @Test
    public void deposit2k_And_BalanceStill2k(){
        assertEquals(0, account.balance(1,"3344"));
        account.deposit(2000);
        assertEquals(2000, account.balance(1,"3344"));
    }
    @Test
    public void balance_At2k_depositMinus1000_Test(){
        account.deposit(2000);
        assertEquals(2000,  account.balance(1,"3344"));
        account.deposit(-1000);
        assertEquals(2000, account.balance(1,"3344"));
    }
    @Test
    public void withdraw2000_From_Account_Test(){
        account.deposit(2000);
        assertEquals(2000,  account.balance(1,"3344"));
        account.withdraw(1,"3344",2000);
        assertEquals(0, account.balance(1,"3344"));
    }
    @Test
    public void withdraw_Minus2k_From_Account_Test(){
        assertEquals(0, account.balance(1,"3344"));
        account.withdraw(1,"3344",-2000);
        assertEquals(0, account.balance(1,"3344"));
    }
    @Test
    public void withdraw_Amount_Greater_Than_Balance_Test(){
        assertEquals(0, account.balance(1,"3344"));
        account.withdraw(1,"3344", 2000);
        assertEquals(0, account.balance(1,"3344"));
    }
    @Test
    public void test_ToCheckBalance_If_Pin_IsCorrect(){
        assertEquals(0, account.balance(1,"3344"));
        account.deposit(2000);
        assertEquals(2000, account.balance(1,"3344"));
    }
    @Test
    public void test_ToCheckBalance_If_Pin_IsNotCorrect(){
        account.deposit(2000);
        assertEquals(0, account.balance(1,"4562"));
    }
    @Test
    public void test_To_Withdraw_With_IncorrectPin(){
        account.deposit(2000);
        assertEquals(2000, account.balance(1,"3344"));
        account.withdraw(1,"3434",2000);
        assertEquals(2000, account.balance(1,"3344"));
    }
    @Test
    public void test_ToChangePin_AndCheckBalance_With_NewPin(){
        account.changepin(1,"3344", "5678");
        assertEquals("5678", account.newPin());
        account.deposit(2000);
        assertEquals(2000, account.balance(1,"5678"));
    }
    @Test
    public void test_ToChangePin_AndCheckBalance_With_OldPin(){
        account.deposit(2000);
        account.changepin(1,"3344", "5678");
        assertEquals("5678", account.newPin());
        assertEquals(0, account.balance(1,"3344"));
    }
//    @Test
//    public void test_To_Transfer_ToAnotherAccount(){
//        account.deposit(2000);
//        assertEquals(2000, account.getBalance(1,"3344"));
//        Account secondAccount = new Account(2,"John", "Daniel","1234");
//        account.transfer(1,2, 500,"3344");
//        assertEquals(1500, account.getBalance(1,"3344"));
//        assertEquals(1500, secondAccount.getBalance(2,"1234"));
//    }
}
