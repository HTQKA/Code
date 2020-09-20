package 知识点.常用类.String;

import org.junit.Test;

/**
 * @author XYSIMJ
 * @create 2020-09-11-下午1:50
 */
public class StringTest {

    @Test
    public void test1() {
        String str = "XYDSIMHHTQKAXYSCCXSFEXYS";
        String str1 = str.replace("XY","123");
        System.out.println(str1);
    }
}
