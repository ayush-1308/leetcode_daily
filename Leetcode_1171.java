public class Leetcode_1171 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(-3);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(1);
    ListNode result = removeZeroSumSublists(head);
    while (result != null) {
      System.out.println(result.val);
      result = result.next;
    }
  }

  public static ListNode removeZeroSumSublists(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = dummy;
    while (cur != null) {
      int sum = 0;
      ListNode cur2 = cur.next;
      while (cur2 != null) {
        sum += cur2.val;
        if (sum == 0) {
          cur.next = cur2.next;
        }
        cur2 = cur2.next;
      }
      cur = cur.next;
    }
    return dummy.next;
  }
}
