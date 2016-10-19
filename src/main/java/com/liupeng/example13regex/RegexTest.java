package com.liupeng.example13regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liupeng on 2016/9/19.
 */
public class RegexTest {

    public static void main(String[] args) {
        testRegex();
        testRegexPatternSplitAPI();
        testRegexParenthesisAPI1();
        testRegexParenthesisAPI2();
        testRegexParenthesisAPI3();
        testRegexParenthesisAPI4();
    }

    public static void testRegex(){
        String str1 = "2009-07-07 04:38:44 127.0.0.1 GET /robots.txt";
        String str2 = "2009-07-07 04:38:44 127.0.0.1 GET /posts/robotfile.txt";
        String str3 = "2009-07-08 04:38:44 127.0.0.1 GET /";

        Pattern p = Pattern.compile("^(?!.*?robots).*$");
        //来回切换str1/str2/str3
        Matcher m = p.matcher(str3);
        int i = 1;
        while (m.find()) {
            // Get the matching string
            String e = m.group();
            System.out.println((i++)+":"+e+" ");
        }
        System.out.println("\r\n------------------------------------------");
    }

    public static void testRegexPatternSplitAPI(){
        String str = "industry432industries3221industry1indust";
        Pattern p = Pattern.compile("industr(y|ies)");
        String[] rows = p.split(str);
        System.out.println("----pattern.split(str)--industr(y|ies)----");
        System.out.println("    regex:"+"industr(y|ies)");
        System.out.println("    str:"+"industry432industries3221industry1indust");
        int i = 1;
        for(String s : rows){
            System.out.println((i++)+":"+s+" ");
        }
        System.out.println("\r\n------------------------------------------");
    }

    public static void testRegexParenthesisAPI1(){
        String str = "industry432industries3221industry1indust";
        Pattern p = Pattern.compile("industr(y|ies)");
        Matcher m = p.matcher(str);
        System.out.println("----()--matcher.find()--industr(y|ies)----");
        System.out.println("    regex:"+"industr(y|ies)");
        System.out.println("    str:"+"industry432industries3221industry1indust");
        int i = 1;
        while (m.find()) {
            // Get the matching string
            String e = m.group();
            System.out.println((i++)+":"+e+" ");
        }
        System.out.println("\r\n------------------------------------------");
    }

    public static void testRegexParenthesisAPI2(){
        String str = "industry432industries3221industry1indust";
        Pattern p = Pattern.compile("industr(?:y|ies)");
        Matcher m = p.matcher(str);
        System.out.println("----(?:)--matcher.find()--industr(?:y|ies)----");
        System.out.println("    regex:"+"industr(?:y|ies)");
        System.out.println("    str:"+"industry432industries3221industry1indust");
        int i = 1;
        while (m.find()) {
            // Get the matching string
            String e = m.group();
            System.out.println((i++)+":"+e+" ");
        }
        System.out.println("\r\n------------------------------------------");
    }

    public static void testRegexParenthesisAPI3(){
        String str = "industry432industries3221industry1indust";
        Pattern p = Pattern.compile("industr(?=y|ies)");
        Matcher m = p.matcher(str);
        System.out.println("----(?=)--matcher.find()--industr(?=y|ies)----");
        System.out.println("    regex:"+"industr(?=y|ies)");
        System.out.println("    str:"+"industry432industries3221industry1indust");
        int i = 1;
        while (m.find()) {
            // Get the matching string
            String e = m.group();
            System.out.println((i++)+":"+e+" ");
        }
        System.out.println("\r\n------------------------------------------");
    }

    public static void testRegexParenthesisAPI4(){
        String str = "industry432industries3221industry1indust";
        Pattern p = Pattern.compile("industr(?!y|ies)");
        Matcher m = p.matcher(str);
        System.out.println("----(?!)--matcher.find()--industr(?!y|ies)----");
        System.out.println("    regex:"+"industr(?!y|ies)");
        System.out.println("    str:"+"industry432industries3221industry1indust");
        int i = 1;
        while (m.find()) {
            // Get the matching string
            String e = m.group();
            System.out.println((i++)+":"+e+" ");
        }
        System.out.println("\r\n------------------------------------------");
    }
}
