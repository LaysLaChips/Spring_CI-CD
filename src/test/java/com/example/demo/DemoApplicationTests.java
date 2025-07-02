package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoApplicationTests {

    @Test
    void sayHello_shouldReturnHelloMessage() {
        HelloService helloService = new HelloService();
        String result = helloService.sayHello();
        assertEquals("Hello, CI/CD!", result);
    }
}
