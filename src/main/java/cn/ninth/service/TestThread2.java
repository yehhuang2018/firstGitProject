package cn.ninth.service;

/**
 * Title:程序的中文名称
 * Description: 创建线程，一个打印1-100之间的偶数，另一个打印奇数。
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/15
 * 修改内容:
 */
class SubThread1 extends  Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"-->"+i);
            }
        }
    }
}

class SubThread2 extends  Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+"-->"+i);
            }
        }
    }
}

public class TestThread2 {
    public static void main(String[] args) {
        SubThread1 st1=new SubThread1();
        SubThread2 st2 = new SubThread2();
        st1.start();
        st2.start();

    }
}
