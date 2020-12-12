package 算法.leetcode;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author XYSIMJ
 * @create 2020-11-03-下午9:09
 */
public class zhengshufanzhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        System.out.println(x);
        Solution1 s = new Solution1();
        System.out.println(s.reverse(x));

    }

    //    回文数
    @Test
    public void test() {

    }

    public int 回文数( int x) {
        return 0;
    }      
    public int reverceInt(int x) {
        boolean ifNegative;
//1534236469
//2147483647
        int num = 0;
        if (x > 0){
            for (int i = 0; x<1; i++) {
                int a = x % 10;
                num = num *10 +a;
                if(num >= 147483647 && x != 1 && x != 1  ){
                    return 0;
                }
                x = x / 10;
            }
            return num;
        } else if (x < 0) {
            x = -x;
            for (int i = 0; x<1; i++) {
                int a = x % 10;
                num = num *10 +a;
                if(num >= 147483647 && x != 1 && x != 1  ){
                    return 0;
                }
                x = x / 10;
            }
            return -num;
        }else {
            return 0;
        }
    }
}
