import java.util.LinkedList;
import java.util.Queue;

public class leetcode_513 {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    System.out.println(findBottomLeftValue(root));
  }

  public static int findBottomLeftValue(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      root = queue.poll();
      if (root.right != null) {
        queue.add(root.right);
      }
      if (root.left != null) {
        queue.add(root.left);
      }
    }
    return root.val;
  }
}
