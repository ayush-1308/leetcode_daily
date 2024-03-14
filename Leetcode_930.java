public class Leetcode_930 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 1 };
        int S = 2;
        System.out.println(numSubarraysWithSum(arr, S));
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int[] count = new int[n + 1];
        int sum = 0;
        int res = 0;
        for (int num : nums) {
            count[sum]++;
            sum += num;
            if (sum >= goal) {
                res += count[sum - goal];
            }
        }
        return res;
    }
}
