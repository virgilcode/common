package com.virgil.jdk;

import java.util.concurrent.*;

/**
 * Created by sunvirgil on 2017/3/16.
 */
public class VirgilExecutor {

    private static ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        Future<String> future = executor.submit(new Task());
        System.out.println("do other thing");
        try {
            String res=future.get();
            System.out.println(res);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("do thing");

    }

    static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            TimeUnit.SECONDS.sleep(2);
            return "future case";
        }
    }
}
