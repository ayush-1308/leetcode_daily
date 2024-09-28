import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Leetcode_2092 {
  public static void main(String[] args) {
    int n = 5;
    int[][] meetings = { { 0, 1, 10 }, { 1, 2, 20 }, { 2, 3, 30 }, { 3, 4, 40 } };
    int firstPerson = 0;
    List<Integer> result = findAllPeople(n, meetings, firstPerson);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }

  public static List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
    Map<Integer, List<int[]>> graph = new HashMap<>();
    for (int[] meeting : meetings) {
      int x = meeting[0], y = meeting[1], t = meeting[2];
      graph.computeIfAbsent(x, k -> new ArrayList<>()).add(new int[] { t, y });
      graph.computeIfAbsent(y, k -> new ArrayList<>()).add(new int[] { t, x });
    }

    int[] vis = new int[n];
    Arrays.fill(vis, Integer.MAX_VALUE);
    vis[0] = 0;
    vis[firstPerson] = 0;

    Queue<int[]> q = new ArrayDeque<>();
    q.offer(new int[] { 0, 0 });
    q.offer(new int[] { firstPerson, 0 });

    while (!q.isEmpty()) {
      int[] personTime = q.poll();
      int person = personTime[0];
      int time = personTime[1];

      for (int[] nextPersonTime : graph.getOrDefault(person, new ArrayList<>())) {
        int t = nextPersonTime[0];
        int nextPerson = nextPersonTime[1];

        if (t >= time && vis[nextPerson] > t) {
          vis[nextPerson] = t;
          q.offer(new int[] { nextPerson, t });
        }
      }
    }

    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      if (vis[i] != Integer.MAX_VALUE) {
        ans.add(i);
      }
    }
    return ans;
  }
}
