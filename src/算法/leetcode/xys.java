package 算法.leetcode;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author XYSIMJ
 * @create 2020-10-09-下午8:20
 */
public class xys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        Solution1 s = new Solution1();
        System.out.println(s.reverse(x));

    }

}
class Solution1 {
    public int reverse(int x) {
        BigInteger num = BigInteger.valueOf(0);
//        boolean ifNegative;

        if (x > 0) {
            for (int i = 0; x > 0; i++) {
                num = num.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(x % 10));
                x = x / 10;
            }
            if (num.max(BigInteger.valueOf((long) (Math.pow(2, 31)-1)) ) == num)  {
                return 0;
            } else {

                return num.intValue();
            }

        } else if (x < 0) {
            int y = -x;
            for (int i = 0; y > 0; i++) {
                num = num.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(y % 10));
                y = y / 10;

            }
            if (num.max(BigInteger.valueOf((long) (Math.pow(2, 31)-1)) ) == num) {
                return 0;
            } else {

                return -num.intValue();
            }

        } else {
            return 0;
        }
    }
}

