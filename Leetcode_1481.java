import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_1481 {
  public static void main(String[] args) {
    int[] arr = { 4, 3, 1, 1, 3, 3, 2 };
    int k = 3;
    System.out.println(findLeastNumOfUniqueInts(arr, k));
  }

  public static int findLeastNumOfUniqueInts(int[] arr, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    List<Integer> list = new ArrayList<>(map.values());
    Collections.sort(list);
    int count = 0;
    for (int i = 0; i < list.size(); i++) {
      if (k >= list.get(i)) {
        k -= list.get(i);
        count++;
      } else {
        break;
      }
    }
    return list.size() - count;
  }
}
