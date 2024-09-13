package practice;

public class HillPattern {
    public static void main(String[] args) {
        for(int row = 1; row <= 5; row++) {
            for(int col = row; col <= 5; col++) {
                System.out.print("  ");
            }
            for(int col2 = 1; col2 < row; col2++) {
                System.out.print("* ");
            }
            for(int col3 = 1; col3 <= row; col3++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
