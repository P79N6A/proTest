package cn.whbing.pro.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PrintScheduler {
    public static void main(String[] args) throws SchedulerException {
        //1.创建JobDetail实例，并与printJob Class绑定
        JobDetail jobDetail = JobBuilder
                .newJob(PrintJob.class)
                .withIdentity("myjob","group1")
                .usingJobData("message","hello myjob1")
                .usingJobData("FloatJobValue",3.14F)
                .build();

        //2.定义Trigger实例
        Date d = new Date();
        SimpleTrigger trigger = (SimpleTrigger) TriggerBuilder
                .newTrigger()
                .withIdentity("mytrigger","group1")
                .usingJobData("message","hello mytrigger1")
                .usingJobData("DoubleTriggerValue",5.21D)
                .startAt(new Date(d.getTime()+4000))
                .withSchedule(
                        SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(2)
                        .withRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY)
                )
                .build();
        //2(1).定义CronTrigger
        CronTrigger cronTrigger =TriggerBuilder
                .newTrigger()
                .withIdentity("myCronTrigger","group1")
                .withSchedule(
                        CronScheduleBuilder.cronSchedule("0/10 * * ? * *")
                )
                .build();
        //3.通过Scheduler工厂获得Scheduler实例
        SchedulerFactory sf= new StdSchedulerFactory();
        Scheduler scheduler = sf.getScheduler();

        LocalDateTime timeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd hh:mm:ss");
        System.out.println("Current time:"+formatter.format(timeNow));


        //scheduler.scheduleJob(jobDetail,trigger);
        scheduler.scheduleJob(jobDetail,cronTrigger);
        scheduler.start();//顺序无关
    }
}
