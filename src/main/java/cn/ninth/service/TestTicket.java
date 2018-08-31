package cn.ninth.service;

/**
 * Title:程序的中文名称
 * Description: 开多个窗口进行卖票
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/15
 * 修改内容:
 */

class Window implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        synchronized (this) {
            while (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + ticket--);
            }
        }
    }
}

public class TestTicket {
    public static void main(String[] args) {
        Window w1 = new Window();
//        Window w2=new Window();
//        Window w3=new Window();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("1");
        t2.setName("2");
        t3.setName("3");
        t1.start();
        t2.start();
        t3.start();

    }
}
