package L07_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TryCatchMultipleBlocks {
    public static void main(String[] args) {

        // ! FileNotFoundException
        //FileReader reader = new FileReader("file.txt"); // < compilation error

        // SOLUTION

        try{
            FileReader reader = new FileReader("file.txt");
            int value = reader.read();
            new SimpleDateFormat().parse("");

            System.out.println("File opened");
        } catch(FileNotFoundException ex) {
            System.out.println("File does not exist");
            //System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            //System.out.println("Could not read data");
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
