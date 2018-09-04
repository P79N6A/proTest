package cn.whbing.pro.web.controller;

import cn.whbing.pro.web.domain.entity.Foo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/foo")
public class FooController {

    @RequestMapping(value = "/foo",method = RequestMethod.POST)
    @ResponseBody
    public String foo(@Validated Foo foo, BindingResult bindingResult) {
        String res = "";
        if(bindingResult.hasErrors()){
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                res = res + fieldError.getDefaultMessage()+"\n";
            }
            return res;
        }
        return "success";
    }

}

