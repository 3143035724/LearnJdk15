package syx.the2021.december.tree;

/**
 * @author syx
 * @className TreeNode
 * @description 树
 * @date 2021/12/29 15:57
 */
public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
