package multiThread;

/* *
 * @Author Billyme
 * @Date  2022/3/10 上午 11:02
 * @Description 放弃当前的CPU资源， 放弃的时间不确定
 * @param
 * @return
 * */
public class MyThread extends Thread {
        private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run(){
        while(true){
            i++;
        }
    }

}
