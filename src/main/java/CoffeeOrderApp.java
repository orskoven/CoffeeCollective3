import controllers.OrderController;
import database.CustomerBasket;
import database.ReadFiles;
import ui.Menu;
import ui.OrderTakingMenu;
import ui.StatisticsMenu;

public class CoffeeOrderApp {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ReadFiles readFiles = new ReadFiles();

        // read the product.csv file and save information to TemporaryData >> productPrices file
        readFiles.getProductPricesFromFile();

        // greet the user
        menu.welcomeUser();

        //
        int taskToDo;
        do{
            // get user's choice of task
            taskToDo = menu.getTaskToDo();

            //start the chosen task
            menu.startChosenTask(taskToDo);

        } while(taskToDo != 9);
    }
}
