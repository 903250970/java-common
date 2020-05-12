package com.sigfar.tools.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author heyj
 * @Date 2020/3/12
 */
public class ReadExcel {

    public static void main(String[] args) throws Exception {

//        ClassLoader classLoader=ReadExcel.class.getClassLoader();
//        InputStream inputStream = classLoader.getResourceAsStream("123.xlsx");

        File file = new File("D://123.xlsx");
        System.out.println(file.exists());
        //获取输入流
        InputStream stream = new FileInputStream(file);
        Workbook xssfWorkbook = new XSSFWorkbook(stream);
        Sheet sheet = xssfWorkbook.getSheetAt(0);

        int row_total = sheet.getLastRowNum();


        String str="(";

        for (int j = 0; j <= row_total; j++) {
            Row row = sheet.getRow(j);
            str+="'"+row.getCell(0).getStringCellValue()+"',";
        }

        str+=")";
        System.out.println(str);
    }

}
