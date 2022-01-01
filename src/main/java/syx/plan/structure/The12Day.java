package syx.plan.structure;

/**
 * @author syx
 * @className The12Day
 * @description 数据结构->十四天计划->第十二天
 * @url https://leetcode-cn.com/problems/path-sum/、https://leetcode-cn.com/problems/invert-binary-tree/
 * @tips 112.路径总和、226.翻转二叉树
 * @date 2021/12/31 10:16
 */
public class The12Day {

    public static void main(String[] args) {
        hasPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)), 5);
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        // 路径总和
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public TreeNode invertTree(TreeNode root) {
        // 翻转二叉树
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
