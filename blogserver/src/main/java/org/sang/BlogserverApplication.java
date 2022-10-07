package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//开启定时任务支持
public class BlogserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogserverApplication.class, args);
        System.out.println("why");
        System.out.println("why");
        System.out.println("么么哒");
        System.out.println("为战而生,至死方休");
        System.out.println("asddasdasd");
    }
}
