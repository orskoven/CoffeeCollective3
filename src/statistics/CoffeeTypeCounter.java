package statistics;

public class CoffeeTypeCounter {
    private static int americanos = 0;
    private static int espressos = 0;
    private static int teas = 0;
    private static int croissants= 0;
    private static int baguettes= 0;

    public static void oneAmericanoSold(){
       americanos++;
    }
    public static void oneEspressoSold(){
        espressos++;
    }
    public static void oneTeaSold(){
        teas++;
    }
    public static void oneCroissantSold(){
        teas++;
    }
    public static void oneBaguetteSold(){
        teas++;
    }

    public static int howManyCoffeesSold(){
        return americanos + espressos + teas + croissants + baguettes;
    }

    public static int howManyFoodsSold(){
        return americanos + espressos + teas + croissants + baguettes;
    }

    public static int howManySoldInTotal(){
        return howManyCoffeesSold() + howManyCoffeesSold();
    }
}
