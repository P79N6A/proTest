package cn.whbing.pro.web.service;

import cn.whbing.pro.web.service.impl.ReadSpecialLineServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author wanghongbing
 */
@ContextConfiguration("classpath:spring-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ReadSpecialLineSringTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReadSpecialLineServiceImpl.class);
    @Resource
    private ReadSpecialLineServiceImpl readSpecialLineService;
    String filePath = "/Users/didi/Downloads/kddcup.data_10_percent";
    //String filePath = "/Users/didi/Work/test/ParseShell/data.sh";
    int startLine = 200000;
    int endLine = 200019;

    @Test
    public void test(){
        /*List<String> list =readSpecialLineService.readSpecialLine(filePath,startLine,endLine);
        for(String line : list) {
            System.out.println(line);
        }*/
        String s=readSpecialLineService.readSpecialLine(filePath,startLine,endLine);
        //System.out.println(s);
        String shPath = ReadSpecialLineServiceImpl.class.getClassLoader().getResource("").getPath();//.sh文件的绝对路径

        //System.out.println(shPath);
        LOGGER.info(s);
    }
}
