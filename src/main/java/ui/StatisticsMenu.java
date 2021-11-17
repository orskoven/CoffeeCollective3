package ui;

import statistics.CoffeeTypeCounter;

import java.util.Scanner;

public class StatisticsMenu {
    private Scanner sc = new Scanner(System.in);

    public void printStatisticsChoice(){
        System.out.println("1. Coffee statistics");
        System.out.println("2. Food statistics");
        int userInput = Integer.parseInt(sc.nextLine());
        switch (userInput){
            case 1:
                displayCoffeeStatistics();
                break;
            case 2:
                displayFoodStatistics();
                break;
            default:break;
        }

    }

    public void displayCoffeeStatistics(){
        System.out.println("Total coffee sold: " + CoffeeTypeCounter.howManyCoffeesSold());
    }

    public void displayFoodStatistics(){
        System.out.println("Total coffee sold: " + CoffeeTypeCounter.howManyFoodsSold());
    }
}
