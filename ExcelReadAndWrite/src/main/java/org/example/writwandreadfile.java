package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class writwandreadfile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\TESTING\\Files\\Book1.xlsx");
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sh = wb.getSheetAt(0);
        Row r = sh.getRow(0);
        Cell c = r.getCell(0);
        System.out.println(c.getCellType());

        int rowlength = sh.getLastRowNum();
        int celllength = r.getLastCellNum();
        for (int i = 0; i <= rowlength; i++) {
            r = sh.getRow(i);
            for (int j = 0; j < celllength; j++) {
                c = r.getCell(j);

                if (c.getCellType().equals("null")) {
                    continue;

                }else {
                    if (c.getCellType() == CellType.STRING) {
                        String s = c.getStringCellValue();
                        System.out.println(s);
                    } else if (c.getCellType() == CellType.NUMERIC) {
                        double d = c.getNumericCellValue();
                        System.out.println(d);
                    }
                }
            }
        }
    }

}

class filereadandwrite {
    public void methodfile() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\TESTING\\Files\\Book1.xlsx");
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sh = wb.getSheetAt(0);
        Row r = sh.getRow(1);
        Cell c = r.getCell(0);
        String s = c.getStringCellValue();
        System.out.println(s);


        FileInputStream fis1 = new FileInputStream("D:\\TESTING\\Files\\Book1.xlsx");
        Workbook workbook = new XSSFWorkbook(fis1); // Open the existing workbook

        Sheet sheet = workbook.getSheetAt(0); // Assuming you want to write to the first sheet

        // Create some data and write it to the sheet
        Row dataRow = sheet.createRow(sheet.getLastRowNum() + 1);

        System.out.println(sheet.getLastRowNum());// Append data to the end of the sheet
        dataRow.createCell(7).setCellValue("Alice");
        dataRow.createCell(8).setCellValue(25);

        // Save the workbook back to the existing file
        FileOutputStream fos = new FileOutputStream("D:\\TESTING\\Files\\Book1.xlsx");
        workbook.write(fos);
    }
}