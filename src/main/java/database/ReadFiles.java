package database;

import java.io.File;
import java.util.Scanner;

public class ReadFiles {

    public void getProductPricesFromFile(){

//this reads the prices from csv file
    try {
        File file = new File("resources/product.csv");
        Scanner productScanner = new Scanner(file);
        while (productScanner.hasNext()){
            String[] productDetail = productScanner.next().split(";");
            String key = productDetail[0];
            int value = Integer.parseInt(productDetail[1]);
            TemporaryData.productPrices.put(key, value);
        }
        //  Block of code to try
    } catch(Exception e) {
        System.out.println("File couldn't read");
    }

    }


} // class ends here
