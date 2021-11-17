package products;

import statistics.CoffeeTypeCounter;

public class Croissant extends Product{
    public Croissant(String title, int price) {
        super(title, price);
        CoffeeTypeCounter.oneCroissantSold();
    }
}
