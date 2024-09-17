package practice;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LetterTime {
    private static final Map<Integer, String> time =  new HashMap<>();

    static{
        time.put(0, "Zero");
        time.put(1, "One");
        time.put(2, "Two");
        time.put(3, "Three");
        time.put(4, "Four");
        time.put(5, "Five");
        time.put(6, "Six");
        time.put(7, "Seven");
        time.put(8, "Eight");
        time.put(9, "Nine");
        time.put(10, "Ten");
        time.put(11, "Eleven");
        time.put(12, "Twelve");
        time.put(13, "Thirteen");
        time.put(14, "Fourteen");
        time.put(15, "Fifteen");
        time.put(16, "Sixteen");
        time.put(17, "Seventeen");
        time.put(18, "Eighteen");
        time.put(19, "Nineteen");
        time.put(20, "Twenty");
        time.put(30, "Thirty");
        time.put(40, "Forty");
        time.put(50, "Fifty");
    }

    public String getLocalTime(){
            LocalTime time = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
            return time.format(formatter);
    }
    public String getElement(Integer element){
        return time.get(element);
    }

    public String getLetterTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("a");
        int hour = LocalTime.now().getHour();
        int minute = LocalTime.now().getMinute();
        int second = LocalTime.now().getSecond();
        String maker = LocalTime.now().format(formatter);
        return setHour(hour) + ":" + setMinute(minute) + ":" + setSeconds(second) + " " + maker ;
    }
    public String setHour(int hour){
        if(hour == 0){
            return zeros(hour);
        }
        if(hour > 20){
            return validateTime(hour);
        }
        else return time.get(hour);
    }
    public String setMinute(int minute){
        if(minute == 0){
            return zeros(minute);
        }
        if (minute > 20){
            return validateTime(minute);
        }
        else return time.get(minute);
    }
    public String setSeconds(int seconds) {
        if(seconds == 0){
            return time.get(seconds);
        }
        if(seconds > 20){
           return validateTime(seconds);
        }
        else return time.get(seconds);
    }
    public int getFirstIndex(int number){
        while(number > 10) {
            number /= 10;
        }
        return number * 10;
    }
    public String zeros(int value){
        return time.get(value) + time.get(value);
    }
    public String validateTime(int value){
        if(value == 30 || value == 40 || value == 50){
            return time.get(value);
        }
        else {
            int thisValue = getFirstIndex(value);
            String firstIndex = time.get(thisValue);
            int secondElement = value % 10;
            String secondIndex = time.get(secondElement);
            return firstIndex + secondIndex;
        }
    }
}
