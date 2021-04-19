package com.cache03.demo.service;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
//0204 2021 Cache-klassen HVMW
//cachen er IKKE til users, den er til deres tilgfældlige string!
public class Cache {//jeg laver et hashmap

    private static int NumberOfUsers;
    private Map<String, String> mapmap;

    public Cache(){
        this.NumberOfUsers = 0;
        this.mapmap = new HashMap<String, String>();
    }

    public String get(String key) {
        return mapmap.get(key);
    }

    public void set(String key, String value) {
        mapmap.put(key, value);
    }

    public boolean hasKey(String key) {
        return mapmap.containsKey(key);
    }

    public void deleteKey(int key) {
        mapmap.remove(key);
    }

    public int ReturnTheNumberOfUsersAndIncrementNumberOfUsers() {
        return NumberOfUsers++;

    }
}