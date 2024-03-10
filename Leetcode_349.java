import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_349 {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 2, 1 };
    int[] nums2 = { 2, 2 };
    int[] res = intersection(nums1, nums2);
    for (int i : res) {
      System.out.println(i);
    }
  }

  public static int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();
    for (int i : nums1) {
      set.add(i);
    }
    List<Integer> list = new ArrayList<>();
    for (int i : nums2) {
      if (set.contains(i)) {
        list.add(i);
        set.remove(i);
      }
    }
    int[] res = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      res[i] = list.get(i);
    }
    return res;
  }
}
