public class BagProblem {
  public static void main(String[] args) {
    // 假设weight和value都是升序的
    int[] weight = { 1, 3, 4 };
    int[] value = { 15, 20, 30 };
    int bagSize = 4;
    System.out.println(dp2DArray(weight, value, bagSize));
    System.out.println(dp1DArray(weight, value, bagSize));
  }

  public static int dp2DArray(int[] weight, int[] value, int bagSize) {
    int[][] dp = new int[value.length][bagSize + 1];

    for (int j = weight[0]; j < bagSize + 1; j++) {
      dp[0][j] = value[0];
    }

    for (int i = 1; i < value.length; i++) {
      for (int j = 1; j < bagSize + 1; j++) {
        if (j < weight[i]) {
          dp[i][j] = dp[i - 1][j];
          continue;
        }
        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
      }
    }

    return dp[value.length - 1][bagSize];
  }

  public static int dp1DArray(int[] weight, int[] value, int bagSize) {
    int[] dp = new int[bagSize + 1];

    for (int i = 0; i < value.length; i++) {
      for (int j = bagSize; j >= weight[i]; j--) {
        dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
      }
    }

    return dp[bagSize];
  }

}
