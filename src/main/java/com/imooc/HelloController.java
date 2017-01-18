package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by admin on 2017/1/13.
 */
@RestController
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private String age;

    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello/{id}")
    public String say(@PathVariable("id") Integer id){
        System.out.println("id:"+id);
        return content;
    }

    @RequestMapping(value = "/hello3")
    public String say2(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        System.out.println("id:"+id);
        return content;
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String demo(){
        return girlProperties.getCupSize();
    }
}
