package com.lkm.spider;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.Connection.Method;
import org.jsoup.select.Elements;

public class SpiderData {
    private static String SEARCH_URL = "http://book.duxiu.com/search?";
    private String loginBody;
    private String keyWord;
    private Map<String, String> cookie = null;

    SpiderData(Map<String, String> cookie, String loginBody) {
        this.cookie = cookie;
        this.loginBody = loginBody;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public Map<String, String> spiderDataByOneWord(String keyWord, String year) throws IOException {
        this.keyWord=keyWord;
        Document doc = Jsoup.parse(loginBody);
        Map<String, String> datas = new HashMap<>();
        List<Element> et = doc.select("#f2");
        for (Element e : et.get(0).getAllElements()) {
            if (e.attr("name").equals("sw")) {
                e.attr("value", keyWord);
            }
            if (e.attr("name").equals("ecode")) {
                e.attr("value", "utf-8");
            }
            if (e.attr("name").equals("Field")) {
                e.attr("value", "all"); // 设置用户密码
            }
            if (e.attr("name").length() > 0) {// 排除空值表单属性
                datas.put(e.attr("name"), e.attr("value"));
            }
            if(year!=""){
                datas.put("sectyear",year);
            }
        }
        Connection con = Jsoup.connect(SEARCH_URL);
        Response result = con.ignoreContentType(true).method(Method.GET)
                .data(datas).cookies(cookie).execute();
        Document finalDoc = Jsoup.parse(result.body());
        return convertToMap(finalDoc);
    }

    public Map<String,String> convertToMap(Document finalDoc){
        Map<String,String> retMap=new HashMap();
        List<Element> yearTree = finalDoc.select(".content_left");
        Elements es = null;
        for (Element e : yearTree) {
            if (e.html().contains("年代")) {
                es = e.select("a");
            }
        }
        if(es==null||es.size()==0){
            System.out.println("关于"+keyWord+"相关搜索结果为空");
            return retMap;
        }
        for (int i = 0; i < es.size(); i++) {
            if(es.get(i).hasClass("dele icons")){
                continue;
            }
            String temp=es.get(i).childNode(0).toString();
            if(!temp.contains("(")){
                continue;
            }
            String year=temp.split("\\(")[0];
            String number=temp.split("\\(")[1].replace(")","");
            retMap.put(year,number);
        }
        return retMap;
    }
}
