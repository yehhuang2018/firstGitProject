package cn.ninth.thread.t2.KindsOfThread;

/**
 * Title:程序的中文名称
 * Description: 继承Thread方式创建线程
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/18
 * 修改内容:
 */
public class Demo1 extends Thread {
    @Override
    public void run() {
        while (!interrupted()) {
            System.out.println(Thread.currentThread().getName() + "开始执行……");
        }
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        Demo1 demo2 = new Demo1();
        demo1.start();
        demo2.start();

        demo1.interrupt();
    }
}
