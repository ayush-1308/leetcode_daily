public class Leetcode_231 {
  public static void main(String[] args) {
    System.out.println(isPowerOfTwo(1));
    System.out.println(isPowerOfTwo(16));
    System.out.println(isPowerOfTwo(218));
  }

  public static boolean isPowerOfTwo(int n) {
    if (n <= 0) {
      return false;
    }
    return (n & (n - 1)) == 0;
  }
}
