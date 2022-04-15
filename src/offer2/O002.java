package offer2;

import org.junit.Test;

public class O002 {
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2)+Integer.parseInt(b, 2));
    }

    @Test
    public void test(){
        System.out.println(addBinary("11", "10"));
    }
}
