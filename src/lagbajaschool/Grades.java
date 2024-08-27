package lagbajaschool;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    public String student;
    public List score;
    public Grades(String student, ArrayList<Integer> score){
        this.student = student;
        this.score = score;
    }
    public String getStudent() {
        return student;
    }
    public String toString(){
        return student + " " +score;
    }
}
