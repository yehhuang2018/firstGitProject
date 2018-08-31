package cn.ninth.thread.t2.KindsOfThread;

import java.util.Arrays;
import java.util.List;

/**
 * Title:程序的中文名称
 * Description: 计算集合中的值的和运算。
 *
 * @author huangye  yehhuang@yeah.com
 * @version 1.00.00
 * 修改记录
 * 修改后版本:
 * 修改人:
 * 修改日期: 2018/8/21
 * 修改内容:
 */
public class Demo8 {
    public static int add(List<Integer> values){
        values.parallelStream().forEach(System.out::println);//打印出来的值与提供的values是不一致的，则说明是并行执行的。
        return values.parallelStream().mapToInt(a ->a).sum();
    }


    public static void main(String[] args) {
        List<Integer> intList=Arrays.asList(10,20,30,40,50);
        int result = add(intList);
        System.out.println("计算的结果是:"+result);
    }
}
