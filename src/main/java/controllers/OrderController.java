package controllers;

import ProductFactory.ProductFactory;
import database.CustomerBasket;
import database.ReadFiles;
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
        while (true){
            orderItem = orderTakingMenu.chooseAnItem(); // get item number from order
            if (orderItem == 6) { // number 6 mens, finish of adding item to basket
                outputHandle(); // call the output handle method to show , print and save receipt
                break;
            }
            String productType = getProductName(orderItem); // get name of item from order item
            newProduct = productFactory.createProduct(productType); // create new product
            customerBasket.addOrderItemToBasket(newProduct); // add newly created product to the basket
            }
        }

        private void outputHandle(){
            printOutput.showReceipt(); // prints the basket
            customerBasket.saveReceipt(); // store file as pdf file
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


