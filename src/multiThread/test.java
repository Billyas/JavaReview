package multiThread;


/**
 *
 *线程通信的例子：两个线程轮流打印100个数字
 *
 * 1.wait：一旦执行方法，线程进入阻塞状态，并释放同步锁
 * 2.notify：一旦执行方法，就会唤醒wait中优先级最高的线程
 * 3.notifyall：会唤醒所有线程
 *
 * 注意：
 * 1.这三个方法，都需要存在synchronized中
 * 2.默认都是this，除非同步监视器就是this，否则必须修改
 * 调用者必须是同步监视器，即同步监视器.wait/notify/notifyall,否则出现exception：
 * java.lang.IllegalMonitorStateException: current thread is not owner
 *3.这三个方法定义在java.lang.Object中，所以任何一个对象可以调用这三个方法
 *
 *
 * 面试题：slepp（）和wait（）方法的异同
 * 相同：1.都会使得当前的线程进入阻塞状态
 * 不同：1.thread类中使用sleep，object中调用wait
 *      2.wait必须再同步方法或者同步代码块中使用
 *      3.关于是否同步监视器，sleep不会释放锁，wait会释放锁
 *
 */
public class test {
    public static void main(String[] args) {
        Communication c1 = new Communication();
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);

        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();

    }
}
class Communication implements Runnable{
    private static int number = 1;
    Object object = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (object){

                object.notifyAll();//唤醒被阻塞的线程

                if(number<=100){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;


                    try {
                        //使得调用如下wait方法的线程，进入阻塞状态
                        //wait会释放锁
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else {
                    break;
                }
            }

        }
    }
}
