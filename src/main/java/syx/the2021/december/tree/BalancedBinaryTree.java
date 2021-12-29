package syx.the2021.december.tree;

/**
 * @author syx
 * @className BalancedBinaryTree
 * @description 110.平衡二叉树
 * @url https://leetcode-cn.com/problems/balanced-binary-tree/
 * @tips 树、深度优先搜索、二叉树
 * @date 2021/12/29 15:57
 */
public class BalancedBinaryTree {

    public static void main(String[] args) {
        isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(8), null), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null)));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        int left = getHigh(root.left, 0);
        int right = getHigh(root.right, 0);
        // 除了校验节点差，还要校验是不是平衡树
        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private static int getHigh(TreeNode root, int high) {
        if (root != null) {
            high += 1;
            high = Math.max(getHigh(root.left, high), getHigh(root.right, high));
        }
        return high;
    }

}
