package com.liupeng.example23fastjson;

import com.alibaba.fastjson.JSON;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by liupeng on 2016/12/20.
 */
public class TestFastJson {
    public static void main(String[] args) throws Exception{
        testJSONString();
    }

    public static void testJSONString() throws IOException {
        Soldier s = new Soldier();
        s.n = "你";
        byte[] json = JSON.toJSONBytes(s);
        File f = new File("test_data.txt");
        if(f.exists()){
            f.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(f);
        OutputStreamWriter osw = new OutputStreamWriter(fos, Charset.forName("UTF-8"));
        osw.write("你");
        osw.close();

        File f2 = new File("data-file1");
        if(f2.exists()){
            f2.createNewFile();
        }
        FileInputStream fis = new FileInputStream(f2);
        InputStreamReader isr = new InputStreamReader(fis,Charset.forName("UTF-8"));
        //int sn = isr.read();
        //isr.close();
        BufferedReader br = new BufferedReader(isr);
        String nb = br.readLine();
        br.close();
        System.out.println(nb);

        QueryReportResult queryReportResult = JSON.parseObject(nb.getBytes(Charset.forName("UTF-8")),QueryReportResult.class);
        System.out.println(JSON.toJSONString(queryReportResult.getDataSet()).length());

        //Soldier sNew = JSON.parseObject(json,Soldier.class);
        //System.out.println((char)sn);
        //程序中的String始终是utf-16字符集编码
    }
}
class Soldier{
    public String n;
}
