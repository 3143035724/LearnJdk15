package syx.the2021.december.stackAndQueue.stack;

/**
 * @author syx
 * @className TreeNode
 * @description 栈--共用节点树
 * @date 2021/12/28 10:17
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
