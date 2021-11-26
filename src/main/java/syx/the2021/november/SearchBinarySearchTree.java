package syx.the2021.november;

/**
 * @author syx
 * @className SearchBinarySearchTree
 * @description Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null
 * @url https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 * @tips Tree、Binary Search Tree、Binary Tree
 * @date 2021/11/26 9:42
 */
public class SearchBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        int rootVal = root.val;
        return rootVal == val ? root : (rootVal > val ? searchBST(root.left, val) : searchBST(root.right, val));
    }

}


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
