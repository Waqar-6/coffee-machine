package appMain;

import coffee.Cappuccino;
import coffee.Coffee;
import coffee.Espresso;
import coffee.Latte;
import coffeeMachine.CoffeeMachine;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(100, 100, 100, 100);

        Coffee coffee;


        Scanner userInput = new Scanner(System.in);

        System.out.println("What coffee would you like on this beautiful day ?");
        System.out.println("options : \n 1 for Latte, 2 for Espresso and 3 for Cappuccino");


        int optionSelected = userInput.nextInt();

        switch (optionSelected){
            case 1 -> {
                coffee = new Latte("Latte",10, 12, 15, 10);
                System.out.println("You selected a Latte");
                break;}
            case 2 -> {
                coffee = new Espresso("Espresso",10, 0, 15, 17);
                System.out.println("You selected a Espresso");
                break;}
            case 3 -> {
                coffee = new Cappuccino("Cappuccino",10, 12, 15, 30);
                System.out.println("You selected a Cappuccino");
                break;}
            default -> {
                System.out.println("Come On Man Select the right options 1,2 or 3 that's it");
                return;}

        }



        System.out.println("a payment of £" + coffee.getPrice());
        double moneyGiven = userInput.nextDouble();

        coffeeMachine.makeCoffee(coffee, moneyGiven);




    }
}
