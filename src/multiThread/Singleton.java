package multiThread;

import org.junit.Test;

public class Singleton {
    volatile private static Singleton instance = null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}


