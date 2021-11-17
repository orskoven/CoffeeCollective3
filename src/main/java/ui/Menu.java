package ui;

import controllers.OrderController;
import database.database.PDFconverter;

import java.util.Scanner;

public class Menu {
    private PDFconverter pdFconverter = new PDFconverter();
    StatisticsMenu statisticsMenu = new StatisticsMenu();
    OrderController orderController = new OrderController();
    private Scanner sc = new Scanner(System.in);



    public void welcomeUser(){
        System.out.println("Hello and welcome. What would you like to do?");
    }

    public int getTaskToDo(){
        printTaskOptions();
        int userInput = Integer.parseInt(sc.nextLine());
        return userInput;
    }

    private void printTaskOptions(){
        System.out.print("1. Add order, ");
        System.out.print("2. Statistics, ");
        System.out.print("3. Get receipts as pdf, ");
        System.out.println("9. Quit");
    }

    public void startChosenTask(int taskToDo){
        switch (taskToDo){
            case 1:
                orderController.addOrder();
                break;
            case 2:
                statisticsMenu.printStatisticsChoice();
                break;
            case 3:
                pdFconverter.getReceiptConverted();
                break;
            default:break;
        }
    }


}
