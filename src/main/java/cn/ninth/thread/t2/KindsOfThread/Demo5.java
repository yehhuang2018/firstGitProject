package cn.ninth.thread.t2.KindsOfThread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Title:程序的中文名称
 * Description: 定时器  每隔一秒打印一次
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/21
 * 修改内容:
 */
public class Demo5 {
    public static void main(String[] args) {
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //实现定时任务
                System.out.println("time task is running......");
            }
        },0,1000);
    }
}
