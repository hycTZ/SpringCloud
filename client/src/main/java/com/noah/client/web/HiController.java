package com.noah.client.web;

import com.noah.client.mapper.SearchMapper;
import com.noah.client.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HiController {


    @Autowired
    HiService hiService;
    @Autowired
    SearchMapper searchMapper;


    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return hiService.sayHi(name);
    }


    @RequestMapping("/hioo")
    public String home() {
        return "hiooooooooooooooooo ";
    }


    @RequestMapping("/db")
    public List<String> searchDB() {
        return searchMapper.search();
    }

}
