package com.lkm.spider;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginGoogleUtil {
    private Map<String, String> cookie = null;
    private String loginbody=null;
    private static String LOGIN_HOME = "https://google.com";
    private static String LOGIN_URL = "http://duxiu.com/loginhl.jsp?";
    private static String EXPLORE_Agent = "User-Agent";
    private static String EXPLORE_HEADER = "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0";

    public Map<String, String> getCookie() {
        return cookie;
    }

    public static void main(String[] args) {
        LoginGoogleUtil l=new LoginGoogleUtil();
    }

    public String getLoginBody() {
        return loginbody;
    }

    LoginGoogleUtil() {
        if (cookie == null) {
            try {
                getLoginCookie();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void getLoginCookie() throws IOException {
        Connection con = Jsoup.connect(LOGIN_HOME);
        con.header(EXPLORE_Agent, EXPLORE_HEADER);
        InetSocketAddress s=new InetSocketAddress("127.0.0.1",1080);
        Proxy p=new Proxy(Proxy.Type.HTTP,s);
        con.proxy(p);
        Response rs = con.execute();
        Document d1 = Jsoup.parse(rs.body());
        List<Element> et = d1.select("#exp");
        Map<String, String> datas = new HashMap<>();
        for (Element e : et.get(0).getAllElements()) {
            if (e.attr("name").length() > 0) {
                datas.put(e.attr("name"), e.attr("value"));
            }
        }

        Connection con2 = Jsoup.connect(LOGIN_URL);
        con2.header(EXPLORE_Agent, EXPLORE_HEADER);
        Response login = con2.ignoreContentType(true).method(Method.GET).data(datas).cookies(rs.cookies()).execute();
        cookie = login.cookies();
        loginbody=login.body();
    }
}
