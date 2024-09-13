package bank;
import java.util.Scanner;
import bank.Bank;
public class BankAtm {
    private static Bank bank = new Bank();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print(HomeScreen());
        int option = 0;
        try {
            option = Integer.parseInt(scanner.next());
        } catch (Exception exception) {
            print("Wrong input! Options within 1-8 only!!!\n");
            main(args);
        }
    while (option != 8) {
            switch (option) {
                case 1:
                    createNewAccount(scanner);
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    transfer(scanner);
                    break;
                case 5:
                    checkBalance(scanner);
                    break;
                case 6:
                    changePin(scanner);
                    break;
                case 7:
                    closeAccount(scanner);
                    break;
                case 8:
                    break;
                default:
                    print("Wrong input! Options within 1-8 only!!!");
                    break;
            }
            print(HomeScreen());
            option = Integer.parseInt(scanner.next());
        }
        scanner.close();
    }
    private static void print(Object input) {
        System.out.println(input);
    }

    public static String HomeScreen() {
        String onStartUp = """
                ------> Welcome to the GtBank Atm!
                -> 1. Create Account
                -> 2. Deposit
                -> 3. Withdraw
                -> 4. Transfer
                -> 5. Check Balance
                -> 6. Change pin
                -> 7. Close Account
                -> 8. Exit
                """;
        return onStartUp;
    }

    public static void createNewAccount(Scanner scanner) {
        print("FirstName: ");
        String firstName = scanner.next();
        print("LastName: ");
        String lastName = scanner.next();
        print("Pin: ");
        String pin = scanner.next();
        bank.createAccountfor(firstName, lastName, pin);
        print("Account created successfully!");
    }

    public static void deposit(Scanner scanner) {
        print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        bank.depositTo(accountNumber, amount);
        print("Deposit successfully!");
    }

    public static void withdraw(Scanner scanner) {
        print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        print("Enter pin: ");
        String pin = scanner.next();
        bank.withdrawFrom(accountNumber, pin, amount);
        print("Withdraw successfully!");
    }

    public static void transfer(Scanner scanner) {
        print("Enter your account number: ");
        int senderAccountNumber = scanner.nextInt();
        print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        print("Receiver account number: ");
        int receiverAccountNumber = scanner.nextInt();
        print("Pin: ");
        String pin = scanner.next();
        bank.transfer(senderAccountNumber, receiverAccountNumber, amount, pin);
        print("Transfer successfully!");
    }

    public static void checkBalance(Scanner scanner) {
        print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        print("Enter pin: ");
        String pin = scanner.next();
        double accountBalance = bank.balance(accountNumber, pin);
        print("Account Balance: " + accountBalance);
    }

    public static void changePin(Scanner scanner) {
        print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        print("Enter oldPin: ");
        String oldPin = scanner.next();
        print("Enter newPin: ");
        String newPin = scanner.next();
        bank.changePin(accountNumber, oldPin, newPin);
        print("Change pin successfully!");
    }

    public static void closeAccount(Scanner scanner) {
        print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        print("Enter pin: ");
        String pin = scanner.next();
        bank.closeAccount(accountNumber, pin);
        print("Account closed!");
    }
}