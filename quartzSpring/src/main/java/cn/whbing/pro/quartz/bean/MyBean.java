package cn.whbing.pro.quartz.bean;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class MyBean {
    public void printMessage(){
        System.out.println("My bean execute!"
                +DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
    }
}
