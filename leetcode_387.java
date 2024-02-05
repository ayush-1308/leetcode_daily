import java.util.HashMap;

public class leetcode_387 {
  public static void main(String[] args) {
    String inputString = "leetcode";
    int result = firstUniqChar(inputString);

    if (result != -1) {
      System.out.println("The first non-repeating character is at index: " + result);
    } else {
      System.out.println("No non-repeating character found in the given string.");
    }
  }

  public static int firstUniqChar(String s) {
    HashMap<Character, Integer> charCount = new HashMap<>();

    for (char c : s.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }

    for (int i = 0; i < s.length(); i++) {
      if (charCount.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }
}
