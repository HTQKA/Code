package 算法.落谷;

import java.util.Scanner;

/**
 * @program: Code
 * @description: 判断闰年
 * @author: 徐杨顺
 * @created: 2020/12/12 18:07
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 1582) {

            if (a % 4 == 0 && !(a % 100 == 0)) {
                System.out.println(1);
            } else if (a % 400 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
