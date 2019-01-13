package com.lkm.ngram;

import com.lkm.conn.DataConnection;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CreateDataBase {
    String demo2 = "F:\\ylb\\googlebooks-eng-all-2gram-20120701-%s";
    String demo3 = "H:\\ylb\\googlebooks-eng-all-2gram-20120701-%s";
    String create = "CREATE TABLE  ngram_%s(title varchar(100),year varchar(10),num1 varchar(10),num2 varchar(10)) charset=utf8;";
    String insert = "insert into ngram_%s  values (?,?,?,?)";

    public void createDataBase(List<NgramDto> l) {
        DataConnection conn = new DataConnection();
        Connection con = conn.getConn();
        for (NgramDto dto : l) {
            if ("qu".equals(dto.getPrefix()) ||
                    "du".equals(dto.getPrefix()) ||
                    "fu".equals(dto.getPrefix()) ||
                    "ga".equals(dto.getPrefix()) ||
                    "gu".equals(dto.getPrefix()) ||
                    "hu".equals(dto.getPrefix()) ||
                    "ji".equals(dto.getPrefix()) ||
                    "lu".equals(dto.getPrefix()) ||
                    "qi".equals(dto.getPrefix()) ||
                    "wu".equals(dto.getPrefix()) ||
                    "xi".equals(dto.getPrefix()) ||
                    "xu".equals(dto.getPrefix()) ||
                    "ya".equals(dto.getPrefix()) ||
                    "yi".equals(dto.getPrefix()) ||
                    "yu".equals(dto.getPrefix()) ||
                    "zh".equals(dto.getPrefix())
                    ) {
                continue;
            }
            try {
                String creatsql = String.format(create, dto.getPrefix());
                Statement stmt = con.createStatement();
                int s = stmt.executeUpdate(creatsql);

            } catch (SQLException e) {
                e.printStackTrace();
            }
            String filepath = String.format(demo2, dto.getPrefix());
            if ("ch".equals(dto.getPrefix()) ||
                    "su".equals(dto.getPrefix()) ||
                    "pa".equals(dto.getPrefix()) ||
                    "di".equals(dto.getPrefix()) ||
                    "be".equals(dto.getPrefix()) ||
                    "ca".equals(dto.getPrefix()) ||
                    "ma".equals(dto.getPrefix()) ||
                    "de".equals(dto.getPrefix()) ||
                    "re".equals(dto.getPrefix())
                    ) {
                filepath= String.format(demo3, dto.getPrefix());
            }
            List<String> firstName = dto.getFirstname();
            try {
                File temp = new File(filepath);
                InputStreamReader isr = null;

                String str = "";//每行的内容
                isr = new InputStreamReader(new FileInputStream(temp), "GBK");
                BufferedReader br = new BufferedReader(isr);
                int i = 0;
                int j = 0;
                int total = 0;
                String insertSql = String.format(insert, dto.getPrefix());
                con.setAutoCommit(false);
                PreparedStatement ps = con.prepareStatement(insertSql);
                while ((str = br.readLine()) != null) {
                    total++;
                    for (String f : firstName) {
                        if (str.startsWith(f + " ") && !str.contains("/") && !str.contains("\"") && !str.contains(";") && !str.contains("^") && !str.contains("-") && !str.contains("'") && !str.contains("=") && !str.contains("_") && !str.contains(".") && !str.contains("?") && !str.contains("鈥")) {
                            i++;
                            j++;
                            String[] x1 = str.split("\t");
                            try {
                                ps.setString(1, x1[0]);
                                ps.setString(2, x1[1]);
                                ps.setString(3, x1[2]);
                                ps.setString(4, x1[3]);
                            } catch (ArrayIndexOutOfBoundsException ae) {
                                System.out.println("异常行:" + total + "==" + str);
                                ae.printStackTrace();
                            }
                            ps.addBatch();
                            System.out.println(total + "==" + i + "==" + str);
                            if (j == 1000) {
                                ps.executeBatch();
                                con.commit();
                                ps = con.prepareStatement(insertSql);
                                j = 0;
                            }
                        }
                    }
                }
                if (str == null || str == "") {
                    ps.executeBatch();
                    con.commit();
                }

            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
