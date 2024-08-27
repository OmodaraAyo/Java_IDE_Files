package airconditioner;

public class AirConditioner {
    private boolean on, off;
    private int temperature = 16;

    public AirConditioner() {
        this.on = true;
        this.off = false;
    }
    public boolean setOn() {
        return on;
    }
    public boolean setOff(){
        return off;
    }
    public int getTemperature() {
        return temperature;
    }
    public void increaseTemperature(int temperature){
        boolean acIsturnOn = setOn();
        if(acIsturnOn) {
            this.temperature = this.temperature + temperature;
            if (this.temperature > 30) this.temperature = 30;
        }
    }
    public void decreaseTemperature(int temperature){
        boolean acIsturnOn = setOn();
        if(acIsturnOn) {
            this.temperature = this.temperature - temperature;
            if (this.temperature < 16) this.temperature = 16;
        }
    }
}
