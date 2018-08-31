package cn.ninth.thread.t6;

import java.util.Random;

/**
 * Title:程序的中文名称
 * Description: 多个线程执行完毕后，打印一句话再结束。
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/22
 * 修改内容:
 */
public class Demo2 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"开始执行");
                try {
                    Thread.sleep(new Random().nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"执行完毕");
            }
        }).start();new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"开始执行");
                try {
                    Thread.sleep(new Random().nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"执行完毕");
            }
        }).start();new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"开始执行");
                try {
                    Thread.sleep(new Random().nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"执行完毕");
            }
        }).start();new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"开始执行");
                try {
                    Thread.sleep(new Random().nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"执行完毕");
            }
        }).start();new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"开始执行");
                try {
                    Thread.sleep(new Random().nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"执行完毕");
            }
        }).start();
        //当前活动线程的数量
//        Thread.activeCount();
        while(Thread.activeCount()!=1) {
            //此处即为自旋的判断
        }
            System.out.println("所有线程执行完毕");
    }

}
