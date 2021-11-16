package products;

import statistics.CoffeeTypeCounter;

public class Tea extends Product{
    public Tea(String title, int price) {
        super(title, price);
        CoffeeTypeCounter.oneTeaSold();
    }
}
