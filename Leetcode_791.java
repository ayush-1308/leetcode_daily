public class Leetcode_791 {
  public static void main(String[] args) {
    String order = "cba";
    String s = "abcd";
    System.out.println(customSortString(order, s));
  }

  public static String customSortString(String order, String s) {
    int[] count = new int[26];
    for (char c : s.toCharArray()) {
      count[c - 'a']++;
    }
    StringBuilder sb = new StringBuilder();
    for (char c : order.toCharArray()) {
      while (count[c - 'a']-- > 0) {
        sb.append(c);
      }
    }
    for (char c = 'a'; c <= 'z'; c++) {
      while (count[c - 'a']-- > 0) {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}
