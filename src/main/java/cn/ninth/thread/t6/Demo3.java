package cn.ninth.thread.t6;

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
public class Demo3 {
    private Object obj1=new Object();
    private Object obj2=new Object();

    public void a(){
        synchronized (obj1){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2){
                System.out.println("a()");
            }
        }
    }
    public void b(){
        synchronized (obj2){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj1){
                System.out.println("b()");
            }
        }
    }

    public static void main(String[] args) {
        Demo3 demo3=new Demo3();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo3.a();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                demo3.b();
            }
        }).start();
    }
}
