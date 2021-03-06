package cn.whbing.pro.quartz.bean;


import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 方式二：使用JobDetailFactoryBean 演示
 * @author ZhangCheng on 2017-06-28
 *
 */

public class FirstScheduledJob extends QuartzJobBean {
    private AnotherBean anotherBean;

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    @Override
    protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("FirstScheduledJob Excutes!" + sf.format(date));
        this.anotherBean.printAnotherMessage();
    }

}

