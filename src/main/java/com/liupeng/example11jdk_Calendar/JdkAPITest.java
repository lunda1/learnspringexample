package com.liupeng.example11jdk_Calendar;

import com.google.common.base.Joiner;
import org.quartz.CronExpression;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by liupeng on 2016/7/11.
 */
public class JdkAPITest {

    public static void main(String[] args) {
//        testFormat();
        testCalendarDateRange();
    }

    public void testCronExpression(){
        String cron = "0/10 * * * * ?";
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH");
        SimpleDateFormat df2 = new SimpleDateFormat("HH");
        String nowDateString = null; //举例：2016-10-02 10(包含小时)
        Date nowDate = null;
        try {
            nowDateString = df.format(now);
            nowDate = df.parse(nowDateString);
        } catch (ParseException e) {
            //LOG.error("SchRunTaskHandleThread getSendHour() parse date error ",e);
            e.printStackTrace();
        }
        CronExpression cronExpression = null;
        try {
            cronExpression = new CronExpression(cron);
        } catch (ParseException e) {
            //LOG.error("SchRunTaskHandleThread getSendHour() parse cron error ",e);
            e.printStackTrace();
        }
        Date nextFireDate = cronExpression.getNextValidTimeAfter(nowDate);
        String dateStr = df2.format(nextFireDate);

        System.out.println("------------dateStr.length()-------------- "+dateStr.length());
        System.out.println("------------dateStr-------------- "+dateStr);
        System.out.println("------------运行时间-------------- "+dateStr.substring(11,dateStr.length()));
    }

    public void testCalendar(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println("\r\n");
        System.out.println("HOUR: "+calendar.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: "+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("now :"+df.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_MONTH,1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        System.out.println("tomorrow :"+df.format(calendar.getTime()));
//        calendar.set(Calendar.HOUR);
    }

    public void testCalendar2(){
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println("-----"+dayOfWeek+"-------"+dayOfWeekInMonth);
    }

    public void testJoiner(){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(1);
        String str = Joiner.on(",").join(list);
        System.out.println("-----"+str);
    }

    public static void testFormat(){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date begin = null;
        Date end = null;
        try {
            begin = format.parse("20:12:36");
            end = format.parse("18:39:43");
            System.out.println("---------------"+(end.getTime()-begin.getTime())/1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void testCalendarEnum(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        Calendar b = Calendar.getInstance();
        Calendar e = Calendar.getInstance();
        System.out.println("\r\n");
        System.out.println("HOUR: "+calendar.get(Calendar.HOUR));
        System.out.println("MONTH: "+calendar.get(Calendar.MONTH));
        System.out.println("HOUR_OF_DAY: "+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("DAY_OF_WEEK: "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_WEEK_IN_MONTH: "+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));//从每月1号开始1-7为第一周,8-14号为第二周，15-21为第三周
        System.out.println("WEEK_OF_MONTH: "+calendar.get(Calendar.WEEK_OF_MONTH));//当月的第几周
        System.out.println("WEEK_OF_YEAR: "+calendar.get(Calendar.WEEK_OF_YEAR));//当年的第几周
        System.out.println("now :"+df.format(calendar.getTime()));
    }

    public static void testCalendarDateRange(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        Calendar b = Calendar.getInstance();
        Calendar e = Calendar.getInstance();

        b.add(Calendar.DATE,b.get(Calendar.DAY_OF_WEEK)+1);//下一周的周一
        e.add(Calendar.DATE,e.get(Calendar.DAY_OF_WEEK)+7);//下一周的周日
//        b.add(Calendar.DATE,2-b.get(Calendar.DAY_OF_WEEK));//本周的周一
//        e.add(Calendar.DATE,8-e.get(Calendar.DAY_OF_WEEK));//本周的周一
//        b.add(Calendar.DATE,2-b.get(Calendar.DAY_OF_WEEK)-7);//上一周的周一
//        e.add(Calendar.DATE,1-e.get(Calendar.DAY_OF_WEEK));//上一周的周日
        System.out.println("b :"+df.format(b.getTime()));
        System.out.println("e :"+df.format(e.getTime()));
    }
}
