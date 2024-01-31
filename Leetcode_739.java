import java.util.Stack;

public class Leetcode_739 {
  public static void main(String[] args) {
    int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
    int[] result = dailyTemperatures(temperatures);

    System.out.println("Result array:");
    for (int value : result) {
      System.out.print(value + " ");
    }
  }

  static int[] dailyTemperatures(int[] temperatures) {

    int n = temperatures.length;
    int[] result = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
        int lastIndex = stack.pop();
        result[lastIndex] = i - lastIndex;
      }
      stack.push(i);
    }
    return result;
  }
}
