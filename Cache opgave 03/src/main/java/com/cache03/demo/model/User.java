package com.cache03.demo.model;

import java.util.Random;
import java.util.concurrent.TimeUnit;
//0604 2021 User-klassen til Cache-opgaven.
public class User {
    private String id;

    public User() {
        this.id = "not null";
    }

    public User(String id) {
        this.id = id;
    }

    public void makeIdLong() { //verbose sout lets me see program flow.
        //this is a test function.
        System.out.println("Start write makeIdLong nu.");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("wait in makeIdLong failed FSR.");
        } catch (IllegalMonitorStateException e) {
            System.out.println("something went wrong.");
        }
        System.out.println("Færdig nu.");

    }

    public String getId() {
        return this.id;
    }

    public void setId(String newId) {
        this.id = newId;
    }


    //0604 2021 det er meningen at koden her skal
    // lave en tilfældig alfabet-streng. som er *i* lang. Det første
    //loop kører ti gange.
    //til Result, og returnerer.
    public String generateRandomAlphaString() {
        String rr = "";
        char c = 'A';
        Random ran = new Random();
        for (int i = 0; i <= 10; i++){ // i<=10 siger at strengen kun er 10 lang.
            c += ran.nextInt(26);
            rr += c;
            c = 'A';
            try {
               TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Nogetgik galt i venteren på randomeren");
                e.printStackTrace();
            }
        }
        return rr;
    }
    }
