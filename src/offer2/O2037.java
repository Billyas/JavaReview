package offer2;

import org.junit.Test;

import java.util.Stack;

public class O2037 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack =  new Stack<>();
        int  p  = 0;
        while (p < asteroids.length) {
            if(stack.empty() || asteroids[p] > 0 || stack.peek() < 0) {
                stack.push(asteroids[p]);
            }else if(stack.peek() <= -asteroids[p]) {
                if(stack.pop() < -asteroids[p]) {
                    continue;
                }
            }
            p++;
        }
        int[] res = new int[stack.size()];
        for(int i = res.length-1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
    @Test
    public void test() {
        int[] asteroids = {5, 10, -5};
        int[] res = asteroidCollision(asteroids);
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
