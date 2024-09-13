package javadietelpractice3;

public class Car {
    private String model;
    private String year;
    private String price;
    private static int numberOfCars = 0;

    public Car(String model, String year, double price){
        numberOfCars++;
    }
    public static int getNumberOfCars() {
        return numberOfCars;
    }
    public void setModel(String model){
            this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }
    public void setPrice(double price){
        if(price > 0 && numberOfCars == 1) {
                double discount = 0.05;
                double actual = price * discount;
                this.price = String.format("%.2f",actual);
        }else
        if(price > 0 && numberOfCars > 1) {
            double discount = 0.07;
            double actual = price * discount;
            this.price = String.format("%.2f",actual);
        }else
        if(price <= 0){
            this.price = "0.00";
        }
    }
    public String getPrice(){
        return price;
    }
}
