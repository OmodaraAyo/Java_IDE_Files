package javadietelpractice3;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print("");
        print("Welcome to NIKE Petrol STATION");
        print("");
        print("Enter quantity purchased in liters: ");
        int amount = scanner.nextInt();
        print("Enter price per liter: ");
        double pricePerLiter = scanner.nextDouble();
        //String formattedPricePerLiter = String.format("%.2f", pricePerLiter);
        print("Enter percentage discount: ");
        double percentageDiscount = scanner.nextDouble();
        PetrolPurchase petrolPurchase = new PetrolPurchase("Sabo", "Deisel", amount, pricePerLiter, percentageDiscount);
        print("");
        print(petrolPurchase.getData());
        petrolPurchase.setNetAmount(amount,pricePerLiter,percentageDiscount);
        System.out.printf("Net Amount: %.2f", petrolPurchase.getPurchaseAmount());
    }
    public static void print(Object input){
        System.out.println(input);
    }
}
