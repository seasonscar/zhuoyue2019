package com.lkm.spider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestWorker {
    public static void main(String[] args) throws IOException, InterruptedException {
        String keyWOrd ="孔子";
        List<Map<String, String>> dataList = new ArrayList<>();
        LoginCookieUtil login = new LoginCookieUtil();
        if (login.getCookie() == null || login.getLoginBody() == null) {
            System.out.println("获取COOKIE失败,请检查验证配置及网络");
            return;
        }
        for (int i = 1959; i < 1969; i++) {
            SpiderData parker = new SpiderData(login.getCookie(), login.getLoginBody());
            Map<String, String> resultMap = parker.spiderDataByOneWord(keyWOrd, String.valueOf(i));
            System.out.println(resultMap.toString());
        }

    }
}
