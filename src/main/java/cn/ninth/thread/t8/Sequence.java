package cn.ninth.thread.t8;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Title:程序的中文名称
 * Description: 自定义一个数字序列生成器sequence
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/22
 * 修改内容:
 */
public class Sequence {
    private AtomicInteger value = new AtomicInteger(0);

    private AtomicReference<User> user = new AtomicReference<>();
    public int getNext() {


//        return value++;
        return value.getAndIncrement();//value++
//        return value.incrementAndGet();//++value;
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence();
//        while (true) {
//            System.out.println(sequence.getNext());
//        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + ":" + sequence.getNext());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + ":" + sequence.getNext());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + ":" + sequence.getNext());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
