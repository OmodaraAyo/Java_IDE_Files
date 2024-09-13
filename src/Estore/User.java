package Estore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<BillingInformation, ShoppingCart> shoppingCarts = new HashMap<>();
        userInformation(scanner);
    }
    private static void print(Object object){
        System.out.println(object);
    }
    private static void userInformation(Scanner scanner) {
        print("Enter names: ");
        String name = scanner.nextLine();
        print("Enter age: ");
        int age = scanner.nextInt();
        print("Enter phone number: ");
        String phone = scanner.next();
        print("Enter email: ");
        String email = scanner.next();
        print("Enter password: ");
        String password = scanner.next();
    }
}
