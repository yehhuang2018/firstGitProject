package cn.ninth.service;

/**
 * Title:程序的中文名称
 * Description: 创建子线程，输出1-100，主线程执行同样的操作。使用多线程第一种方式继承Thread类来创建
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/15
 * 修改内容:
 */
class SubThread extends  Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
public class TestThread {
    public static void main(String[] args) {
        SubThread st1=new SubThread();
        SubThread st2=new SubThread();
        st1.start();
        st2.start();

        for(int i=0;i<100;i++){

            System.out.println(Thread.currentThread().getName()+"-->"+i);
            if(i%10==0){
                Thread.yield();
            }
        }
    }
}
