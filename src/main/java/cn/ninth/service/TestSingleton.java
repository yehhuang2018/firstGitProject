package cn.ninth.service;

/**
 * Title:程序的中文名称
 * Description: 程序功能的描述
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/16
 * 修改内容:
 */
class Singleton{
    private Singleton(){

    }
    private static Singleton instance=null;

    public static Singleton getInstance(){
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1==s2);

    }
}
