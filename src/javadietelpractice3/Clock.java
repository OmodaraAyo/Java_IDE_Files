package javadietelpractice3;

public class Clock {
    private int hour;
    private int minute;
    private int seconds;
    public static String time;

    public void setTime(int hour, int minute, int seconds) {
        if(hour >= 0 && hour <=23 && minute >= 0 && minute <=59 && seconds >= 0 && seconds <=59){
           this.hour = hour++;
           this.minute = minute++;
           this.seconds = seconds++;
        }else
        if(hour > 23 && minute > 59 && seconds > 59){
            int newHour = 0;
            int newMinute = 00;
            int newSeconds = 0;
            this.hour = newHour;
            this.minute = newMinute;
            this.seconds = newSeconds;
        }
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return seconds;
    }
    public String getTime(){
        String newHour = String.valueOf(hour);
        String newMinute = String.valueOf(minute);
        String newSeconds = String.valueOf(seconds);
        return time = newHour + ":" + newMinute + ":" + newSeconds;
    }
}
