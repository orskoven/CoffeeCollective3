package products;

import statistics.CoffeeTypeCounter;

public class Espresso extends Product{
    public Espresso(String title, int price) {
        super(title, price);
        CoffeeTypeCounter.oneEspressoSold();
    }
}
