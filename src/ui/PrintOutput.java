package ui;

import database.CustomerBasket;

import java.util.ArrayList;

public class PrintOutput {
    public void showReceipt(){
        ArrayList<String> receipt = CustomerBasket.getReceipt();
        for (int i = 0; i < receipt.size(); i++) {
            System.out.println(receipt.get(i));
        }
        System.out.println("--------------------------");
    }
}
