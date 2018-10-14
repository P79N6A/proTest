package cn.whbing.pro.web.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Async1 {
    @Transactional
    public  void async(String s){
        try {
            System.out.println("异步测试1开始"+s);
            Thread.sleep(1000);
            System.out.println("异步1"+s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Async("asyncTest")
    public  void async2(){
        try {
            System.out.println(Thread.currentThread().getName()+"=====");
            System.out.println("异步2");
        } catch (Exception e) {
            System.out.println("*****");
            e.printStackTrace();
        }
    }
}
