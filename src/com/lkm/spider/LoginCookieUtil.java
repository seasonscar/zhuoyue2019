package com.lkm.spider;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.Connection.Method;

public class LoginCookieUtil {
    private Map<String, String> cookie = null;
    private String loginbody=null;
    private static String LOGIN_HOME = "http://duxiu.com/login.jsp?";
    private static String LOGIN_URL = "http://duxiu.com/loginhl.jsp?";
    private static String EXPLORE_Agent = "User-Agent";
    private static String EXPLORE_HEADER = "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0";

    public Map<String, String> getCookie() {
        return cookie;
    }

    public String getLoginBody() {
        return loginbody;
    }

    LoginCookieUtil() {
        if (cookie == null) {
            try {
                getLoginCookie();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  class BasicAuthenticator extends Authenticator {
        String userName;
        String password;

        public BasicAuthenticator(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }
    }
        private void getLoginCookie() throws IOException {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("xzproxy.cnsuning.com", 8080));
        Authenticator.setDefault(new BasicAuthenticator("15082188", "5760909lyg?"));
        Connection con = Jsoup.connect(LOGIN_HOME);
                //.proxy(proxy);

        con.header(EXPLORE_Agent, EXPLORE_HEADER);
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
        //.proxy(proxy);
        con2.header(EXPLORE_Agent, EXPLORE_HEADER);
        Response login = con2.ignoreContentType(true).method(Method.GET).data(datas).cookies(rs.cookies()).execute();
        cookie = login.cookies();
        loginbody=login.body();
    }
}
