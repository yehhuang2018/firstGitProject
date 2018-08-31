package cn.ninth.thread.t2.KindsOfThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Title:程序的中文名称
 * Description: 带返回值并能抛出异常的线程。
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/20
 * 修改内容:
 */
public class Demo4 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("正在进行运算……");
        Thread.sleep(3000);

        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Demo4 demo4 = new Demo4();
        FutureTask<Integer> task = new FutureTask<>(demo4);
        Thread t=new Thread(task);
        t.start();
        System.out.println("我先干别的……");

        Integer result=task.get();
        System.out.println("返回的结果是"+result);

    }
}
