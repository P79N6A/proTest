package cn.whbing.pro.quartz;

import org.quartz.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintJob implements Job {

    private String message;
    private Float FloatJobValue;
    private Double DoubleTriggerValue;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Float getFloatJobValue() {
        return FloatJobValue;
    }

    public void setFloatJobValue(Float floatJobValue) {
        FloatJobValue = floatJobValue;
    }

    public Double getDoubleTriggerValue() {
        return DoubleTriggerValue;
    }

    public void setDoubleTriggerValue(Double doubleTriggerValue) {
        DoubleTriggerValue = doubleTriggerValue;
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //编写具体的业务逻辑即可
        //打印当前时间及hello
        LocalDateTime timeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd hh:mm:ss");
        System.out.println("execute time:"+formatter.format(timeNow));

        System.out.println("hello!");

        //获取jobDetail和trigger信息
        System.out.println("My job name and group:"
                        +context.getJobDetail().getKey().getName()
                        +"，"+context.getJobDetail().getKey().getGroup());
        System.out.println("My trigger name and group:"
                        +context.getTrigger().getKey().getName()
                        +"，"+context.getTrigger().getKey().getGroup());
        JobDataMap dataMap = context.getJobDetail().getJobDataMap();
        JobDataMap tdataMap = context.getTrigger().getJobDataMap();

        String message = dataMap.getString("message");
        System.out.println(message);
        //trigger和其他字段同理

        //通过getMergedJobDataMap获取jobdetail和trigger合并后的信息
        JobDataMap data = context.getMergedJobDataMap();
        //有相同的key时，trigger中的key会覆盖jobdetail
        System.out.println(data.getString("message"));

        //直接通过setter后的字段访问
        System.out.println("直接通过字段访问1："+message);
        System.out.println("直接通过字段访问2："+FloatJobValue);
        System.out.println("直接通过字段访问3："+DoubleTriggerValue);

        //jobKey（name和group）
        Trigger t = context.getTrigger();
        System.out.println("trigger jonKey"+t.getJobKey().getName());
    }
}
