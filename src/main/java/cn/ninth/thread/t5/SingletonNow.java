package cn.ninth.thread.t5;

/**
 * Title:程序的中文名称
 * Description: 饿汉式单例
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/22
 * 修改内容:
 */
public class SingletonNow {
    private static SingletonNow instance = new SingletonNow();

    // 私有化构造
    private SingletonNow(){

    }
    public static SingletonNow getInstance(){
        return instance;
    }
}
