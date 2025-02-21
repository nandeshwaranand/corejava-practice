package threads;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

    public static void main(String[] args) {

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(5, 10, 2000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(10));

        executor.submit(()->{
            for (int num =0; num < 10; num++){
                System.out.println("Executing task:"+num+" by:"+Thread.currentThread());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        System.out.println("Active Threads:"+executor.getActiveCount());
        System.out.println("Pool Size:"+executor.getPoolSize());
    }
}

