package controllers;

import ProductFactory.ProductFactory;
import database.CustomerBasket;
import products.*;
import ui.OrderTakingMenu;
import ui.PrintOutput;

public class OrderController {
    OrderTakingMenu orderTakingMenu = new OrderTakingMenu();
    CustomerBasket customerBasket = new CustomerBasket();
    PrintOutput printOutput = new PrintOutput();
    ProductFactory productFactory = new ProductFactory();

    public void addOrder() {
        int orderItem;
        Product newProduct;
        do{
           orderItem = orderTakingMenu.chooseAnItem(); // get item number from order
           String productType = getProductName(orderItem); // get name of item form order item
           newProduct = productFactory.createProduct(productType); // create new product
           customerBasket.addOrderItemToBasket(newProduct); // add newly created product to the basket
        } while (orderItem != 6); // number 6 mens, finish of adding item to basket
        printOutput.showReceipt(); // so print the basket
    }


    private String getProductName(int orderItem){
        String productType = "";
        switch (orderItem) {
            case 1:
                productType = "americano";
                break;
            case 2:
                productType = "espresso";
                break;
            case 3:
                productType = "tea";
                break;
            case 4:
                productType = "baguette";
                break;
            case 5:
                productType = "croissant";
                break;
            default: break;
        }
        return productType;
    }

} // class ends here


