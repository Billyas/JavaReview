package offer2;

import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

class RandomizedSet {
    Set<Integer> set;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        set = new HashSet<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(set.contains(val)) {
            return false;
        }else{
            set.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(set.contains(val)) {
            set.remove(val);
            return true;
        }else{
            return false;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
           Optional<Integer> t =  set.stream().findAny();
        return t.get();
    }
}
public class O2030 {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1);
        randomizedSet.insert(10);
        randomizedSet.insert(20);
        randomizedSet.insert(30);
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
    }
}
