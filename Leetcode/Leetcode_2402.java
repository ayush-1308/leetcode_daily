import java.util.Arrays;
import java.util.PriorityQueue;

public class Leetcode_2402 {
  public static void main(String[] args) {
    int n = 2;
    int[][] meetings = { { 0, 10 }, { 1, 5 }, { 2, 7 }, { 3, 4 } };
    System.out.println(mostBooked(n, meetings));
  }

  public static int mostBooked(int n, int[][] meetings) {
    Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
    long[][] room = new long[n][3];

    PriorityQueue<Integer> roomsBusy = new PriorityQueue<>(
        (a, b) -> room[a][1] == room[b][1] ? a - b : (int) (room[a][1] - room[b][1]));

    PriorityQueue<Integer> roomsAvailable = new PriorityQueue<>((a, b) -> a - b);

    for (int i = 0; i < n && i < meetings.length; i++) {
      roomsAvailable.add(i);
    }
    for (int i = 0; i < meetings.length; i++) {
      int meetingStart = meetings[i][0];
      int meetingEnd = meetings[i][1];

      while (!roomsBusy.isEmpty() && (roomsAvailable.isEmpty() || room[roomsBusy.peek()][1] <= meetingStart)) {
        roomsAvailable.add(roomsBusy.remove());
      }

      int nextRoomIndex = roomsAvailable.remove();
      long[] nextRoom = room[nextRoomIndex];
      nextRoom[0] = i;
      nextRoom[1] = Math.max(meetingEnd, meetingEnd - meetingStart + nextRoom[1]);
      nextRoom[2]++;

      roomsBusy.add(nextRoomIndex);
    }

    int max = 0;
    for (int i = 1; i < room.length; i++) {
      if (room[i][2] > room[max][2]) {
        max = i;
      }
    }

    return max;
  }
}
