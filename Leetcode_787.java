public class Leetcode_787 {
  public static void main(String[] args) {
    int n = 4;
    int[][] flights = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
    int src = 0;
    int dst = 3;
    int k = 1;
    System.out.println(findCheapestPrice(n, flights, src, dst, k));
  }

  public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    int[][] dp = new int[k + 2][n];
    int max = (int) 1e9;
    for (int i = 0; i < k + 2; i++) {
      for (int j = 0; j < n; j++) {
        dp[i][j] = max;
      }
    }
    dp[0][src] = 0;
    for (int i = 1; i < k + 2; i++) {
      dp[i][src] = 0;
      for (int[] flight : flights) {
        int u = flight[0];
        int v = flight[1];
        int w = flight[2];
        if (dp[i - 1][u] != max) {
          dp[i][v] = Math.min(dp[i][v], dp[i - 1][u] + w);
        }
      }
    }
    return dp[k + 1][dst] == max ? -1 : dp[k + 1][dst];
  }
}
