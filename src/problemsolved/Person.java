package problemsolved;

import java.util.ArrayList;
import java.util.List;

public class Person {
    List<Problems> problemsList = new ArrayList<Problems>();
    boolean person = false;
    String name;
    public boolean exist(){
       return person = true;
    }
    public void hasName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
