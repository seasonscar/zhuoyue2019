package com.lkm.ngram;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15082188 on 2019/1/12.
 */
public class GetFirstNameTypeUnion {
    public static void main(String[] args) throws IOException {
        long startTime=System.currentTimeMillis();
        String[] filename={"画家","书法家","文学家"};
        String str="";//每行的内容
        List<NgramDto> l=new ArrayList<>();
        List<NgramDto> searchList=new ArrayList<>();
        List<String> nameList=new ArrayList<>();
        List<String> nameZHList=new ArrayList<>();
        for(String s:filename){
            String url="D:\\zhuoyue"+"\\"+s+".txt";
            File temp=new File(url);
            InputStreamReader isr=new InputStreamReader(new FileInputStream(temp),"GBK");
            BufferedReader br = new BufferedReader(isr);
            while((str=br.readLine())!=null){
                String prefix="";
                String firstname="";
                for(int p=0;p<str.length();p++){
                    char c=str.charAt(p);
                    if('A'<c&&c<'z'){
                        prefix=String.valueOf(c)+String.valueOf(str.charAt(p+1));
                        prefix=prefix.toLowerCase();
                        firstname+=String.valueOf(c);
                        NgramDto searchDto=new NgramDto();
                        searchDto.setPrefix(prefix);
                        searchDto.setSearchWord(str.substring(p));
                        searchDto.setZhName(str.substring(0,p).trim());
                        searchList.add(searchDto);
                        for(int z=1;z<100;z++){
                            if(!Character.isSpace(str.charAt(p+z))){
                                firstname+=String.valueOf(str.charAt(p+z));
                            }else{
                                break;
                            }
                        }
                        if(hasPre(l,prefix)){
                            for(NgramDto n:l){
                                if(prefix.equals(n.getPrefix())){
                                    List<String> f=n.getFirstname();
                                    if(!hasFirstName(n,firstname)){
                                        n.getFirstname().add(firstname);
                                    }
                                    break;
                                }
                            }
                        }else{
                            NgramDto n=new NgramDto();
                            n.setPrefix(prefix);
                            List<String> f=new ArrayList<String>();
                            f.add(firstname);
                            n.setFirstname(f);
                            l.add(n);
                        }
                        break;
                    }
                }
                //System.out.println(str+","+prefix.toLowerCase()+","+firstname+",googlebooks-eng-all-2gram-20120701-"+prefix.toLowerCase());
            }
        }

        //DownLoadNgramData d=new DownLoadNgramData();
        //d.download(l);
        //System.out.println(l.size());
        CreateDataBase c=new CreateDataBase();
        c.createDataBase(l);
        //TransFinalData t=new TransFinalData();
        //t.transFinalData(searchList);

        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

    }


    private static boolean hasPre(List<NgramDto> l,String prefix){
        boolean ret=false;
        for(NgramDto n:l){
            if(prefix.equals(n.getPrefix())){
                 ret=true;
                 break;
            }
        }
        return ret;
    }

    private static boolean hasFirstName(NgramDto ngramDto,String firsrName){
        boolean ret=false;
        List<String> f=ngramDto.getFirstname();
        for(String n:f){
            if(firsrName.equals(n)){
                ret=true;
                break;
            }
        }
        return ret;
    }
}
