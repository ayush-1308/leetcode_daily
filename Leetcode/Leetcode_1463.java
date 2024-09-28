public class Leetcode_1463 {
  public static void main(String[] args) {
    int[][] grid = { { 3, 1, 1 }, { 2, 5, 1 }, { 1, 5, 5 }, { 2, 1, 1 } };
    System.out.println(cherryPickup(grid));
  }

  static Integer[][][] memo;

  public static int cherryPickup(int[][] grid) {
    int rows = grid.length;
    int cols = grid[0].length;
    memo = new Integer[rows + 1][cols + 1][cols + 1];
    return helper(grid, 0, 0, cols - 1);
  }

  public static int helper(int[][] grid, int i, int j, int k) {
    if (i == grid.length) {
      return 0;
    }
    if (memo[i][j][k] != null) {
      return memo[i][j][k];
    }
    int result = 0;
    result += grid[i][j];
    if (j != k) {
      result += grid[i][k];
    }
    int max = 0;
    for (int a = -1; a <= 1; a++) {
      for (int b = -1; b <= 1; b++) {
        int newJ = j + a;
        int newK = k + b;
        if (newJ >= 0 && newJ < grid[0].length && newK >= 0 && newK < grid[0].length) {
          max = Math.max(max, helper(grid, i + 1, newJ, newK));
        }
      }
    }
    result += max;
    memo[i][j][k] = result;
    return result;
  }
}
