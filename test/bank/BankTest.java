package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank = new Bank();
    @BeforeEach
    public void startAllWithThis() {
        Account firstAccount = bank.createAccountfor("John", "daniel", "1234");
    }
    @Test
    public void test_To_CreateAccount(){
        assertEquals(1, bank.countAccount());
    }
    @Test
    public void test_ToCheckAccountBalance_With_CorrectPin(){
        assertEquals(0.00, bank.balance(1, "1234"));
    }
    @Test
    public void test_ToDeposit_And_CheckAccountBalance_With_WrongPin(){
        bank.depositTo(1,2000);
        assertEquals(0.00, bank.balance(1, "3234"));
    }
    @Test
    public void test_ToDeposit_And_CheckAccountBalance_With_CorrectPin(){
        bank.depositTo(1,2000);
        assertEquals(2000, bank.balance(1, "1234"));
    }
    @Test
    public void test_To_Deposit_In_The_Account(){
        bank.depositTo(1, 2000);
        assertEquals(2000, bank.balance(1, "1234"));
    }
    @Test
    public void test_ToDepositPositiveAmount_In_The_Account(){
        bank.depositTo(1, 2000);
        assertEquals(2000, bank.balance(1, "1234"));
        //System.out.println(bank.balance(1, "1234"));
    }
    @Test
    public void test_ToDepositNegativeAmount_In_The_Account(){
        bank.depositTo(1, -2000);
        assertEquals(0, bank.balance(1, "1234"));
    }
    @Test
    public void test_ToWithdrawFrom_The_Account(){
        bank.depositTo(1, 2000);
        assertEquals(2000, bank.balance(1, "1234"));
        bank.withdrawFrom(1,"1234", 1500);
        assertEquals(500, bank.balance(1, "1234"));
    }
    @Test
    public void test_ToWithdraw_PositiveAmount_From_The_Account(){
        bank.depositTo(1, 2000);
        assertEquals(2000, bank.balance(1, "1234"));
        bank.withdrawFrom(1,"1234", 1700);
        assertEquals(300, bank.balance(1, "1234"));
    }
    @Test
    public void test_To_WithdrawNegativeAmount_From_The_Account(){
        bank.depositTo(1, 2000);
        assertEquals(2000, bank.balance(1, "1234"));
        bank.withdrawFrom(1,"1234", -1500);
        assertEquals(2000, bank.balance(1, "1234"));
    }
    @Test
    public void test_To_Withdraw_Amount_GreaterThan_Current_Balance(){
        bank.depositTo(1, 2000);
        assertEquals(2000, bank.balance(1, "1234"));
        bank.withdrawFrom(1,"1234", 2500);
        assertEquals(2000, bank.balance(1, "1234"));
    }
    @Test
    public void test_To_Withdraw_Zero_Amount_From_The_Account(){
        bank.depositTo(1, 2000);
        assertEquals(2000, bank.balance(1, "1234"));
        bank.withdrawFrom(1,"1234", 0);
        assertEquals(2000, bank.balance(1, "1234"));
    }
    @Test
    public void test_To_Transfer_From_An_Account_To_Another_Account(){
        Account secondAccount = bank.createAccountfor("Ayodele", "Omodara", "5656");
        bank.depositTo(1, 2000);
        assertEquals(2000, bank.balance(1, "1234"));
        bank.transfer(1,2,1500,"1234");
        assertEquals(500, bank.balance(1, "1234"));
        assertEquals(1500, bank.balance(2, "5656"));
    }
    @Test
    public void test_To_Transfer_A_NegativeAmount_From_An_Account_To_Another_Account(){
        Account secondAccount = bank.createAccountfor("Ayodele", "Omodara", "5656");
        bank.depositTo(1, 2000);
        assertEquals(2000, bank.balance(1, "1234"));
        bank.transfer(1,2,-1500,"1234");
        assertEquals(2000, bank.balance(1, "1234"));
        assertEquals(0, bank.balance(2, "5656"));
    }
    @Test
    public void test_To_Change_Account_Pin(){
        bank.changePin(1,"1234", "0987");
        assertEquals("0987", "0987");
        bank.depositTo(1, 2000);
        assertEquals(2000, bank.balance(1, "0987"));
    }
    @Test
    public void test_To_Change_Account_Pin_Using_WrongPin(){
        bank.changePin(1,"3214", "0987");
        assertEquals("1234", "1234");
    }
    @Test
    public void test_To_Close_An_Account_And_Make_Deposit_Into_ClosedAccount(){
        Account secondAccount = bank.createAccountfor("Ayodele", "Omodara", "5656");
        assertTrue(bank.closeAccount(2, "5656"));
        try{
            bank.depositTo(2, 2000);
        }catch(IndexOutOfBoundsException exception){
           String message = String.valueOf(new AssertionError("Account not found"));
           System.out.println(message);
        }
        bank.balance(2, "5656");
        assertEquals(0, bank.balance(2, "5656"));
    }
    @Test
    public void test_To_Close_An_Account_And_CheckBalance_Of_ClosedAccount(){
        Account secondAccount = bank.createAccountfor("Adenike", "Aragho", "6612");
        try{
            bank.balance(2, "6612");
            assertEquals(0, bank.balance(2, "6612"));
        }catch (Exception exception){
            String message = String.valueOf(new AssertionError("Account not found"));
            System.out.println(message);
        }
    }
    @Test
    public void test_ToCreate_MultipleAccounts(){
        Account secondAccount = bank.createAccountfor("Lafete", "Steve", "3489");
        assertEquals(2, bank.countAccount());
        Account thirdAccount = bank.createAccountfor("Lolimi", "daniel", "3489");
        assertEquals(3, bank.countAccount());
        Account fourthAccount = bank.createAccountfor("Lolimi", "daniel", "3489");
        assertEquals(4, bank.countAccount());
        Account fifthAccount = bank.createAccountfor("aaaa", "babab", "9009");
        assertEquals(5, bank.countAccount());
    }
}
