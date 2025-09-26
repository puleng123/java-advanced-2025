package Chapter10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Puleng Senyatso\\JavaAdvanced\\java-advanced-2025\\JavaAdvanced\\src\\main\\resources\\Student Results.xlsx";

        try
        {
            FileInputStream fileInput = new FileInputStream(new File(filePath));
            XSSFWorkbook myWorkbook = new XSSFWorkbook(fileInput);
            XSSFSheet mySheet = myWorkbook.getSheetAt(0);

//            for (int i = 0; i <= mySheet.getLastRowNum(); i++) {
//                Row row = mySheet.getRow(i);
//
//                for(int column = 0; column < row.getLastCellNum(); column++){
//                    Cell cell = row.getCell(column);
//                    System.out.print(cell + "\t");
//                }
//                System.out.println();
//            }

            for(Row myRow : mySheet)
            {
                for(Cell myCell : myRow)
                {
                    System.out.println(myCell + "\t");
                }
                System.out.println();
            }

            fileInput.close();
            myWorkbook.close();
        }
        catch(IOException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
