package products;

import statistics.CoffeeTypeCounter;

public class Americano extends Product{
    public Americano(String title, int price) {
        super(title, price);
        CoffeeTypeCounter.oneAmericanoSold();
    }

}
