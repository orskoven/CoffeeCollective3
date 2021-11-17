package products;

import statistics.CoffeeTypeCounter;

public class Baguette extends Product{

    public Baguette(String title, int price) {
        super(title, price);
        CoffeeTypeCounter.oneBaguetteSold();
    }

}
