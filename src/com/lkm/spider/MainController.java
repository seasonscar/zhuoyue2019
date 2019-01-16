package com.lkm.spider;

import com.lkm.ngram.TransFinalData;

import java.io.IOException;
import java.util.*;

public class MainController {
    public static void main(String[] args) throws IOException, InterruptedException {
        int totalCount = 0;
        String optType = "1";//"0":总数 "1":分年
        List<Map<String, String>> dataList;
        MainController main = new MainController();
        if ("0".equals(optType)) {
            dataList = main.getUnionData(Constant.hj_1912_2008);
        } else {
            //dataList = main.getSplitYearData(Constant.hj_split_year, "1912-2008");
            dataList=main.getSplitYearData(new String[]{"黄公望"},"1973-2008");
        }
        System.out.println("总请求数:" + totalCount);
        transCsvData(optType, dataList);//"0":总数 "1":分年
    }


    public List<Map<String, String>> getSplitYearData(String[] nameArray, String yearRegion) {
        List<Map<String, String>> retList = new ArrayList<>();
        try {

            int totalCount = 0;
            LoginCookieUtil login = new LoginCookieUtil();
            if (login.getCookie() == null || login.getLoginBody() == null) {
                System.out.println("获取COOKIE失败,请检查验证配置及网络");
                return null;
            }
            int start = Integer.parseInt(yearRegion.split("-")[0]);
            int end = Integer.parseInt(yearRegion.split("-")[1]);
            for (String keyWOrd : nameArray) {
                boolean issame=false;
                for(String cmp:Constant.sfj_split_year){
                    if(cmp.equals(keyWOrd)){
                        Map<String, String> temp = new HashMap<>();
                        temp.put("name", keyWOrd);
                        temp.put("year","9999");
                        temp.put("value","9999");
                        System.out.println(temp.toString());
                        retList.add(temp);
                        issame=true;
                    }
                }
                if(issame){
                    continue;
                }
                for (int i = start; i < end + 1; i++) {
                    SpiderData parker = new SpiderData(login.getCookie(), login.getLoginBody());
                    //Thread.sleep(5000);
                    Map<String, String> resultMap = parker.spiderDataByOneWord(keyWOrd, String.valueOf(i));
                    Map<String, String> temp = new HashMap<>();
                    temp.put("name", keyWOrd);
                    temp.put("year", String.valueOf(i));
                    temp.put("value", resultMap.get(String.valueOf(i)));
                    System.out.println(temp.toString());
                    retList.add(temp);
                }
            }
            System.out.println("总请求数:" + totalCount);
        } catch (AntiSpriderException as) {
            as.printStackTrace();
        } finally {
            return retList;
        }
    }

    public List<Map<String, String>> getUnionData(String[] nameArray) throws InterruptedException, IOException {
        List<Map<String, String>> retList = new ArrayList<>();
        int totalCount = 0;
        try {

            LoginCookieUtil login = new LoginCookieUtil();
            if (login.getCookie() == null || login.getLoginBody() == null) {
                System.out.println("获取COOKIE失败,请检查验证配置及网络");
                return null;
            }

            for (String keyWOrd : nameArray) {
                SpiderData parker = new SpiderData(login.getCookie(), login.getLoginBody());
                totalCount++;
                System.out.println("休息10秒");
                //Thread.sleep(3000);
                Map<String, String> resultMap = parker.spiderDataByOneWord(keyWOrd, "1912-2008");
                resultMap.put("name", keyWOrd);
                System.out.println(resultMap.toString());
                retList.add(resultMap);
            }
        } catch (AntiSpriderException as) {
            as.printStackTrace();
        } finally {
            System.out.println("总请求数:" + totalCount);
            return retList;
        }
    }

    public static void transCsvData(String type, List<Map<String, String>> dataList) throws IOException {
        if ("0".equals(type)) {
            TransFinalData t = new TransFinalData();
            t.TransFinalDataDx4Union(dataList);
        } else if ("1".equals(type)) {
            TransFinalData t = new TransFinalData();
            t.transFinalDataDx(dataList);
        }
    }
}
