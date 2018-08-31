package cn.ninth.service;

import java.math.BigDecimal;

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
class Account {
    private BigDecimal balance = new BigDecimal(0);

    public synchronized void setDeposit(BigDecimal balance) {
        this.balance = this.balance.add(balance);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"当前余额:" + this.balance.toString());
    }
}

class Deposit implements Runnable {
    private Account account;

    public Deposit(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.setDeposit(new BigDecimal(1000));
        }
    }
}

public class TestDeposit {
    public static void main(String[] args) {
        Account account = new Account();
        Deposit deposit = new Deposit(account);
        Thread t1 = new Thread(deposit, "c1");
        Thread t2 = new Thread(deposit, "c2");
        t1.start();
        t2.start();
    }
}
