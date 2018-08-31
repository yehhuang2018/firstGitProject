package cn.ninth.service;

/**
 * Title:程序的中文名称
 * Description: 程序功能的描述
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/16
 * 修改内容:
 */

class PrintNum implements Runnable{
    private int i=0;
    @Override
    public void run() {
        while(true) {
            printNum();
        }
    }
    public synchronized void printNum(){
        notify();
        if(i<100){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            i++;
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Test1To100With2Thread {
    public static void main(String[] args) {
        PrintNum printNum=new PrintNum();
        Thread t1=new Thread(printNum,"thread1");
        Thread t2=new Thread(printNum,"thread2");
        t1.start();
        t2.start();
    }
}
