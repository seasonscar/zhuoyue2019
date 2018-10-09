package com.lkm.spider;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainController {
    public static void main(String[] args) throws IOException {
        LoginCookieUtil login=new LoginCookieUtil();
        if(login.getCookie()==null||login.getLoginBody()==null){
            System.out.println("获取COOKIE失败,请检查验证配置及网络");
            return;
        }
        Map<String,String> lastMap=new HashMap<>();
        SpiderData parker=new SpiderData(login.getCookie(),login.getLoginBody());
        Map<String,String> resultMap=parker.spiderDataByOneWord("孔子","");
        //System.out.println(resultMap.toString());
        Iterator itr=resultMap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry entry= (Map.Entry) itr.next();
            String key=entry.getKey().toString();
            String value=entry.getValue().toString();
            System.out.println(key+"====OK");
            if(key.contains("-")){
                System.out.println("=========拆分年份线程start======");
                int start=Integer.parseInt(key.split("-")[0]);
                int end=Integer.parseInt(key.split("-")[1]);
                for(int i=start;i<end;i++){
                    Map<String,String> yearMap=parker.spiderDataByOneWord("孔子",String.valueOf(i));
                    lastMap.put(String.valueOf(i),yearMap.get(key));
                }
            }else{
                lastMap.put(key,value);
            }
        }
        lastMap.remove("其他");
        System.out.println("=====("+parker.getKeyWord()+")最终数据========");
        System.out.println(lastMap.toString());
    }
}
