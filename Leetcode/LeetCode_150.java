import java.util.Stack;

public class LeetCode_150 {
  public static void main(String[] args) {
    String[] tokens = { "2", "1", "+", "3", "*" };
    System.out.println(evalRPN(tokens));
  }

  static int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for (String token : tokens) {
      if (isOPerand(token)) {
        int a = stack.pop();
        int b = stack.pop();
        int result = operation(a, b, token);
        stack.push(result);
      } else {
        stack.push(Integer.parseInt(token));
      }
    }
    return stack.pop();
  }

  static boolean isOPerand(String token) {
    return token == "+" || token == "-" || token == "*" || token == "/";
  }

  static int operation(int a, int b, String operator) {
    if (operator == "+") {
      return a + b;
    } else if (operator == "-") {
      return a - b;
    } else if (operator == "*") {
      return a * b;
    } else if (operator == "/") {
      return a / b;
    }
    return -1;
  }
}