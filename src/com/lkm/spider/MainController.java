package com.lkm.spider;

import java.io.IOException;
import java.util.*;

public class MainController {
    public static void main(String[] args) throws IOException, InterruptedException {
        int totalCount=0;
        int spiderCount=0;
        String[] finish={"孔子","莎士比亚","列夫·托尔斯泰","李清照","鲁迅","安徒生"};
        String[] name = {"孔子","莎士比亚","列夫·托尔斯泰","李清照","鲁迅","安徒生","普希金", "狄更斯","乔伊斯","马克吐温"};
        List<Map<String, String>> dataList = new ArrayList<>();
        try{

        LoginCookieUtil login = new LoginCookieUtil();
        if (login.getCookie() == null || login.getLoginBody() == null) {
            System.out.println("获取COOKIE失败,请检查验证配置及网络");
            return;
        }
        for (String keyWOrd : name) {
            //Thread.sleep(2000);
            Map<String, String> lastMap = new HashMap<>();
            lastMap.put("name", keyWOrd);
            SpiderData parker = new SpiderData(login.getCookie(), login.getLoginBody());
            totalCount++;
            spiderCount++;
            if(spiderCount==1){
                System.out.println("休息10秒");
                Thread.sleep(10000);
                spiderCount=0;
            }
            Map<String, String> resultMap = parker.spiderDataByOneWord(keyWOrd, "");
            //System.out.println(resultMap.toString());
            Iterator itr = resultMap.entrySet().iterator();
            while (itr.hasNext()) {
                Map.Entry entry = (Map.Entry) itr.next();
                String key = entry.getKey().toString();
                String value = entry.getValue().toString();
                System.out.println(key + "====OK=="+value);
                if (key.contains("-")) {
                    System.out.println("=========拆分年份线程start======");
                    int start = Integer.parseInt(key.split("-")[0]);
                    int end = Integer.parseInt(key.split("-")[1]);
                    for (int i = start; i < end+1; i++) {
                        SpiderData parker2 = new SpiderData(login.getCookie(), login.getLoginBody());
                        totalCount++;
                        spiderCount++;
                        if(spiderCount==1){
                            System.out.println("休息10秒");
                            Thread.sleep(10000);
                            spiderCount=0;
                        }
                        Map<String, String> yearMap = parker2.spiderDataByOneWord(keyWOrd, String.valueOf(i));
                        System.out.println(String.valueOf(i) + "====OK=="+yearMap.get(key));
                        lastMap.put(String.valueOf(i), yearMap.get(key));
                    }
                } else {
                    lastMap.put(key, value);
                }
            }
            System.out.println("=====(" + parker.getKeyWord() + ")最终数据========");
            System.out.println(lastMap.toString());
            dataList.add(lastMap);
        }
    }catch(AntiSpriderException antiSpriderException){
            antiSpriderException.printStackTrace();
    }finally {
            System.out.println("总请求数:"+totalCount);
            ExcelTransFormer e = new ExcelTransFormer(dataList);
            e.ExcelTransFormer();
     }
}
}
