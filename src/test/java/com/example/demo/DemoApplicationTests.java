package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTests {

    @Test
    void testSayHello() {
        HelloService helloService = new HelloService();
        String result = helloService.sayHello();
        assertEquals("Hello, CI/CD!", result);
    }
}
