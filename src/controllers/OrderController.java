package controllers;

import database.CustomerBasket;
import products.*;
import ui.OrderTakingMenu;
import ui.PrintOutput;

public class OrderController {
    OrderTakingMenu orderTakingMenu = new OrderTakingMenu();
    CustomerBasket customerBasket = new CustomerBasket();
    PrintOutput printOutput = new PrintOutput();

    public void addOrder() {
        int orderItem;
        Product item;

   do{
       orderItem = orderTakingMenu.chooseAnItem();
       switch (orderItem) {
           case 1:
               item = new Americano("Americano", 30);
               customerBasket.addOrderItemToBasket(item);
               break;
           case 2:
               item = new Espresso("Espresso", 20);
               customerBasket.addOrderItemToBasket(item);
               break;
           case 3:
               item = new Tea("Green Tea", 15);
               customerBasket.addOrderItemToBasket(item);
               break;
           case 4:
               item = new Baguette("Bagutte", 50);
               customerBasket.addOrderItemToBasket(item);
               break;
           case 5:
               item = new Croissant("Croissant", 10);
               customerBasket.addOrderItemToBasket(item);
               break;
           default: break;
       }

   } while (orderItem != 6);
        printOutput.showReceipt();
    }
}
