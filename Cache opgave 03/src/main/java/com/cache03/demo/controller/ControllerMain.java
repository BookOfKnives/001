package com.cache03.demo.controller;

import com.cache03.demo.model.User;
import com.cache03.demo.service.Cache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerMain {

    Cache cache = new Cache();
    User user2 = new User("thoma");

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @PostMapping("/home2")
    public String home2(@RequestParam("note") String note){
        return "home2";
    }


    @GetMapping("/test")
    public @ResponseBody String logon(){
        System.out.println("start of test endpoint.");
        if(cache.hasKey("thoma")){
            System.out.println("if of test now executing." + cache.get("thoma"));
            return cache.get("thoma");
        }
        else {
            System.out.println("else of test now executing." + cache.get("thoma"));
            cache.set(user2.getId(), user2.generateRandomAlphaString());
        }
        System.out.println("End of test endpoint." + cache.get("thoma"));
        return cache.get("thoma");
    }

}
