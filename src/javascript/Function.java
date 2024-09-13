package javascript;
import java.util.Arrays;
public class Function {

public static void main(String [] args){
   int [] number = {5,3,6,9,8};
   int [] newNumber = largestAndSmallestNumber(number);
   System.out.println(Arrays.toString(newNumber));
}
   public static int [] largestAndSmallestNumber(int [] number){
      int minimum = number[0];
      int maximum = number[0];
      int [] newNumber = new int[2];
      for(int count = 0; count < number.length; count++){
         if(number[count] < minimum) minimum = number[count];
         if(number[count] > maximum) maximum = number[count];
      }
      newNumber[0] = minimum;
      newNumber[1] = maximum;
      return newNumber;
   }
}