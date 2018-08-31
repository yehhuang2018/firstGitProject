package cn.ninth.thread.t5;

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
public class Main {
    public static void main(String[] args) {
        SingletonNow s1=SingletonNow.getInstance();
        SingletonNow s2=SingletonNow.getInstance();
        SingletonNow s3=SingletonNow.getInstance();
        SingletonNow s4=SingletonNow.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
