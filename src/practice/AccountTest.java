package practice;
import java.util.Scanner;
public class AccountTest {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);

        Account accountName = new Account();

        System.out.print("Enter your name: ");
        String myName = input.nextLine();
        accountName.setName(myName);

        System.out.println();
        System.out.printf("Username: %s", accountName.getName());

    }
}
