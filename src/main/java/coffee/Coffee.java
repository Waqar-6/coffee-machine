package coffee;

public class Coffee {
    private String name;
    private int waterRequired;
    private int milkRequired;
    private int coffeeBeansRequired;
    private double price;

    public Coffee (String name, int waterRequired, int milkRequired, int coffeeBeansRequired, double price) {
        this.name = name;
        this.waterRequired = waterRequired;
        this.milkRequired = milkRequired;
        this.coffeeBeansRequired = coffeeBeansRequired;
        this.price = price;
    }

    // getters
    public int getWaterRequired() {return waterRequired;}
    public int getMilkRequired() {return milkRequired;}
    public int getCoffeeBeansRequired() {return coffeeBeansRequired;}
    public double getPrice() {return price;}
    public String getName() {return name;}



    // setters
    public void setWaterRequired(int waterRequired) {this.waterRequired = waterRequired;}
    public void setMilkRequired(int milkRequired) {this.milkRequired = milkRequired;}
    public void setCoffeeBeansRequired(int coffeeBeansRequired) {this.coffeeBeansRequired = coffeeBeansRequired;}
    public void setPrice(double price) {this.price = price;}
    public void setName(String name) {this.name = name;}
}
