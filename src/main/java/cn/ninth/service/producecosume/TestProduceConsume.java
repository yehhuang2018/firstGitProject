package cn.ninth.service.producecosume;

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

class Clerk {
    int product;

    public synchronized void addProduct(){
        if(product>20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            product++;
            System.out.println(Thread.currentThread().getName()+"生产商品:"+product);
            notifyAll();
        }
    }

    public synchronized void ConsumeProduct(){
        if(product<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(Thread.currentThread().getName()+"消费商品:"+product);
            product--;
            notifyAll();
        }
    }
}

class Producer implements Runnable{
    Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {
        while(true) {
            clerk.addProduct();
        }
    }
}


class Consume implements Runnable{
    Clerk clerk;
    public Consume(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {
        while(true) {
            clerk.ConsumeProduct();
        }
    }
}

public class TestProduceConsume {

    public static void main(String[] args) {
        Clerk clerk=new Clerk();
        Producer p1=new Producer(clerk);
        Producer p2=new Producer(clerk);
        Consume c1=new Consume(clerk);

        Thread t1=new Thread(p1,"生产者1");
        Thread t2=new Thread(p2,"生产者2");
        Thread t3=new Thread(c1,"消费者1");

        t1.start();
        t2.start();
        t3.start();
    }
}
