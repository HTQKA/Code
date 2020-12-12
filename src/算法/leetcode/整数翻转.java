package 算法.leetcode;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author XYSIMJ
 * @create 2020-10-09-下午7:34
 */
public class 整数翻转 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        BigInteger sum = BigInteger.valueOf(0);

        if (a > 0){
            for (int i = 0; a > 0;i++){
                sum = sum.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(a % 10));
                a = a / 10;
            }
            if (sum.max(BigInteger.valueOf((long) (Math.pow(2,31)-1))) == sum){
                System.out.println(0);
            }

            else {
                System.out.println(sum);
            }

        }
//        else if (a< 0){
//            int b = -a;
//            for (int i = 0; b > 0;i++){
//                sum = sum * 10 + b % 10;
//                b = b / 10;
//            }
//            if (sum < (Math.pow(2,31)-1)){
//
//                System.out.println(-sum);
//            }else {
//                System.out.println(0);
//            }
//
//        }

        else if (a==0){
            System.out.println(sum);
        }

    }
}
class Solution {
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

                return Integer.valueOf(num.toString());
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

                return Integer.valueOf(num.multiply(BigInteger.valueOf(-1)).toString());
            }

        } else {
            return 0;
        }
    }
}
