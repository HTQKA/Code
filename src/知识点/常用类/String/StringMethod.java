package 知识点.常用类.String;

import org.junit.Test;

/**
 * @author XYSIMJ
 * @create 2020-11-03-下午7:43
 */
public class StringMethod {

    @Test
    public void test() {
        String s = "A,,B;C,D";
        String s1 = s.replaceAll("[\\,\\;\\s]+", ",");
        System.out.println(s1);

        String[] ss = s1.split("\\,");
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);

        }
    }
}
