package cn.ninth.thread.t2.KindsOfThread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Title:程序的中文名称
 * Description: 程序功能的描述
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/21
 * 修改内容:
 */
@Service
public class DemoService {

    @Async
    public void a() {
        while (true) {

            System.out.println("a");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Async
    public void b() {
        while (true) {

            System.out.println("b");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

