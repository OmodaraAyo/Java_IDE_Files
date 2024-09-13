package enumtasks;

import java.util.Scanner;

public class GeopoliticalZonesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Geopolitical Zone: ");
        String name = scanner.nextLine().toUpperCase();
        String zone = name.replaceAll(" ", "");
        try{
            GeopoliticalZones zones = GeopoliticalZones.valueOf(zone);
            System.out.println(zones.getDescription());
        }catch(Exception exception){
            System.out.println("Invalid Geopolitical Zone");
        }
    }
}
