package com.cache03.demo.controller;

import com.cache03.demo.model.User;
import com.cache03.demo.service.Cache;

//0704 2021 Cache, 3. iteration, jeg bruger main til at teste funktinoer.
public class Main {
    public static void main(String[] args){
        Cache cache = new Cache();
        User user2 = new User("thoma");
        cache.set(user2.getId(), user2.generateRandomAlphaString());
        System.out.println(cache.get("thoma"));

    }
}
