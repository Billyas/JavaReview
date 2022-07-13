package day;

import org.junit.Test;

public class D6061 {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(total<cost1&&total<cost2){
            return 1;
        }
        long count = 0;
        int f = 0;
        if(total<cost1){
            f = 1;
            //只能买0个钢笔
            long n = total/cost2;
            return n+1;
        }
        if(total<cost2){
            f = 2;
            long n = total/cost1;
            return n+1;
        }
        int n1 = total/cost1;
        for(int i=0; i<=n1; i++){
            long tmp = total - i*cost1;
            long cc = tmp/cost2;
            count+=cc+1;
        }
        return count;
    }
    @Test
    public void test(){
        System.out.println(waysToBuyPensPencils(1000000, 1, 1));
    }
}
