package cn.ninth.thread.t2.KindsOfThread;

/**
 * Title:程序的中文名称
 * Description: 实现runnable接口方式，以任务形式存在的线程。
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/20
 * 修改内容:
 */
public class Demo2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("thread is running....");
        }
    }

    public static void main(String[] args) {
        Demo2 demo2=new Demo2();
        Thread t=new Thread(demo2);
        t.start();
    }
}
