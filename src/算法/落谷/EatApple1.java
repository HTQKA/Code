package 算法.落谷;

import java.util.Scanner;

/**
 * @program: Code
 * @description: 有吃苹果
 * @author: 徐杨顺
 * @created: 2020/12/12 18:15
 */
public class EatApple1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 0 && a <= 100) {

            if (a == 0) {
                System.out.println("Today, I ate 0 apple.");
            } else if (a == 1) {
                System.out.println("Today, I ate 1 apple.");
            } else if (a > 1) {
                System.out.println("Today, I ate "+ a+" apples.");
            }
        }
    }
}
