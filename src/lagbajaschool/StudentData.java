package lagbajaschool;

import java.util.List;
import java.util.ArrayList;
public class StudentData {
    public List students;
    public StudentData(){
        students = new ArrayList();
    }
    public void addStudent(String studentNumber, ArrayList<Integer> score){
        Grades studentGrade = new Grades(studentNumber, score);
        students.add(studentGrade);
    }
}
