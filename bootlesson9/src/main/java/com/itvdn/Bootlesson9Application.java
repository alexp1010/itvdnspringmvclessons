package com.itvdn;

import com.itvdn.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bootlesson9Application implements CommandLineRunner {

    @Autowired
    private AsyncService asyncService;

    public static void main(String[] args) {
        SpringApplication.run(Bootlesson9Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 3; i++) {
            asyncService.doAsync();
        }
    }
}
