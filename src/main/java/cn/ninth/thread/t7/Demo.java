package cn.ninth.thread.t7;

/**
 * Title:程序的中文名称
 * Description: 还没set，就先get，会取到不对的数据。需求是要先set，再get.
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/22
 * 修改内容:
 */
public class Demo {
    private int a=1;

    public synchronized int getA() {
        return a;
    }

    public synchronized void setA(int a) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.a = a;
    }

    public static void main(String[] args) {
        Demo demo=new Demo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.setA(10);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(demo.getA());
            }
        }).start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("最终的结果是:"+demo.getA());
    }
}
