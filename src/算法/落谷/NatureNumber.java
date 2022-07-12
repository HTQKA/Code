package 算法.落谷;

import java.util.Scanner;

/**
 * @program: Code
 * @description: 数的性质
 * @author: 徐杨顺
 * @created: 2020/12/12 17:50
 */
public class NatureNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if ((a % 2 == 0) && (a > 4 && a <= 12)) {
            System.out.print(1+" ");
        }else {
            System.out.print(0+" ");
        }

        if ((a % 2 == 0) || (a > 4 && a <= 12)) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0+" ");
        }
        if ((a % 2 == 0) && !(a > 4 && a <= 12) ) {
            System.out.print(1 + " ");
        } else if ( !(a % 2 == 0)&&(a > 4 && a <= 12)) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }

        if (!(a % 2 == 0) && !(a > 4 && a <= 12)) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0+" ");
        }

    }
}
