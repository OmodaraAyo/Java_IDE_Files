package javascript;
import java.util.Arrays;
public class DescendingNumbersFromLastToFirst {
    public static int[] descendingOrder(int[] number) {
        int counter = 0;
        for (int index = number.length - 1; index >= 0; index--) {
            number[counter] = number[index];
            counter += 1;
        }
        return number;
    }

    public static void main(String[] args) {
        int[] number = {12, 3, 9, 6, 7};
        int[] output = descendingOrder(number);
        System.out.println(Arrays.toString(output));
    }
}
