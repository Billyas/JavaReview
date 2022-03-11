package multiThread;

/**
 * 线程通信的应用：生产者/消费者问题
 *
 * 分析：
 * 1.生产者线程、消费者线程
 * 2，共享数据：店员、产品
 * 3.如何解决线程的安全问题
 * 4.解决线程的安全问题：三个方法
 * 5.是否涉及到线程通信
 *
 */
public class ProCusCommunication {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");
        Customer p2 = new Customer(clerk);
        p2.setName("消费者1");
        Customer p3 = new Customer(clerk);
        p3.setName("消费者2");

        p1.start();
        p2.start();
        p3.start();

    }
}
class Producer extends Thread{//生产者

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"开始生产");

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}
class Customer extends Thread{//消费者
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"开始消费");

        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.customerConsume();
        }
    }
}
class Clerk{
    private int productCount = 0;
    //生产产品
    public synchronized void produceProduct() {
        if (productCount<20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+"：开始生产，第"+productCount+"个产品");
            notify();
        }
        else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void customerConsume() {//消费

        if (productCount>0){
            System.out.println(Thread.currentThread().getName()+"：开始消费，第"+productCount+"个产品");
            productCount--;
            notify();
        }
        else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
