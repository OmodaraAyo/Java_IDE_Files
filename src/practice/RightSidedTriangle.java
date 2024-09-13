package practice;

public class RightSidedTriangle {
    public static void main(String[] args) {
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for(int star = row; star <= 5; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
