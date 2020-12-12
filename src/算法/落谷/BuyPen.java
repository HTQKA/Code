package 算法.落谷;

import java.util.Scanner;

/**
 * @program: Code
 * @description: 买签字笔
 * @author: 徐杨顺
 * @created: 2020/12/12 15:20
 */
public class BuyPen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a*10 +b;
//        System.out.println(sum);
        System.out.println((int)(sum/19));
    }
}
