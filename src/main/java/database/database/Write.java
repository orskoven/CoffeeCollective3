package database.database;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Write {


    public void writerToFile(String poem){
        try {
            Writer w = new FileWriter("resources/receipts.csv", true);
            w.write("\r");
            w.write(poem);
            w.close();

            System.out.println("Saved" + "💾");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
