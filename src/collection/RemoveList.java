package collection;

import java.util.*;

public class RemoveList {
    // Set 去重代码示例
    public static <T> Set<T> removeDuplicateBySet(List<T> data) {

        if (data.isEmpty()) {
            return new HashSet<>();
        }
        return new HashSet<>(data);
    }

    // List 去重代码示例
    public static <T> List<T> removeDuplicateByList(List<T> data) {

        if (data.isEmpty()) {
            return new ArrayList<>();

        }
        List<T> result = new ArrayList<>(data.size());
        for (T current : data) {
            if (!result.contains(current)) {
                result.add(current);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String>  StringList = new ArrayList<>();
        StringList.add("a");
        StringList.add("b");
        StringList.add("a");
//        RemoveList removeList = new RemoveList();
        System.out.println(removeDuplicateBySet(StringList));
    }
}
