public class Leetcode_1750 {
  public static void main(String[] args) {
    String s = "ca";
    System.out.println(minimumLength(s));
  }

  static int minimumLength(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right && s.charAt(left) == s.charAt(right)) {
      char current = s.charAt(left);
      while (left <= right && s.charAt(left) == current) {
        left++;
      }
      while (right >= left && s.charAt(right) == current) {
        right--;
      }
    }

    return right - left + 1;
  }
}
