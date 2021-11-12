package ui;

import statistics.CoffeeTypeCounter;

import java.util.Scanner;

public class StatisticsMenu {
    private Scanner sc = new Scanner(System.in);

    public int receiveUserInput(){
        int userInput = sc.nextInt();
        return userInput;
    }

    public void printStatisticsChoice(){
        System.out.println("1. Coffee statistics");
        System.out.println("2. Food statistics");
    }

    public void displayCoffeeStatistics(){
        System.out.println(CoffeeTypeCounter.howManyCoffeesSold());
    }

    public void displayFoodStatistics(){
        System.out.println(CoffeeTypeCounter.howManyFoodsSold());
    }
}
