package multiThread;
/* *
/* *
 * @Author Billyme
 * @Date  2022/3/10 上午 11:23
 * @Description  放弃当前的CPU资源， 放弃的时间不确定
 * @param
 * @return
 * */

class MyThread2 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 5000000; i++) {
            Thread.yield();
            count = count + (i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time is "+(endTime-beginTime) +" millisecond");
    }

}

public class ThreadYield {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        myThread.start();

    }
}
