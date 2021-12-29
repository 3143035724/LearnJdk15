package syx.the2021.december.tree;

/**
 * @author syx
 * @className DiameterBinaryTree
 * @description 543.二叉树的直径
 * @url https://leetcode-cn.com/problems/diameter-of-binary-tree/
 * @tips 树、深度优先搜索、二叉树
 * @date 2021/12/29 17:30
 */
public class DiameterBinaryTree {

    private static int length;

    public int diameterOfBinaryTree(TreeNode root) {
        length = 1;
        getLength(root);
        return length - 1;
    }

    private int getLength(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getLength(root.left);
        int right = getLength(root.right);
        length = Math.max(length, left + right + 1);

        return Math.max(left, right) + 1;
    }
}
