package org.dsa.samples;

import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFutureExample completableFutureExample = new CompletableFutureExample();
        System.out.println("I am before :)");
        Future<String> result = completableFutureExample.executeComplete();
        System.out.println(result);
        System.out.println("I am after :)");
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        Thread.sleep(10000);
        System.out.println("yoyo");
        System.out.println(result.get());
    }

    public Future<String> executeComplete() {
        CompletableFuture<String> cf = new CompletableFuture<>();
        //cf.thenAccept()
        Executors.newCachedThreadPool().submit(() ->
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            cf.complete("Hello");
            return null;
        });
    return cf;
    }
}
