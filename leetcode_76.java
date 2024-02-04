import java.util.HashMap;
import java.util.Map;

public class leetcode_76 {
  public static void main(String[] args) {
    String s = "ADOBECODEBANC";
    String t = "ABC";
    System.out.println(minWindow(s, t));
  }

  public static String minWindow(String s, String t) {
    if (s == null || t == null || s.length() == 0 || t.length() == 0) {
      return "";
    }

    Map<Character, Integer> targetMap = new HashMap<>();
    for (char c : t.toCharArray()) {
      targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
    }

    Map<Character, Integer> windowMap = new HashMap<>();

    int left = 0, right = 0, minLen = Integer.MAX_VALUE, minStart = 0;
    int requiredChars = targetMap.size();

    while (right < s.length()) {
      char currentChar = s.charAt(right);

      windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

      if (targetMap.containsKey(currentChar) && targetMap.get(currentChar).equals(windowMap.get(currentChar))) {
        requiredChars--;
      }

      while (requiredChars == 0) {
        if (right - left + 1 < minLen) {
          minLen = right - left + 1;
          minStart = left;
        }

        char leftChar = s.charAt(left);
        windowMap.put(leftChar, windowMap.get(leftChar) - 1);
        if (targetMap.containsKey(leftChar) && windowMap.get(leftChar) < targetMap.get(leftChar)) {
          requiredChars++;
        }

        left++;
      }

      right++;
    }

    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
  }
}