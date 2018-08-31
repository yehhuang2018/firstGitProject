package cn.ninth.thread.t5;

/**
 * Title:程序的中文名称
 * Description: 懒汉式加载单例
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/22
 * 修改内容:
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static synchronized SingletonLazy getInstance(){
        if (instance == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance=new SingletonLazy();
        }
        return instance;
    }
}
