package cn.ninth.thread.t6;

/**
 * Title:程序的中文名称
 * Description: 重入锁
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

    //第一个线程进来后，拿到了类实例这个锁，调用b时，虽然b需要锁，但并不会造成死锁。
    public synchronized void a(){
        System.out.println("a");
        b();
    }

    public synchronized void b(){
        System.out.println("b");
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Demo demo=new Demo();
                demo.a();
            }
        }).start();
    }
}
