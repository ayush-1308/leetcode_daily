class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

public class Leetcode_543 {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    System.out.println(diameterOfBinaryTree(root));
  }

  private static int height(TreeNode root, int[] diameter) {
    if (root == null)
      return 0;

    int leftHeight = height(root.left, diameter);
    int rightHeight = height(root.right, diameter);

    diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);
    return 1 + Math.max(leftHeight, rightHeight);
  }

  public static int diameterOfBinaryTree(TreeNode root) {
    int[] diameter = new int[1];
    height(root, diameter);

    return diameter[0];
  }
}
