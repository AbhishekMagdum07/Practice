package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    Demo runner = new Demo();

    @Test
    void addition(){
        assertEquals(5,runner.add(3,5));
        System.out.println("Hello world");
    }


}