package com.itvdn.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

    @Async("ThreadPoolTaskExecutor")
    public CompletableFuture<Integer> doAsync() {
        System.out.println("doAsync() started");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");

        date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        System.out.println("doAsync() ended");

        return CompletableFuture.completedFuture(1);
    }
}
