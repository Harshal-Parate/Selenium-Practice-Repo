package org.example.DataDrivenTesting;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {

    public static Object[][] dataFromFile() throws IOException {
        Workbook w;
        Sheet s;
        Row r;
        Cell c;

        FileInputStream fs = new FileInputStream("fileCreation.xlsx");
        w = WorkbookFactory.create(fs);
        s = w.getSheet("dataSheet");

        int row = s.getLastRowNum() + 1;
        int col = s.getRow(0).getLastCellNum();

        String[][] arr = new String[row][col];

        for (int i = 0; i < row; i++) {
             r = s.getRow(i);
            for (int j = 0; j < col; j++) {
                c = r.getCell(j);
                arr[i][j] = c.getStringCellValue();
            }
        }
        return arr;
    }


    public static void main(String[] args) throws IOException {

        Object[][] arr = dataFromFile();
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
