package com.github.xsh.thread;

/**
 * @date: 2019/7/16
 **/
public class ThreadTwo extends Thread{
    @Override
    public void run() {
        System.out.println("线程启动了");
    }

    public static void main(String[] args) {
        System.out.println(currentThread().getPriority());
        ThreadTwo threadTwo = new ThreadTwo();
        threadTwo.start();
        System.out.println(threadTwo.getPriority());
        System.out.println("main函数执行完了");
    }
}
