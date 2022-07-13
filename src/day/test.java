package day;

import org.junit.Test;

import java.util.HashSet;

public class test {
    @Test
    public void test(){
        HashSet<Long>r  = new HashSet<>();
        long tmp =(1)<<32 + (1);
        System.out.println(tmp);
        System.out.println(Long.toHexString(tmp));
        r.add(((long)2)<<32 + ((long)1));

    }
}
