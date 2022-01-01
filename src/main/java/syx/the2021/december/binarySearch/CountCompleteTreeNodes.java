package syx.the2021.december.binarySearch;

/**
 * @author syx
 * @className CountCompleteTreeNodes
 * @description 222. 完全二叉树的节点个数
 * @url https://leetcode-cn.com/problems/count-complete-tree-nodes/
 * @tips Tree、Depth-FirstSearch、Binary Search、Binary Tree
 * @date 2021/12/31 16:11
 */
public class CountCompleteTreeNodes {

    public static void main(String[] args) {
        int length = countNodes(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3)));
        System.out.println(length);
    }

    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        return getNodes(root, 0);
    }

    private static int getNodes(TreeNode root, int count) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        count = getNodes(root.left, count) + getNodes(root.right, count) + 1;
        return count;
    }

}
