package com.lkm.ngram;

import com.lkm.conn.DataConnection;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TransFinalData {
    private String sql = "select * from ngram_%s where title=?";

    public void transFinalData(List<NgramDto> dtoList) {
        List<NgramDto> retList = new ArrayList<>();
        DataConnection conn = new DataConnection();
        Connection con = conn.getConn();
        for (int i = 0; i < dtoList.size(); i++) {
            NgramDto temp = dtoList.get(i);
            String selectSql = String.format(sql, temp.getPrefix());
            try {
                System.out.println(i+"===");
                PreparedStatement ps = con.prepareStatement(selectSql);
                ps.setString(1, temp.getSearchWord());
                ResultSet rs = ps.executeQuery();
                if (!rs.next()) {
                    NgramDto non = new NgramDto();
                    non.setTitle(temp.getSearchWord());
                    non.setYear("无数据");
                    non.setNum1("无数据");
                    non.setNum2("无数据");
                    non.setZhName(temp.getZhName());
                    retList.add(non);
                }
                while (rs.next()) {
                    NgramDto result = new NgramDto();
                    result.setTitle(rs.getString("title"));
                    result.setYear(rs.getString("year"));
                    result.setNum1(rs.getString("num1"));
                    result.setNum2(rs.getString("num2"));
                    result.setZhName(temp.getZhName());
                    retList.add(result);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        File file = new File("D://end.csv");
        FileOutputStream out = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            out = new FileOutputStream(file);
            osw = new OutputStreamWriter(out);
            bw = new BufferedWriter(osw);
            if (retList != null && !retList.isEmpty()) {
                for (NgramDto dto : retList) {
                    bw.append(dto.getZhName()).append(",")
                      .append(dto.getTitle()).append(",")
                      .append(dto.getYear()).append(",")
                      .append(dto.getNum1()).append(",")
                      .append(dto.getNum2()).append(",")
                      .append(dto.getYear()).append("\r");
                }
            }
        } catch (Exception e) {
        }


    }


    public void transFinalDataDx(List<Map<String, String>> dataList) {
        File file = new File("D://end.csv");
        FileOutputStream out = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            out = new FileOutputStream(file);
        osw = new OutputStreamWriter(out,"UTF-8");
        bw = new BufferedWriter(osw);
        if (dataList != null && !dataList.isEmpty()) {
            for (Map<String, String> dto : dataList) {
                for(int i=1912;i<2009;i++){
                    bw.append(dto.get("name")).append(",").append(String.valueOf(i)).append(",")
                            .append(dto.get(String.valueOf(i))==null?"0":dto.get(String.valueOf(i))).append("\r");
                }

            }
        }
        bw.close();
    } catch (Exception e) {
    }


    }

    public void transFinalDataDxTest(List<Map<String, String>> dataList) {
        File file = new File("D://end.csv");
        FileOutputStream out = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            out = new FileOutputStream(file);
            osw = new OutputStreamWriter(out);
            bw = new BufferedWriter(osw);
            bw.append("1").append(",").append("2").append("\r");
            bw.close();

        } catch (Exception e) {
        }
    }



    public static void main(String[] args) {
        TransFinalData t = new TransFinalData();
        List<NgramDto> dtoList = new ArrayList<>();
        NgramDto dto = new NgramDto();
        dto.setSearchWord("Xu Xiake");
        dto.setPrefix("xu");
        dtoList.add(dto);
        t.transFinalDataDxTest(null);
    }
}
