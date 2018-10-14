import cn.whbing.pro.web.async.Async1;
import cn.whbing.pro.web.async.CommonClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@ContextConfiguration("classpath:spring-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AsyncTest {
    @Resource
    Async1 async1;
    @Resource
    CommonClass commonClass;
    @Test
    public void testAsync(){
        async1.async("1");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----");
    }

    @Test
    public void testAsync2(){
        async1.async2();
        commonClass.say();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=====");
    }
}
