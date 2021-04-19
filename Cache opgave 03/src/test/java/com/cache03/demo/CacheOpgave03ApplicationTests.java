package com.cache03.demo;

import com.cache03.demo.controller.ControllerMain;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CacheOpgave03ApplicationTests {

    ControllerMain CM = new ControllerMain();

    @Test
    void testMain(){
        CM.home();
    }


    @Test
    void contextLoads() {
    }

}
