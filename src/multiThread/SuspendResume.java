package multiThread;

/* *
 * @Author Billyme
 * @Date  2022/3/10 上午 11:00
 * @Description  暂停线程与恢复线程该方法已被禁用，缺点是独占性
 * @param
 * @return
 * */
public class SuspendResume {
    public static void main(String[] args) {
        try{
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(500);
            myThread.suspend();
            Thread.sleep(2000);
            myThread.resume();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
