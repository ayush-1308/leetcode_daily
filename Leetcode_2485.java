public class Leetcode_2485 {
  public static void main(String[] args) {
    System.out.println(pivotInteger(7));
    System.out.println(pivotInteger(10));
    System.out.println(pivotInteger(2));
    System.out.println(pivotInteger(1));
    System.out.println(pivotInteger(100));
  }

  public static int pivotInteger(int n) {
    int leftBound = 1, rightBound = n;
    int fullSum = (n * (n + 1)) / 2;
    while (leftBound <= rightBound) {
      int midNum = leftBound + (rightBound - leftBound) / 2;
      int firstHlfSum = (midNum * (midNum + 1)) / 2;
      int secondHlfSum = fullSum - firstHlfSum + midNum;
      if (firstHlfSum == secondHlfSum)
        return midNum;
      else if (firstHlfSum < secondHlfSum)
        leftBound = midNum + 1;
      else
        rightBound = midNum - 1;
    }
    return -1;
  }
}
