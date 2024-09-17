package practice;

import java.util.Scanner;

public class LetterTimeApp {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        LetterTime clock = new LetterTime();
        System.out.println("What is your name ? ");
        String name = scanner.nextLine();
        String numberTime = clock.getLocalTime();
        String LetterTime = clock.getLetterTime();
        System.out.println("\nHello '"+ name +"' The Time is... \n\n"+ numberTime + "\n\n" +LetterTime);
    }
}
