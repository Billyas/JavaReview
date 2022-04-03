package offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class m5268 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i:nums2){
            set.add(i);
        }
        for(int i:nums1){
            if(!set.contains(i)){
                a.add(i);
            }
            set2.add(i);
        }
        for(int i:nums2){
            if(!set2.contains(i)){
                b.add(i);
            }
        }
        Set<Integer> sr = new HashSet<>(a);
        Set<Integer> sr2 = new HashSet<>(b);

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(sr));
        res.add(new ArrayList<>(sr2));
        return res;
    }
}
