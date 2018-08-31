package cn.ninth.thread.t2.KindsOfThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Title:程序的中文名称
 * Description: 线程池
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/21
 * 修改内容:
 */
public class Demo6 {
    public static void main(String[] args) {
        //创建带有10个线程的线程池。循环做100次线程任务，但只有10个线程做这100件事。
//        Executor threadPool= Executors.newFixedThreadPool(10);

        //创建动态大小的线程池，根据需要创建新的线程。
        Executor threadPool= Executors.newCachedThreadPool();
        for(int i=0;i<100;i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        ((ExecutorService) threadPool).shutdown();
    }
}
