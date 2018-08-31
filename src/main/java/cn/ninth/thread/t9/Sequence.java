package cn.ninth.thread.t9;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Title:程序的中文名称 Description: 自定义一个数字序列生成器sequence
 *
 * @author huangye yehhuang@yeah.com
 * @version 1.00.00 修改记录 修改后版本: 修改人: 修改日期: 2018/8/22 修改内容:
 */
public class Sequence {
	private int value=0;
	private Lock lock = new ReentrantLock();
	
	public int getNext() {
		int a;
		try {
			lock.lock();
			a=value++;
		}finally {
			lock.unlock();
		}
		return a;
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + ":" + sequence.getNext());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + ":" + sequence.getNext());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + ":" + sequence.getNext());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
