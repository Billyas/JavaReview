package offer;

import org.junit.Test;

import java.util.*;

public class LC599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        List<String> res =new ArrayList<>();
        for(int i=0 ; i<list1.length; i++){
            map.put(list1[i], i);
        }

        for(int j=0; j< list2.length; j++){
            if(map.containsKey(list2[j])){
                int index = map.get(list2[j])+j;
                if(index<min){
                    min = index;
                    res.clear();
                    res.add(list2[j]);
                }else if(index==min){
                    res.add(list2[j]);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }

    @Test
    public void test(){
        String[] a = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] b = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        findRestaurant(a,b);
    }
}
