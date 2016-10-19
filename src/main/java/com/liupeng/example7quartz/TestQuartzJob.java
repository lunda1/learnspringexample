package com.liupeng.example7quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import java.util.Date;
import static org.quartz.DateBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.CronScheduleBuilder.*;

/**
 * Created by piezi on 2016/5/11.
 */
public class TestQuartzJob {
    public static void main(String[] args){
        JobDetail jobDetail= JobBuilder.newJob(MyQuartzJob.class)
                .withIdentity("testJob_1","group_1")
                .build();

        Trigger trigger= TriggerBuilder
                .newTrigger()
                .withIdentity("trigger_1","group_1")
//                .startNow()//立即开始
                .startAt(evenMinuteDate(new Date()))//下一分钟开始
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(3)
                        .repeatForever()//时间间隔
                        //.withRepeatCount(5)        //重复次数(将执行6次)
                )
                .build();
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = null;
        try {
            sched = sf.getScheduler();
            sched.scheduleJob(jobDetail,trigger);
            sched.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
