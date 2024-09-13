package javascript;
import java.util.Arrays;

public class Getter {
    public static int [] descendingOrder(int [] number){
        for(int index = 0; index < number.length; index++){
            int first = number[index];
            for(int counter = index + 1; counter < number.length; counter++){
                if(number[counter] > number[index]){
                    number[index] = number[counter];
                    number[counter] = first;
                }
            }
        }
        return number;
    }
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5};
        int [] output = descendingOrder(number);
        System.out.println(Arrays.toString(output));
    }
}



