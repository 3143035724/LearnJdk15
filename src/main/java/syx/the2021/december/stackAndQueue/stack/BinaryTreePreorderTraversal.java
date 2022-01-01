package syx.the2021.december.stackAndQueue.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className BinaryTreePreorderTraversal
 * @description 144.二叉树的前序遍历
 * @url https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * @tips 栈、树、深度优先搜索、二叉树
 * @date 2021/12/28 10:36
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        // 前序遍历：根结点 ---> 左子树 ---> 右子树
        List<Integer> list = new ArrayList<>();
        search(root, list);
        return list;
    }

    private void search(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            search(root.left, list);
            search(root.right, list);
        }
    }

}
