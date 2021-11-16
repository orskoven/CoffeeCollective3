package ProductFactory;

import products.*;

public class ProductFactory implements ProductInterface {
    Product item;



    public Product createProduct(String productType){
        int price = getProductPrice(productType);
        if (productType.equalsIgnoreCase("americano")) {
            item = new Americano(productType, price);
        } else if (productType.equalsIgnoreCase("espresso")) {
            item = new Espresso(productType, price);
        } else if (productType.equalsIgnoreCase("tea")) {
            item = new Tea(productType, price);
        } else if (productType.equalsIgnoreCase("baguette")) {
            item = new Baguette(productType, price);
        } else if (productType.equalsIgnoreCase("croissant")) {
            item = new Croissant(productType, price);
        } else {
            item = new Product(productType, price);
        }
        return item;
    }

    private int getProductPrice(String productType){
        int productPrice = 0;

        return productPrice;
    }
}
