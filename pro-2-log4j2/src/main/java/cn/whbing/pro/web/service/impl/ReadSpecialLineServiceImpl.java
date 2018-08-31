package cn.whbing.pro.web.service.impl;

import cn.whbing.pro.web.service.ReadSpecialLineService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghongbing
 * 2018-08-01 18:06
 */
@Service
public class ReadSpecialLineServiceImpl implements ReadSpecialLineService {
    /**
     *
     * @param filePath (日志)文件路径
     * @param startLine 要查看的起始行
     * @param endLine 要查看的结束行
     * @return 返回原格式的String
     */
    public String readSpecialLine(String filePath, int startLine, int endLine) {
        if(startLine<0||endLine < startLine){
            return "请输出入正确的起止行！";
        }
        Process process = null;
        String shPath = "/Users/didi/CodeFile/proTest/pro-2/src/main/java/cn/whbing/pro/web/service/shell/read_log.sh";//.sh文件的绝对路径
        //shPath = shPath+"shell/read_log.sh";
        //String filePath1 = "/Users/didi/Downloads/kddcup.data_10_percent";

        // startLine、endLine、filePath 分别以$1、$2、$3传入shell
        String cmd = shPath + " " + startLine + " " + endLine + " " + filePath;

        //List<String> processList = new ArrayList<String>();
        StringBuffer stringBuffer= new StringBuffer();
        try {
            ProcessBuilder builder = new ProcessBuilder("/bin/sh", "-c", cmd);
            builder.redirectErrorStream(true);
            process = builder.start();
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = input.readLine()) != null) {
                //processList.add(line);
                stringBuffer.append(line+"\n");
            }
            stringBuffer.deleteCharAt(stringBuffer.length()-1);//删除末尾的n
            stringBuffer.deleteCharAt(stringBuffer.length()-1);//删除末尾的\
            input.close();
        } catch (IOException e) {
            return "请输入正确的文本路径";
            //e.printStackTrace();
        }
        //return processList;//返回List<String>时
        return stringBuffer.toString();
    }

}