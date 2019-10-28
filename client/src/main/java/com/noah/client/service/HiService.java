package com.noah.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hi")
public interface HiService {

    @RequestMapping(value = "/hi")
    String sayHi(@RequestParam(value = "name") String name);
}
