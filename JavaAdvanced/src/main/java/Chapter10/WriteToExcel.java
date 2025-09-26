package Chapter10;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.stream.Stream;

public class WriteToExcel {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Puleng Senyatso\\JavaAdvanced\\java-advanced-2025\\JavaAdvanced\\src\\main\\resources\\Modules.xlsx";

        try
        {
            OutputStream fileWrite = new FileOutputStream(filePath);
            //Create a workbook object
            XSSFWorkbook myWorkBook = new XSSFWorkbook();
            //Create spreadsheet inside the workbook
            XSSFSheet sheet = myWorkBook.createSheet("iLAB Modules");
            //Create a header row
            XSSFRow header = sheet.createRow(0);
            header.createCell(0).setCellValue("Module Name");
            header.createCell(1).setCellValue("Credits");
            //Create row1
            XSSFRow row1 = sheet.createRow(1);
            row1.createCell(0).setCellValue("Java Fund");
            row1.createCell(1).setCellValue(250);
            //Create row2
            XSSFRow row2 = sheet.createRow(2);
            row2.createCell(0).setCellValue("Java Adv");
            row2.createCell(1).setCellValue(300);
            //Create row3
            XSSFRow row3 = sheet.createRow(3);
            row3.createCell(0).setCellValue("SQL");
            row3.createCell(1).setCellValue(150);

            myWorkBook.write(fileWrite);
            fileWrite.close();
            myWorkBook.close();
        }
        catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
