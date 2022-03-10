package multiThread;

/* *
 * @Author Billyme
 * @Date  2022/3/10 下午 4:32
 * @Description  synchronized锁重入
 * @param
 * @return
 * */

class Servicet{
    synchronized public  void service1(){
        System.out.println("service1");
        service2();
    }
    synchronized public  void service2(){
        System.out.println("service2");
        service3();
    }
    synchronized public  void service3(){
        System.out.println("service3");
    }
}

class MyThreadsc extends Thread{
    @Override
    public void run(){
        Servicet servicet = new Servicet();
        servicet.service1();
    }
}

public class SyncThread {
    public static void main(String[] args) {
        MyThreadsc myThreadsc = new MyThreadsc();
        myThreadsc.start();
    }
}
