package cn.ninth.thread.t7;

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
public class Demo2 {
    public volatile boolean flag = false;

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("第" + i + "次执行");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                demo2.flag = true;
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (!demo2.flag) {
                }
                System.out.println("线程2执行了");
                System.out.println("相当于在等1执行完后才会执行");
            }
        }).start();
    }
}
