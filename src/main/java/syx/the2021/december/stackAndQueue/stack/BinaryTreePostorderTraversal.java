package syx.the2021.december.stackAndQueue.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className BinaryTreePostorderTraversal
 * @description 145.二叉树的后序遍历
 * @url https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 * @tips 栈、树、深度优先搜索、二叉树
 * @date 2021/12/28 10:40
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        // 后序遍历：左子树 ---> 右子树 ---> 根结点
        List<Integer> list = new ArrayList<>();
        search(root, list);
        return list;
    }

    private void search(TreeNode root, List<Integer> list) {
        if (root != null) {
            search(root.left, list);
            search(root.right, list);
            list.add(root.val);
        }
    }

}
