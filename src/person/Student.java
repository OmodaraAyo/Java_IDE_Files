package person;

public class Student extends Persons {
    public enum student{
        FRESHMAN,
        SOPHOMORE,
        JUNIOR,
        SENIOR;
    }
    public Student(String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
    }
    private Object status;
    public void setStatus(Object status){
        if(status.equals(student.FRESHMAN) || status.equals(student.SOPHOMORE )|| status.equals(student.JUNIOR )|| status.equals(student.SENIOR)){
            this.status = status;
        }
    }
    public Object getStatus(){
        return status;
    }
}
