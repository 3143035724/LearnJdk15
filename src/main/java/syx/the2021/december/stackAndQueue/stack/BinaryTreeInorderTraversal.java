package syx.the2021.december.stackAndQueue.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className BinaryTreeInorderTraversal
 * @description 94.二叉树的中序遍历
 * @url https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * @tips 栈、树、深度优先搜索、二叉树
 * @date 2021/12/28 10:16
 */
public class BinaryTreeInorderTraversal {


    public List<Integer> inorderTraversal(TreeNode root) {
        // 中序遍历：左子树---> 根结点 ---> 右子树
        List<Integer> list = new ArrayList<>();
        search(root, list);
        return list;
    }

    private void search(TreeNode root, List<Integer> list) {
        if (root != null) {
            search(root.left, list);
            list.add(root.val);
            search(root.right, list);
        }
    }

}
