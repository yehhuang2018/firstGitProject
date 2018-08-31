package cn.ninth.thread.t2.KindsOfThread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Title:程序的中文名称
 * Description: 使用spring创建线程。
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/21
 * 修改内容:
 */

public class Demo7 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        DemoService demoService = ctx.getBean(DemoService.class);
        demoService.a();
        demoService.b();
    }
}
