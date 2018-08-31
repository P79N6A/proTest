package cn.whbing.pro.web.service.test;

import cn.whbing.pro.web.dao.ConnectTestDao;
import cn.whbing.pro.web.service.ConnectTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@ContextConfiguration("classpath:spring-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ConnectTestTest {
    @Resource
    ConnectTestService connectTestService;
    @Test
    public void test(){
        List<String> list=connectTestService.test();
        System.out.println("----------"+list.size());
    }
}
