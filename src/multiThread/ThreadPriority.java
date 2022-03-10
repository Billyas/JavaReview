package multiThread;

/* *
 * @Author Billyme
 * @Date  2022/3/10 上午 11:35
 * @Description  线程的优先级从1-10，具有继承性，
 * @param
 * @return
 * */
class MyThread3 extends Thread {

    @Override
    public void run(){
        System.out.println("MyThread priority is "+ this.getPriority());
    }

}

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());

        MyThread3 myThread3 = new MyThread3();
        myThread3.start();
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());

    }
}
