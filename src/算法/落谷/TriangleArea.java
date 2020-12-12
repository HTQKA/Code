package 算法.落谷;

import org.junit.Test;

    import java.util.Scanner;

    /**
     * @program: Code
     * @description: 一个三角形的三边长分别是 aa、bb、cc，那么它的面积为 \sqrt{p(p-a)(p-b)(p-c)}  p(p−a)(p−b)(p−c) ​	  ，其中 p=\frac{1}{2}(a+b+c)p=  2 1 ​	  (a+b+c)。输入这三个数字，计算三角形的面积，四舍五入精确到 1 位小数。  保证能构成三角形，0\leq a,b,c\leq 10000≤a,b,c≤1000，每个边长输入时不超过2位小数。
     * @author: 徐杨顺
     * @created: 2020/12/12 14:43
     */
    public class TriangleArea {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double p = 0;
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if (a <= 1000 && a >= 0 && b <= 1000 && b >= 0 && c <= 1000 && c >= 0) {
                if (a + b > c && b + c > a && a + c > b && a - c < b && a - b < c && b - c < a) {
                    p = (a + b + c)/2.0;
                    System.out.print(String.format("%.1f",(double)Math.sqrt(p * (p - a) * (p - b) * (p - c))));

                }

            }
        }

}

