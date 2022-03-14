package Relec;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Person p = new Person(1,"me");
        Class clazz = Person.class;
        Constructor cons = clazz.getConstructor(int.class, String.class);
        Object obj = cons.newInstance(2, "you");
        Person pr =  (Person)obj;
        System.out.println(pr.toString());

        //必须是公开的方法
        Field getid = clazz.getDeclaredField("id");
        getid.set(pr, 4);
        System.out.println(pr.toString());

        //调用方法,可以获取到公开方法的值
        Method show = clazz.getDeclaredMethod("getName");
        String a  =(String) show.invoke(pr);

        //反射调用私有方法
        Constructor con1 = clazz.getDeclaredConstructor(String.class);
        con1.setAccessible(true);
        Person p1 = (Person) con1.newInstance("they");
        System.out.println(p1);

        //调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1, "they adjust");
        System.out.println(p1);
    }

    @Test
    public void test() throws ClassNotFoundException {
//        System.out.println("hello");
        // 1. running property
        Person p = new Person(1, "good");
        Class clazz = Person.class;
        System.out.println(clazz);
        // 2. running 使用getClass
        Class clazz2 = p.getClass();
        System.out.println(clazz2);
        // 3. 调用静态方法forname
        Class clazz3 = Class.forName("Relec.Person");
        System.out.println(clazz3);
        // 4. 使用类的加载器
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("Relec.Person");
        System.out.println(clazz4);
        System.out.println(clazz == clazz4);
    }

    @Test
    public void test2(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class ;
        int[] a = new int[10] ;
        int[] b = new int [ 100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
//只要元素类型与维度-样，就是同一个Class
        System. out. println(c10 == c11);

    }
}
