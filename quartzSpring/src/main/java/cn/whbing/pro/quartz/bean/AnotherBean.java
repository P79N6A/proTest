package cn.whbing.pro.quartz.bean;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class AnotherBean {
    public void printAnotherMessage(){
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("I am AnotherBean." + sf.format(date));
    }
}
