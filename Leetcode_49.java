import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_49 {
  public static void main(String[] args) {
    String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
    List<List<String>> result = groupAnagrams(strs);
    System.out.println(result);
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>();
    Map<String, List<String>> anagrams = new HashMap<>();

    for (int i = 0; i < strs.length; i++) {
      char[] charArray = strs[i].toCharArray();
      Arrays.sort(charArray);
      String sortedString = new String(charArray);

      if (!anagrams.containsKey(sortedString)) {
        anagrams.put(sortedString, new ArrayList<>());
      }
      anagrams.get(sortedString).add(strs[i]);
    }
    for (List<String> anagram : anagrams.values()) {
      result.add(anagram);
    }
    return result;
  }
}
