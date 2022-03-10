package multiThread;

/* *
 * @Author Billyme
 * @Date  2022/3/10 下午 3:52
 * @Description  使用对象加锁与Synchronized方法实现多线程安全
 * @param
 * @return
 * */
class Windows implements Runnable {

    private  int n = 1000;
    private  Object object = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized(object){
                if (n > 0) {
                    System.out.println(Thread.currentThread().getName()+" 卖票，票号="+n);
                    n--;
                } else {
                    break;
                }
            }

        }
    }

}

public class ShareTemp {
    public static void main(String[] args) {
        Windows win = new Windows();
        Thread thread1 = new Thread(win);
        Thread thread2 = new Thread(win);
        Thread thread3 = new Thread(win);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
