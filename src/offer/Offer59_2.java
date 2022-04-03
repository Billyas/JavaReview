package offer;

import org.junit.Test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//Offer59-|| 队列的最大值
public class Offer59_2 {
    class MaxQueue {
        Queue<Integer> queue;
        PriorityQueue<Integer> maxQueue;

        public MaxQueue() {
            queue = new LinkedList<>();
            maxQueue = new PriorityQueue<>((a, b) -> b - a);
        }

        public int max_value() {
            if (!maxQueue.isEmpty()) {
                return maxQueue.peek();
            } else {
                return -1;
            }
        }

        public void push_back(int value) {
            queue.add(value);
            maxQueue.add(value);
        }

        public int pop_front() {
            if (!queue.isEmpty()) {
                int x = queue.poll();
                maxQueue.remove(x);
                return x;
            }
            return -1;
        }
    }

    @Test
    public void test() {
        MaxQueue maxQueue = new MaxQueue();
        maxQueue.push_back(1);
        System.out.println(maxQueue.max_value());
        maxQueue.push_back(2);
        System.out.println(maxQueue.max_value());
        maxQueue.push_back(3);
        System.out.println(maxQueue.max_value());
        maxQueue.pop_front();
        System.out.println(maxQueue.max_value());
        maxQueue.pop_front();
        System.out.println(maxQueue.max_value());
        maxQueue.pop_front();
        System.out.println(maxQueue.max_value());
    }
}
