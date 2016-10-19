package com.liupeng.example7quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * Created by piezi on 2016/5/11.
 */
public class MyQuartzJob implements Job{

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("My first quartz job !"+ new Date());
    }
}
