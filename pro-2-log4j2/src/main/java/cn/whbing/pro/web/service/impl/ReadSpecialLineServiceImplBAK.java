package cn.whbing.pro.web.service.impl;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 调用不含参数的shell命令，用这个比较方便
 */
@Service
public class ReadSpecialLineServiceImplBAK {

    public static void main(String[] args) {
        Process process = null;
        String shpath="/Users/didi/CodeFile/proTest/pro-2/src/main/java/cn/whbing/pro/web/service/shell/read_log.sh";//.sh文件的绝对路径
        //String filePath ="/Users/didi/Downloads/kddcup.data_10_percent";
        //String command = "/bin/sh " + shpath + " "+startLine+" "+endLine+" "+filePath;
        String command = "/bin/sh " + shpath ;
        //String cmd="sed -n '300000,300099p' /Users/didi/Downloads/kddcup.data_10_percent";
        List<String> processList = new ArrayList<String>();
        String time = null;
        try {
            process = Runtime.getRuntime().exec(command);
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = input.readLine()) != null) {
                processList.add(line);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : processList) {
            System.out.println(line);
        }
    }

}
