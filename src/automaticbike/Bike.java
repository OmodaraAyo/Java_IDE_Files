package automaticbike;

public class Bike {
    private boolean isOn = false;
    private int gear = 0;
    private double acceleration;
    private double decceleration;

    public Bike(){
    }
    public boolean turnOn(){
        isOn = true;
        return isOn;
    }
    public boolean turnOff(){
        return isOn;
    }
    public void accelerate(int gear, double speed){
        isOn = true;
        boolean bikeIsOn = isOn;
        if(bikeIsOn){
            if(speed > 0 && speed <= 20) {
                gear = 1;
                acceleration = speed + gear;
            }
            else if(speed > 20 && speed <= 30) {
                gear = 2;
                acceleration = speed + gear;
            }
            else if(speed > 30 && speed <= 40) {
                gear = 3;
                acceleration = speed + gear;
            }
            else if (speed > 40) {
                gear = 4;
                acceleration = speed + gear;
            }
        }
        else{
            isOn = false;
        }

    }
    public double accelerate(){
        return acceleration;
    }
    public void deccelerate(int gear, double speed){
        boolean bikeIsOn = isOn;
        if(bikeIsOn && speed > 0 && speed <= 20 ) {
            gear = 1;
            decceleration = speed - gear;
        }
        else if(bikeIsOn && speed > 20 && speed <= 30) {
            gear = 2;
            decceleration = speed - gear;
        }
        else if(bikeIsOn && speed > 30 && speed <= 40) {
            gear = 3;
            decceleration = speed - gear;
        }
        else if(bikeIsOn && speed > 40){
            gear = 4;
            decceleration = speed - gear;
        }
    }
    public double deccelerate(){
        return decceleration;
    }
}
