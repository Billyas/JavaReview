package multiThread;

/* *
 * @Author Billyme
 * @Date  2022/3/10 上午 11:02
 * @Description 放弃当前的CPU资源， 放弃的时间不确定
 * @param
 * @return
 * */
public class MyThread extends Thread {
     static int i = 0;

    @Override
     public void run(){
        synchronized(this) {
            while (i <= 9999) {
                i++;
                System.out.println(this.getName() + " " + i);
            }
        }
    }

}
