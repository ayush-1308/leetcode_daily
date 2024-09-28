import Leetcode.ListNode;

public class Leetcode_1669 {
  public static void main(String[] args) {
    ListNode list1 = new ListNode(0);
    list1.next = new ListNode(1);
    list1.next.next = new ListNode(2);
    list1.next.next.next = new ListNode(3);
    list1.next.next.next.next = new ListNode(4);
    list1.next.next.next.next.next = new ListNode(5);
    list1.next.next.next.next.next.next = new ListNode(6);
    list1.next.next.next.next.next.next.next = new ListNode(7);
    list1.next.next.next.next.next.next.next.next = new ListNode(8);
    list1.next.next.next.next.next.next.next.next.next = new ListNode(9);
    ListNode list2 = new ListNode(100);
    list2.next = new ListNode(101);
    list2.next.next = new ListNode(102);
    list2.next.next.next = new ListNode(103);
    list2.next.next.next.next = new ListNode(104);
    list2.next.next.next.next.next = new ListNode(105);
    list2.next.next.next.next.next.next = new ListNode(106);
    list2.next.next.next.next.next.next.next = new ListNode(107);
    list2.next.next.next.next.next.next.next.next = new ListNode(108);
    list2.next.next.next.next.next.next.next.next.next = new ListNode(109);
    ListNode result = mergeInBetween(list1, 4, 7, list2);
    while (result != null) {
      System.out.println(result.val);
      result = result.next;
    }
  }

  public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
    ListNode temp = list1;
    ListNode temp2 = list1;
    for (int i = 0; i < a - 1; i++) {
      temp = temp.next;
    }
    for (int i = 0; i < b + 1; i++) {
      temp2 = temp2.next;
    }
    temp.next = list2;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = temp2;
    return list1;
  }
}
