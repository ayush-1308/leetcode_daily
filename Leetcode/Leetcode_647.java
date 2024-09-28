public class Leetcode_647 {
  public static void main(String[] args) {
    System.out.println(countSubstrings("abc"));
  }

  public static int countSubstrings(String s) {
    int n = s.length();
    int count = 0;
    boolean[][] dp = new boolean[n][n];
    for (int i = 0; i < n; i++) {
      dp[i][i] = true;
      count++;
    }
    for (int i = 0; i < n - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        dp[i][i + 1] = true;
        count++;
      }
    }
    for (int len = 3; len <= n; len++) {
      for (int i = 0; i < n - len + 1; i++) {
        int j = i + len - 1;
        if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
          dp[i][j] = true;
          count++;
        }
      }
    }
    return count;
  }
}
