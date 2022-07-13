package day;

import org.junit.Test;

public class D5218 {
    public int minimumNumbers(int num, int k) {
        if(num==0) return 0;
        for (int i = 1; i < 11; i++) {
            if( i*k%10 == num %10){
                if (i*k <=num){
                    return i;
                }
                else{
                    return -1;
                }
            }
        }
        return -1;
    }

    @Test
    public void test(){
        System.out.println(minimumNumbers(58, 9));
    }
}
