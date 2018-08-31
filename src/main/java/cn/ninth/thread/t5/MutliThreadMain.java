package cn.ninth.thread.t5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Title:程序的中文名称
 * Description: 程序功能的描述
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/22
 * 修改内容:
 */
public class MutliThreadMain {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(20);
        for(int i=0;i<20;i++){
            es.execute(new Runnable(){
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+":"+SingletonLazy.getInstance());
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
            es.shutdown();
    }
}
