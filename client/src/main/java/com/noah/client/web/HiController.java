package com.noah.client.web;

import com.noah.client.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {


    @Autowired
    HiService hiService;
    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return hiService.sayHi(name);
    }


    @RequestMapping("/hioo")
    public String home() {
        return "hiooooooooooooooooo ";
    }

}
