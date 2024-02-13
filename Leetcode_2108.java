public class Leetcode_2108 {
  public static void main(String[] args) {
    String[] words = { "hello", "world", "level", "noon", "java" };
    String palindromicString = firstPalindrome(words);
    System.out.println("First palindromic string: " + palindromicString);
  }

  public static String firstPalindrome(String[] words) {
    for (String word : words) {
      if (isPalindrome(word)) {
        return word;
      }
    }
    return "";
  }

  private static boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
