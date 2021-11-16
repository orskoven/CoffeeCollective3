import database.CustomerBasket;
import ui.Menu;
import ui.OrderTakingMenu;
import ui.StatisticsMenu;

public class CoffeeOrderApp {
    public static void main(String[] args) {
        Menu menu = new Menu();
        OrderTakingMenu orderTakingMenu = new OrderTakingMenu();
        StatisticsMenu statisticsMenu = new StatisticsMenu();
        CustomerBasket customerBasket = new CustomerBasket();

        // greet the user
        menu.welcomeUser();

        int taskToDo;
        do{
            // get user's choice of task
            taskToDo = menu.getTaskToDo();

            //start the chosen task
            menu.startChosenTask(taskToDo);

            /*
            switch(taskToDo){


                case 1:

                    customerBasket.addToAmericano(new Americano("Americano", 30));
                    break;
                case 2:
                    customerBasket.addToEspresso(new Espresso("Espresso", 20));
                    break;
                case 3:
                    customerBasket.addToTea(new Tea("Green Tea", 15));
                    break;
                case 4:
                    customerBasket.addToBaguette(new Baguette("Bagutte", 50));
                    break;
                case 5:
                    customerBasket.addToCroissant(new Croissant("Croissant", 10));
                    break;
                case 6:
                    statisticsMenu.printStatisticsChoice();
                    break;
                case 7:
                    customerBasket.getTotalPrice();
                    break;
                default: break;

             */
        }while(taskToDo != 9);
    }
}
