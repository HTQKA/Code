package 算法.落谷;

    import java.util.Scanner;

    /**
     * @program: Code
     * @description: 吃苹果
     * @author: 徐杨顺
     * @created: 2020/12/12 15:27
     */
    public class EatApple {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int t = sc.nextInt();
            int s = sc.nextInt();
            if (m >= 0 &&m <=100 && t >= 0 && t <= 100 && s <= 10000 && s >= 0) {
                int z = 0;
                if (t == 0) {
                    System.out.println(0);
                } else {

                     z = ((m * t) - s) / t;
                    if (z <= 0) {
                        System.out.println(0);
                    }else {

                        System.out.println(z);
                    }
                }

            }
        }
    }
