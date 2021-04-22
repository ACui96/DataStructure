//给你一个整数 n ，请你找出并返回第 n 个 丑数 。 
//
// 丑数 就是只包含质因数 2、3 和/或 5 的正整数。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 10
//输出：12
//解释：[1, 2, 3, 4, 5, 6, 8, 9, 10, 12] 是由前 10 个丑数组成的序列。
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：1
//解释：1 通常被视为丑数。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 1690 
// 
// Related Topics 堆 数学 动态规划 
// 👍 602 👎 0


package leetcode.editor.cn;
//Java：丑数 II
public class P264_UglyNumberIi {
    public static void main(String[] args) {
        Solution solution = new P264_UglyNumberIi ().new Solution();
        // TO TEST
        int nthUglyNumber = solution.nthUglyNumber(10);
        System.out.println(nthUglyNumber);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for(int i = 2; i < n + 1; i++) {
            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
//            System.out.println(num2);
//            System.out.println(num3);
//            System.out.println(num5);

            dp[i] = Math.min(Math.min(num2, num3), num5);
            System.out.println(i + "," + dp[i]);
            if(dp[i] == num2) {
                p2++;
            }
            if (dp[i] == num3) {
                p3++;
            }
            if (dp[i] == num5) {
                p5++;
            }
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

