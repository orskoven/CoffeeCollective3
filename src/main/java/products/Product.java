package products;

public class Product{
    protected String title;
    protected int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPrice(){
        return this.price;
    }


    @Override
    public String toString() {
        return title + ";" + price;
    }
}
