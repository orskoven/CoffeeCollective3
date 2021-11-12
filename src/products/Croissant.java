package products;

public class Croissant {
    private String title;
    private int price;

    public Croissant(){
        this.title = new Baguette().getTitle();
        this.price = new Baguette().getCroissantPrice();
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
