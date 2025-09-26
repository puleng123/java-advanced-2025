package Chapter10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * @Nokwakhiwa Mazibuko
 * This class demonstrate creation of .txt file
 */
public class WriteToFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Puleng Senyatso\\JavaAdvanced\\java-advanced-2025\\JavaAdvanced\\src\\test\\resources\\Hobbies.txt";
        File myFile = new File(filePath);

        try {
            myFile.createNewFile();
            //Write to file
            PrintStream pen = new PrintStream(myFile);
            pen.println("Tennis");
            pen.println("Soccer");
            pen.println("Chess");
            pen.println("Hiking");

            pen.close();
        } catch (IOException e) {
            System.err.println("Failed to create a file" + e.getMessage());
        }
    }

}
