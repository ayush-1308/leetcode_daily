import java.util.Arrays;

public class Leetcode_57 {
  public static void main(String[] args) {
    int[][] intervals = { { 1, 3 }, { 6, 9 } };
    int[] newInterval = { 2, 5 };
    int[][] result = insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      System.out.println(Arrays.toString(result[i]));
    }
  }

  public static int[][] insert(int[][] intervals, int[] newInterval) {
    int n = intervals.length;
    int[][] result = new int[n + 1][2];
    int i = 0;
    int j = 0;
    while (i < n && intervals[i][1] < newInterval[0]) {
      result[j++] = intervals[i++];
    }
    while (i < n && intervals[i][0] <= newInterval[1]) {
      newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
      newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
      i++;
    }
    result[j++] = newInterval;
    while (i < n) {
      result[j++] = intervals[i++];
    }
    return Arrays.copyOf(result, j);
  }
}
