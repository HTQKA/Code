package 算法;

/**
 * @author XYSIMJ
 * @create 2020-08-31-下午9:37
 */
//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
// 输入: 123
//输出: 321
//
//
// 示例 2:
//
// 输入: -123
//输出: -321
//
//
// 示例 3:
//
// 输入: 120
//输出: 21
//
//
// 注意:
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学
// 👍 2144 👎 0

/*如何反转.
 每次除以十取余, num =
*/
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        int num = 0;
        boolean ifNegative;
        String z;
        if (x > 0) {
            Integer y = x;
            String str = y.toString();
            for (int i = str.length()-1;  i >= 0; i--) {
               
            }

        } else if (x < 0) {

        } else {
            return 0;
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
