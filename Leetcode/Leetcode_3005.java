import java.util.HashMap;
import java.util.Map;

public class Leetcode_3005 {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 3, 1, 4 };
    System.out.println(maxFrequencyElements(nums));
  }

  public static int maxFrequencyElements(int[] nums) {
    Map<Integer, Integer> freqMp = new HashMap<>();
    int maxFreq = 0;
    for (var num : nums) {
      freqMp.put(num, freqMp.getOrDefault(num, 0) + 1);
      maxFreq = Math.max(maxFreq, freqMp.get(num));
    }

    int maxFreqEleCnt = 0;
    for (var entry : freqMp.entrySet()) {
      int currEleFreq = entry.getValue();
      if (currEleFreq == maxFreq) {
        maxFreqEleCnt++;
      }
    }
    return maxFreq * maxFreqEleCnt;

  }
}
