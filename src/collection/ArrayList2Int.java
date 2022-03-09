package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList2Int {
    public static void main(String[] args) {
        // arraylist 转换为int[]数组
        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        int[] res = arraylist.stream().mapToInt(Integer::valueOf).toArray();
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println("");

        // int[] 2  arraylist<Integer>
        int [] a = {1,2,3,4,5};
        ArrayList<Integer> int2arr =(ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());
        for(Integer i: int2arr){
            System.out.print(i+" ");
        }
        System.out.println();


        // arraylist 转换为string[]
        List<String> arrayListString = new ArrayList<>();
        arrayListString.add("a");
        arrayListString.add("b");
        arrayListString.add("c");
        String[] resstr = (String[]) arrayListString.toArray(new String[arrayListString.size()]);
        for(String i:resstr){
            System.out.print(i+" ");
        }
        System.out.println();

        // string[]  2 arraylist
        String[] str2arr = {"aa","bb","cc"};
        List<String> arrstr = Arrays.asList(str2arr);
        for(String i:arrstr){
            System.out.print(i+" ");
        }
    }
}
