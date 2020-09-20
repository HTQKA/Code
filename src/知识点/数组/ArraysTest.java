package 知识点.数组;

import java.util.Arrays;

/*

 */
public class ArraysTest {
    public static void main(String[] args) {
        //一维数组初始化
        //静态初始化,初始化时直接赋值，长度确定
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        System.out.println("int:" + arr1);
        System.out.println(arr1[0]);
        //动态初始化,定义时不指定长度，不赋值
        char[] arr2 = new char[5];
        System.out.println("char:" + arr2);
        System.out.println(arr2[0]);

        double[] arr3 = new double[5];
        System.out.println("double:" + arr3);
        System.out.println(arr3[0]);

        String[] arr4 = new String[5];
        System.out.println("String:" + arr4);
        System.out.println(arr4[0]);

        byte[] arr5 = new byte[5];
        System.out.println("byte:"+arr5);
        System.out.println(arr5[0]);

        float[]arr6 = new float[5];
        System.out.println("float:"+arr6);
        System.out.println(arr6[0]);

        long[]arr7 = new long[5];
        System.out.println("long:"+arr7);
        System.out.println(arr7[0]);

        short[]arr8 = new short[5];
        System.out.println("short:"+arr8);
        System.out.println(arr8[0]);

        boolean[]arr9 = new boolean[5];
        System.out.println("boolean:"+arr9);
        System.out.println(arr9[0]);

    }
}
