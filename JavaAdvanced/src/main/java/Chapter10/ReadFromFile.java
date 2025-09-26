package Chapter10;

import java.io.*;
import java.util.Arrays;


public class ReadFromFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Puleng Senyatso\\JavaAdvanced\\java-advanced-2025\\JavaAdvanced\\src\\test\\resources\\Hobbies.txt";
        File myFile = new File(filePath);
        String text;
        try {
            FileReader reader = new FileReader(myFile);
            BufferedReader read = new BufferedReader(reader);

            while ((text = read.readLine()) != null){
                System.out.println(text);
            }
            reader.close();
            read.close();
            System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());;


        }catch ( IOException e){
            System.err.println("Cannot read file from [" + myFile.getName() + "]");
        }
    }

}
 