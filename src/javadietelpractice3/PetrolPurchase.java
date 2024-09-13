package javadietelpractice3;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double price;
    private double discount;
    private double netAmount;

    public PetrolPurchase(String location, String petrolType, int quantity, double price, double discount) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }
    public void setLocation() {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public void setPetrolType() {
        this.petrolType = petrolType;
    }
    public String getPetrolType() {
        return petrolType;
    }
    public void setQuantity() {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setPrice() {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setDiscount() {
        this.discount = discount / 100;
    }
    public double getDiscount() {
        return discount;
    }
    public void setNetAmount(int quantity, double price, double discount) {
        this.netAmount = (quantity * price) - discount;
    }
    public double getPurchaseAmount() {
        return netAmount;
    }
    public String getData (){
        return ("Location: " +location+ "\nPetrol type: "+ petrolType+ "\nQuantity: " +quantity+ "\nPrice: "+price+"\nDiscount: "+discount);
    }
}
