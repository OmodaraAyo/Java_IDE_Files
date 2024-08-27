package lagbajaschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsGrade {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many student do you have: ");
        int studentNumber = input.nextInt();

        System.out.print("How many subject do they offer: ");
        int subjectNumber = input.nextInt();

        List<Grades> student = new ArrayList<>();

        for(int studentCounter = 1; studentCounter < studentNumber + 1; studentCounter++){
            int sum = 0;
            System.out.printf("\nStudent %d%n", studentCounter);
            List<Integer> scores = new ArrayList<>();
            for(int subjectCounter = 1; subjectCounter < subjectNumber+1; subjectCounter++){
                    System.out.printf("Enter Score for Subject %d: ", subjectCounter);
                    int score = input.nextInt();
                    scores.add(score);
            }
            Grades grade = new Grades("Student" + (studentCounter), (ArrayList<Integer>)scores);
            student.add(grade);
        }
        for(Grades studentDatas : student) {
            System.out.printf("\n%s\n", studentDatas);
        }
    }
}
