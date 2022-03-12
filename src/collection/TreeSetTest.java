package collection;

import java.util.Comparator;
import java.util.TreeSet;
/**
 * @Author: Billy
 * @Date: 2022/3/12 下午 11:15
 * @Describe: Comparable与Comparator, TreeSet
 */

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        Employee e1 = new Employee(1, "chengwang");
        Employee e2 = new Employee(2, "chengwang2");
        Employee e3 = new Employee(3, "chengwang3");
        Employee e4 = new Employee(4, "chengwang4");
        Employee2 e21 = new Employee2(1, "chengwang");
        Employee2 e22 = new Employee2(2, "chengwang2");
        Employee2 e23 = new Employee2(3, "chengwang3");
        Employee2 e24 = new Employee2(4, "chengwang4");
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        // 使用Lambda表达式简化生成Comparator接口
        TreeSet set2 = new TreeSet(( c1,  c2)->
                        {   Employee2 a = (Employee2)c1;
                            Employee2 b = (Employee2)c2;
                            return a.getId() - b.getId();
                        });
        //设置类后可以简化
        TreeSet<Employee2> set3 = new TreeSet<Employee2>((Employee2 c1, Employee2 c2) ->
                                                        {return c1.getId() - c2.getId();});
        set2.add(e22);
        set2.add(e23);

        set3.add(e21);
        set3.add(e24);
        set3.add(e23);
    }
}
