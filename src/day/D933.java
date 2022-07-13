package day;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class D933 {
    class RecentCounter {
        Deque<Integer> arr;
        int count;
        int left = -3000, right = 0;
        public RecentCounter() {
            arr = new LinkedList<>();
            count = 0;
        }

        public int ping(int t) {
            arr.add(t);
            right = t;
            left = right - 3000;
            count++;
            while(arr.peek()<left){
                arr.pollFirst();
                count--;
            }
            return count;
        }
    }
    @Test
    public void test(){
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);     // requests = [1]，范围是 [-2999,1]，返回 1
        recentCounter.ping(100);   // requests = [1, 100]，范围是 [-2900,100]，返回 2
        recentCounter.ping(3001);  // requests = [1, 100, 3001]，范围是 [1,3001]，返回 3
        recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002]，范围是 [2,3002]，返回 3

    }
}
