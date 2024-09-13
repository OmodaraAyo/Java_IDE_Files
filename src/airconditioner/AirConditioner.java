package airconditioner;

public class AirConditioner {
    private boolean on = false;
    private int minimumTemperature = 16;
    private int maximumTemperature = 30;

    public AirConditioner() {
    }
    public boolean setOn() {
        on = true;
        return on;
    }
    public boolean setOff(){
        return false;
    }
    public int getMinimumTemperature() {
        return minimumTemperature;
    }
    public void increaseTemperature(int temperature){
        boolean acIsturnOn = setOn();
        if(acIsturnOn) {
            this.minimumTemperature = this.minimumTemperature + temperature;
            if (this.minimumTemperature > maximumTemperature) this.minimumTemperature = maximumTemperature;
        }
    }
    public void decreaseTemperature(int temperature){
        boolean acIsturnOn = setOn();
        if(acIsturnOn) {
            this.minimumTemperature = this.minimumTemperature - temperature;
            if (this.minimumTemperature < 16) this.minimumTemperature = 16;
        }
    }
}
