package org.example.DataDrivenTesting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFile {


    public static void main(String[] args) throws IOException {

        Map<String, Object> data = new TreeMap<>();
        data.put("1", new Object[]{"Login1", "Email1", "Password1"});
        data.put("2", new Object[]{"Login2", "Email2", "Password2"});
        data.put("3", new Object[]{"Login3", "Email3", "Password3"});

        Set<String> keys = data.keySet();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("dataSheet");

        int row = 0;
        for(String key : keys) {
            Row r = sheet.createRow(row++);
            Object[] temp = (Object[]) data.get(key);
            int cellNo = 0;
            for(Object o : temp) {
                Cell cell = r.createCell(cellNo++);
                cell.setCellValue((String) o);
            }
        }

        FileOutputStream fileOutputStream = new FileOutputStream(new File("fileCreation.xlsx"));
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }

}
