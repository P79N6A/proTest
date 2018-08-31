package cn.whbing.pro.web.service;

import cn.whbing.pro.web.service.impl.ReadSpecialLineServiceImpl;
import org.junit.Test;

/**
 * @author wanghongbing
 */
public class ReadSpecialLineTest {

    private ReadSpecialLineServiceImpl readSpecialLineService = new ReadSpecialLineServiceImpl();
    //String filePath = "/Users/didi/Downloads/kddcup.data_10_percent";
    String filePath = "/Users/didi/Work/test/ParseShell/data.sh";
    int startLine = 67;
    int endLine = 92;

    @Test
    public void test(){
        /*List<String> list =readSpecialLineService.readSpecialLine(filePath,startLine,endLine);
        for(String line : list) {
            System.out.println(line);
        }*/
        String s=readSpecialLineService.readSpecialLine(filePath,startLine,endLine);
        System.out.println(s);
        String shPath = ReadSpecialLineServiceImpl.class.getClassLoader().getResource("").getPath();//.sh文件的绝对路径

        //System.out.println(shPath);
    }
}
