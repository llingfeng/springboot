package com.imooc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by admin on 2017/1/14.
 */
@Controller
public class DemoController {

    @GetMapping(value = "/demo")
    public String demo(){
        return "index";
    }

}
