package cn.ninth.thread.t1;

/**
 * Title:程序的中文名称
 * Description: 线程状态的说明
 *  * 线程状态分为 新建、可运行、运行、阻塞、死亡
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/18
 * 修改内容:
 */
public class ThredState implements  Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName()+":自定义的线程运行了……");
        }
    }

    public static void main(String[] args) {
        ThredState newThread=new ThredState();
        Thread thread =new Thread(newThread,"测试线程");//创建线程，并指定线程的执行任务.此刻为new状态
        thread.start();//启动线程
        while (true) {
            System.out.println("主线程运行了");
        }
    }
}
