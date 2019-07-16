package com.github.xsh.thread;

/**
 * @date: 2019/7/16
 **/
public class ThreadOne implements Runnable{

    public void run() {
        System.out.println("线程启动了！");
    }

    public static void main(String[] args) {
        //线程创建两种形式，本质上没有区别
        //Thread有这个构造函数，可以传入一个实现了runnable的线程示例，里面其实也是调用run方法，所以一般推荐使用这种方式新建线程
        Thread thread = new Thread(new ThreadOne());
        thread.start();
        //线程启动后就不能重复调用start,会抛出异常，因为start方法里面会检查线程状态
        System.out.println("main函数执行了");
        //关于打印的先后顺序问题
        //主线程一定有先于子线程执行的，因为主线程优先拿到了cpu资源，即使这里设置子线程的优先级也不行
    }
}
