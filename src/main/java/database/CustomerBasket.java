package database;

import database.database.Write;
import products.Product;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerBasket {
    private static ArrayList<String> receipt = new ArrayList<String>();
    private static ArrayList<Product> customerBasket= new ArrayList<Product>();

    //adds item to the basket
    public void addOrderItemToBasket(Product item){
        customerBasket.add(item);
    }


    //This adds up all items to the receipt
    public static ArrayList<String> getReceipt(){
        int totalPrice = 0;
        for (int i = 0; i < customerBasket.size(); i++) {
            String productName = customerBasket.get(i).getTitle();
            int price = customerBasket.get(i).getPrice();
            String orderItem = productName + " ----- " + price + " Dkk";
            receipt.add(orderItem);
            totalPrice += price;
        }
        String finalPrice = String.valueOf(totalPrice);
        receipt.add("Total " + finalPrice + "Dkk");
        customerBasket.clear();
        return receipt;

    }

    // this saves the reciept to a csv file
    public void saveReceipt(){
        Write write = new Write();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your name: ");
        String username = scanner.nextLine();
        write.writerToFile( username + ";" + new Timestamp(System.currentTimeMillis()) + ";" + receipt.toString());
    }

}
