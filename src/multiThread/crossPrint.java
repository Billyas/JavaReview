package multiThread;

/* *
 * @Author Billyme
 * @Date  2022/3/11 下午 8:44
 * @Description  交替打印数字
 * @param
 * @return
 * */

/*
* 1. wait(), notify(), notifyall(),都必须在synchronized同步代码块或者时同步方法内使用
* 2. 三者的调用者必须时同步代码块的同步监视器监视器，如下例中的this
* 3. 三者定义在object类中
* */

public class crossPrint {
    static class MyThread implements Runnable {

        private int a = 100;

        @Override
        public void run() {

            while (a > 0) {
                synchronized (this) {
                    notifyAll();
                    System.out.println(Thread.currentThread().getName() + " = " + a);
                    a--;

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        t1.start();
        t2.start();
        t3.start();
    }
}
