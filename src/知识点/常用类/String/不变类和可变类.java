package 知识点.常用类.String;

import org.junit.Test;

/**
 * @author XYSIMJ
 * @create 2020-11-04-上午11:04
 */
/*
可变类：当你获得这个类的一个实例引用时，你可以改变这个实例的内容。
不可变类：当你获得这个类的一个实例引用时，你不可以改变这个实例的内容。不可变类的实例一但创建，其内在成员变量的值就不能被修改。
 */
public class 不变类和可变类 {

    @Test
    public void test() {
        Integer a = 10;
        System.out.println(a.hashCode());
        System.out.println(System.identityHashCode(a));
        a = 20;
        System.out.println(a.hashCode());
        System.out.println(System.identityHashCode(a));


    }
}
