package offer;

public class juk {
    int a;
    //新建一个线程
    public static void main(String[] args) {
        //新建一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }).start();


    }
}
