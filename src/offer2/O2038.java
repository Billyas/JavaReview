package offer2;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class O2038 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int index = i + 1;
            while (index < temperatures.length) {
                if (temperatures[index] > temperatures[i]) {
                    res[i] = index - i;
                    break;
                }
                index++;
            }
        }
        return res;
    }

        public int[] dailyTemperatures3(int[] temperatures) {
            int length = temperatures.length;
            int[] ans = new int[length];
            Deque<Integer> stack = new LinkedList<Integer>();
            for (int i = 0; i < length; i++) {
                int temperature = temperatures[i];
                while (!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
                    int prevIndex = stack.pop();
                    ans[prevIndex] = i - prevIndex;
                }
                stack.push(i);
            }
            return ans;
        }

    @Test
    public void test(){
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
//        int[] res = dailyTemperatures(temperatures);
        int[] res = dailyTemperatures3(temperatures);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
