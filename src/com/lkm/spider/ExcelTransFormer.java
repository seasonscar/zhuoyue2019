package com.lkm.spider;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.Region;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 15082188 on 2018/10/10.
 */
public class ExcelTransFormer {
    private List<Map<String, String>> dataList=new ArrayList<>();

    ExcelTransFormer() {
        initTestData();
    }

    void initTestData() {
        Map<String, String> m = new HashMap<>();
        m.put("2018", "3");
        m.put("2014", "3");
        m.put("2015", "3");
        m.put("2012", "3");
        m.put("name", "孔子");
        dataList.add(m);
    }

    public static void main(String[] args) throws IOException {
        ExcelTransFormer x = new ExcelTransFormer();
        x.ExcelTransFormer2();
    }

    public void ExcelTransFormer2() throws IOException {
        HSSFWorkbook wkb = new HSSFWorkbook();
        HSSFSheet sheet = wkb.createSheet("zhuoyue2019");//建立新的sheet对象（excel的表单）

        HSSFRow row1 = sheet.createRow(0);//在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
        HSSFCell cell = row1.createCell((short) 0);//创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
        cell.setCellValue("");//设置单元格内容
        for (int i = 0; i <2018-1958; i++) {
            HSSFCell tempcell = row1.createCell((short) (i+1));
            tempcell.setCellValue(String.valueOf(2018-i));
        }
        for (int i=0;i<dataList.size();i++) {
            Map<String, String> temp=dataList.get(i);
            HSSFRow row2 = sheet.createRow(i+1);//在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
            HSSFCell cell2 = row2.createCell((short) 0);//创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
            cell2.setCellValue(temp.get("name"));//设置单元格内容
            for (int j = 0; j <2018-1958; j++) {
                HSSFCell tempcell = row2.createCell((short) (j+1));
                String tempvalue=temp.get(String.valueOf(2018-j));
                if(tempvalue==null||tempvalue==""){
                    tempvalue="0";
                }
                tempcell.setCellValue(tempvalue);
            }
        }
        FileOutputStream fos = new FileOutputStream("D:\\zhuoyue2019.xls");
        fos.write(wkb.getBytes());

        File file = new File("D:\\zhuoyue2019.xls");
        try {
            file.createNewFile();
            FileOutputStream stream = FileUtils.openOutputStream(file);
            wkb.write(stream);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
