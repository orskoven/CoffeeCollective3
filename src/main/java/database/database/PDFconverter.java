package database.database;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class PDFconverter {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static boolean isNameFound;
    static int lineCounter = 0;
    static String poems = "";


    // this converts the saved csv file to pdf files
    public void getReceiptConverted() {
        System.out.print("Type your name to load receipts:");
        String usernameToLoad = scanner.next();
        File receipts = new File("resources/receipts.csv");
        try {
            Scanner sc = new Scanner(receipts);
            while (sc.hasNextLine() || !isNameFound) {
                String line = sc.nextLine();
                String[] stringLikeArray = line.split(";");
                String username = stringLikeArray[0];
                if (Objects.equals(usernameToLoad, username)) {
                    Document document = new Document();
                    PdfWriter.getInstance(document, new FileOutputStream(randomizer(0,1000)+"Receipt.pdf"));
                    document.open();
                    Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
                    document.add( new Paragraph( "Name: " + stringLikeArray[0] ) );
                    document.add( new Paragraph( "Time: " + stringLikeArray[1] ) );
                    for (int i = 2; i < stringLikeArray.length; i++) {
                        document.add( new Paragraph( "Items: " + stringLikeArray[i] ) );
                    }


                    document.close();

                    isNameFound = true;
                }


            }
        } catch (FileNotFoundException | DocumentException e) {
            System.out.println("File could not be found!");
            e.printStackTrace();
        }
    }

    public int randomizer(int min, int max){
        return random.nextInt(max-min+1)+min;
    }

}