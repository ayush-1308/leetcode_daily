import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_451 {

  public static void main(String[] args) {
    System.out.println(frequencySort("tree"));
    System.out.println(frequencySort("cccaaa"));
    System.out.println(frequencySort("Aabb"));
  }

  public static String frequencySort(String s) {
    Map<Character, Integer> count = new HashMap<>();
    for (char c : s.toCharArray()) {
      count.put(c, count.getOrDefault(c, 0) + 1);
    }
    List<Character> sorted = new ArrayList<>(count.keySet());
    Collections.sort(sorted, (a, b) -> count.get(b) - count.get(a));

    StringBuilder result = new StringBuilder();
    for (char c : sorted) {
      result.append(String.valueOf(c).repeat(count.get(c)));
    }
    return result.toString();
  }
}