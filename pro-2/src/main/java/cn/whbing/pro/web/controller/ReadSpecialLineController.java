package cn.whbing.pro.web.controller;

import cn.whbing.pro.web.service.ReadSpecialLineService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value="/read",method = RequestMethod.GET)
public class ReadSpecialLineController {
    @Resource
    ReadSpecialLineService readSpecialLineService;

    @RequestMapping("/line")
    public String read(){
        String filePath = "/Users/didi/Work/test/ParseShell/data.sh";
        int startLine = 67;
        int endLine = 92;
        String s=readSpecialLineService.readSpecialLine(filePath,startLine,endLine);
        return s;
    }
}
