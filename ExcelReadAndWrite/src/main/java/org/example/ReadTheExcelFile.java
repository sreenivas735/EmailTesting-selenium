package org.example;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class ReadTheExcelFile {

    public static void main(String[] args) throws Exception {
        methodreadExcel("D:\\TESTING\\", "employeeDetails.xlsx");
    }

    public static void methodreadExcel(String path, String name) throws Exception {
        File file = new File(path + name);

        XSSFWorkbook wb = new XSSFWorkbook(file);

        XSSFSheet sheet = wb.getSheetAt(0);
        XSSFRow row = sheet.getRow(0);
        XSSFCell cell = row.getCell(0);

        int n = sheet.getLastRowNum();
        System.out.println(n);
        int m = row.getLastCellNum();
        System.out.println(m);
        for (int i = 0; i <= n; i++) {
            XSSFRow row1 = sheet.getRow(i);
            for (int j = 0; j < m; j++) {
                XSSFCell cell1 = row1.getCell(j);
                if (cell1 == null) {
                    System.out.println("row " + i + " and column " + j + " value is  : " + null);
                    continue;
                }
                CellType celltype = cell1.getCellType();
                String s;
                long d;

                if (celltype.name().equals("STRING")) {
                    s = cell1.getStringCellValue();
                    System.out.println("row " + i + " and column " + j + " value is  : " + s);
                } else {
                    d = (long) cell1.getNumericCellValue();
                    System.out.println("row " + i + " and column " + j + " value is  : " + d);
                }


            }

        }
    }
}