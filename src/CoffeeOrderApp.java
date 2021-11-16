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
        }while(taskToDo != 9);
    }
}
