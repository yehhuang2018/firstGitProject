package cn.ninth.thread.t4;

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
public class Demo {
    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadTarget());
        Thread t2=new Thread(new ThreadTarget());
        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}
