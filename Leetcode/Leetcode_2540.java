import java.util.HashMap;

public class Leetcode_2540 {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 4, 5 };
    int[] nums2 = { 5, 6, 7, 8, 9 };
    System.out.println(getCommon(nums1, nums2));
  }

  public static int getCommon(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> mp = new HashMap<>();
    for (int num : nums1) {
      mp.put(num, mp.getOrDefault(num, 0) + 1);
    }
    for (int num : nums2) {
      if (mp.containsKey(num) && mp.get(num) > 0) {
        return num;
      }
    }
    return -1;
  }
}
