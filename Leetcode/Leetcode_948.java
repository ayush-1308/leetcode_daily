import java.util.Arrays;

public class Leetcode_948 {
  public static void main(String[] args) {
    int[] tokens = { 100, 200, 300, 400 };
    int P = 200;
    System.out.println(bagOfTokensScore(tokens, P));
  }

  static int bagOfTokensScore(int[] tokens, int P) {
    Arrays.sort(tokens);
    int score = 0;
    int maxScore = 0;
    int i = 0;
    int j = tokens.length - 1;
    while (i <= j) {
      if (P >= tokens[i]) {
        P -= tokens[i];
        score++;
        i++;
        maxScore = Math.max(maxScore, score);
      } else if (score > 0) {
        score--;
        P += tokens[j];
        j--;
      } else {
        break;
      }
    }
    return maxScore;
  }
}
