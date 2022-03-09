/**
 * 建立三个线程A、B、C，
 * A线程打印10次字母A，
 * B线程打印10次字母B,
 * C线程打印10次字母C，但是要求三个线程同时运行，
 * 并且实现交替打印，即按照ABCABCABC的顺序打印。
 */

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class test {

    public static void main(String[] args) {
        Print();
    }

    public static void Print(){
        for(int i = 1; i<=10;i++){
            CompletableFuture.runAsync(()->{
                System.out.print("A");
            }).thenRunAsync(()->{
                System.out.print("B");
            }).thenRunAsync(()->{
                System.out.print("C");
            });

            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("");
    }
}


