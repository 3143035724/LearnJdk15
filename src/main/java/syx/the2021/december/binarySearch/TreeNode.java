package syx.the2021.december.binarySearch;

/**
 * @author syx
 * @className TreeNode
 * @description 树结构
 * @date 2021/12/31 16:13
 */
public class TreeNode {

    int val;

    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
