import java.util.Arrays;

public class Leetcode_2966 {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 6, 7 };
    int k = 1;
    int[][] result = divideArray(nums, k);
    if (result.length == 0) {
      System.out.println("Conditions cannot be satisfied.");
    } else {
      System.out.println("Result: " + Arrays.deepToString(result));
    }
  }

  public static int[][] divideArray(int[] nums, int k) {
    Arrays.sort(nums);

    if (nums.length % 3 != 0) {
      return new int[0][0];
    }

    int[][] result = new int[nums.length / 3][3];
    int index = 0;
    for (int i = 0; i < nums.length; i += 3) {
      int first = nums[i];
      int second = nums[i + 1];
      int third = nums[i + 2];
      if (third - first <= k && third - second <= k) {
        result[index][0] = first;
        result[index][1] = second;
        result[index][2] = third;
        index++;
      } else {
        return new int[0][0];
      }
    }
    return result;
  }
}
