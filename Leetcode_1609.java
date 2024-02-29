import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_1609 {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(10);
    root.right = new TreeNode(4);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);
    root.right.left = new TreeNode(9);
    root.right.right = new TreeNode(2);
    root.left.left.left = new TreeNode(12);
    root.left.left.right = new TreeNode(8);
    root.left.right.left = new TreeNode(6);
    root.right.right.right = new TreeNode(5);
    System.out.println(isEvenOddTree(root));
  }

  public static boolean isEvenOddTree(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int level = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      int prev = level % 2 == 0 ? 0 : Integer.MAX_VALUE;
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (level % 2 == 0) {
          if (node.val % 2 == 0 || node.val <= prev) {
            return false;
          }
        } else {
          if (node.val % 2 != 0 || node.val >= prev) {
            return false;
          }
        }
        prev = node.val;
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      level++;
    }
    return true;
  }
}
