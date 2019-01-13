package com.lkm.ngram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class DownLoadNgramData {
    String demo="http://storage.googleapis.com/books/ngrams/books/googlebooks-eng-all-2gram-20120701-%s.gz";
    String demo2="googlebooks-eng-all-2gram-20120701-%s.gz";
    String datademo="bank checking\t1963\t12\t11";
    public void download(List<NgramDto> dto){
        for( NgramDto n:dto){
            String prefix=n.getPrefix();
            if(prefix.equals("ba")||prefix.equals("wa")||prefix.equals("bi")){
                continue;
            }
            String url=String.format(demo,prefix);
            String filename=String.format(demo2,prefix);
            try {
                System.out.println("开始下载:"+prefix);
                downloadNet(url,filename);
                System.out.println("下载结束:"+prefix);
            } catch (IOException e) {
                System.out.println("****下载异常****:"+prefix);
                e.printStackTrace();
            }
            System.out.println(url);
        }

    }

    public static void downloadNet(String downloadurl,String filename) throws IOException {
        // 下载网络文件
        int bytesum = 0;
        int byteread= 0;
        URL url = new URL(downloadurl);
        try {
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            FileOutputStream fs = new FileOutputStream("F:\\"+filename);

            byte[] buffer = new byte[1204];
            int length;
            while ((byteread = inStream.read(buffer)) != -1) {
                bytesum += byteread;
                //System.out.println(bytesum);
                fs.write(buffer, 0, byteread);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
