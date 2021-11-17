package ui;

import java.util.Scanner;

public class OrderTakingMenu {
    private Scanner sc = new Scanner(System.in);

    public int chooseAnItem(){
        printOptions();
        int orderItem = Integer.parseInt(sc.nextLine());
        return orderItem;
    }

    private void printOptions(){
        System.out.print("1. Americano, ");
        System.out.print("2. Espresso, ");
        System.out.print("3. Tea, ");
        System.out.print("4. Croissant, ");
        System.out.print("5. Baguette, ");
        System.out.println("6. Finish Order, ");
    }
}
