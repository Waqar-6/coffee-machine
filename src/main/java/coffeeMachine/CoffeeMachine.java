package coffeeMachine;

import coffee.Coffee;

import java.time.LocalDateTime;

public class CoffeeMachine {

    private int water;
    private int milk;
    private int coffeeBeans;
    private double money;


    public CoffeeMachine (int water, int milk, int coffeeBeans, double money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.money = money;
    }

    public void makeCoffee (Coffee coffee, double money) {
        boolean isPaid = addMoney(money, coffee.getPrice());
        boolean isEnough = checkResources(coffee.getWaterRequired(), coffee.getMilkRequired(), coffee.getCoffeeBeansRequired());
        if ( isPaid && isEnough) {
            deductResources(coffee.getWaterRequired(), coffee.getMilkRequired(), coffee.getCoffeeBeansRequired());
            System.out.println(coffee.getName() + " is being made...");
            System.out.println(receipt(coffee));
        }
        if (!isEnough) System.out.println("not enough resources");


    }

    public void addIngredients (int water, int milk, int coffeeBeans) {
        this.water += water;
        this.milk += milk;
        this.coffeeBeans += coffeeBeans;
    }

    public void deductResources (int waterRequired, int milkRequired, int coffeeBeansRequired) {
        this.water -= waterRequired;
        this.milk -= milkRequired;
        this.coffeeBeans -= coffeeBeansRequired;
    }

    public boolean checkResources (int waterRequired, int milkRequired, int coffeeBeansRequired) {
        boolean enoughWater = this.water >= waterRequired;
        boolean enoughMilk = this.milk >= milkRequired;
        boolean enoughCoffeeBeans = this.coffeeBeans >= coffeeBeansRequired;

        return enoughWater && enoughMilk && enoughCoffeeBeans;
    }

    public boolean addMoney (double money, double price) {
        if(money == price) this.money = money;
        return true;
    }

    public String receipt(Coffee coffee) {
        System.out.println("Tank you for your order here is your receipt:");
        int orderNum = 123;
        LocalDateTime dateTime = LocalDateTime.now();
        return "coffee name: "
                + coffee.getName() + " water: "+
                coffee.getWaterRequired() + " milk: "+
                coffee.getMilkRequired() + " coffee beans: "+
                coffee.getCoffeeBeansRequired() + " price: "+ coffee.getPrice() +
                " Date: "+ dateTime;
    }


    // Getters Setters
    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
