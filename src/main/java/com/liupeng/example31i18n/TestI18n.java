package com.liupeng.example31i18n;

import sun.plugin2.message.Message;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by liupeng on 2017/1/28.
 */
public class TestI18n {
    public static void main(String[] args) {
        Locale locale = new Locale("zh","CN");
        Locale locale1 = new Locale("en","US");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        NumberFormat format1 = NumberFormat.getCurrencyInstance(locale1);
        double d = 1232322;
        System.out.println(format.format(d));
        System.out.println(format1.format(d));
    }
}
