package products;

public class Baguette {
    private String title = "Baguette";
    private String croissantTitle = "Croissant";
    private int price = 30;
    private int croissantPrice = 20;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCroissantPrice() {
        return croissantPrice;
    }

    public void setCroissantPrice(int croissantPrice) {
        this.croissantPrice = croissantPrice;
    }
}
