package practice;
import java.util.Scanner;

public class Cart {
    private String name;
    public Cart(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void main (String...args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        Cart cart = new Cart(name);
        System.out.print(cart.getName());
    }
}
