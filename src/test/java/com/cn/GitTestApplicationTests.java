package com.cn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class GitTestApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("初始化Git创库");
        System.out.println("zjr");
        int a = 10;
        a = a + 2;
        System.out.println(a);

    }

}
