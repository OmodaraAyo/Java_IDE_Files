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
        assertEquals(0, account.getBalance());
    }
    @Test
    public void deposit2k_And_BalanceStill2k(){

        assertEquals(0, account.getBalance());
        account.deposit(2000);
        assertEquals(2000, account.getBalance());
    }
    @Test
    public void balance_At2k_depositMinus1000_Test(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance());
        account.deposit(-1000);
        assertEquals(2000, account.getBalance());
    }
    @Test
    public void withdraw2000_From_Account_Test(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance());
        account.withdraw(2000);
        assertEquals(0, account.getBalance());
    }
    @Test
    public void withdraw_Minus2k_From_Account_Test(){
        assertEquals(0, account.getBalance());
        account.withdraw(-2000);
        assertEquals(0, account.getBalance());
    }
    @Test
    public void withdraw_Amount_Greater_Than_Balance_Test(){
        assertEquals(0, account.getBalance());
        account.withdraw(2000);
        assertEquals(0, account.getBalance());
    }
}
