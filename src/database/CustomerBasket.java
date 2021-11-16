package database;

import products.Product;

import java.util.ArrayList;

public class CustomerBasket {
    private static ArrayList<Product> customerBasket= new ArrayList<Product>();

    public void addOrderItemToBasket(Product item){
        customerBasket.add(item);
    }

    public static ArrayList<String> getReceipt(){
        ArrayList<String> receipt = new ArrayList<>();
        int totalPrice = 0;
        for (int i = 0; i < customerBasket.size(); i++) {
            String productName = customerBasket.get(i).getTitle();
            int price = customerBasket.get(i).getPrice();
            String orderItem = productName + " ----- " + price + " Dkk";
            receipt.add(orderItem);
            totalPrice += price;
        }
        String finalPrice = String.valueOf(totalPrice);
        receipt.add(finalPrice);
        customerBasket.clear();
        return receipt;

    }

}
