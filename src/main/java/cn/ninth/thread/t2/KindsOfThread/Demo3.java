package cn.ninth.thread.t2.KindsOfThread;

/**
 * Title:程序的中文名称
 * Description: 匿名内部类方式实现线程。
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/20
 * 修改内容:
 */
public class Demo3 {
    public static void main(String[] args) {
//        new Thread(){
//            @Override
//            public void run() {
//                while (true) {
//                    System.out.println("匿名内部类thread is running.....");
//                }
//            }
//        }.start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    System.out.println("匿名内部类Runnable type thread is running.....");
//                }
//            }
//        }).start();

        //肯定是输出sub,根据多态的规则，子类实现了父了方法则调用子类的。
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        }){
            @Override
            public void run() {
                System.out.println("sub");
            }
        }.start();
    }
}
