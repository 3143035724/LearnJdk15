package syx.plan.structure;


import java.util.ArrayList;
import java.util.List;

/**
 * @author syx
 * @className The11Day
 * @description 数据结构->十四天计划->第十一天
 * @url https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/、https://leetcode-cn.com/problems/symmetric-tree/、https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * @tips 104.二叉树的最大深度、101.对称二叉树、102.二叉树的层序遍历
 * @date 2021/12/30 9:58
 */
public class The11Day {

    public int maxDepth(TreeNode root) {
        // 二叉树的最大深度
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public boolean isSymmetric(TreeNode root) {
        // 对称二叉树
        return valid(root, root);
    }

    private boolean valid(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (right == null || left == null) {
            return false;
        }
        return left.val == right.val && valid(left.left, right.right) && valid(right.left, left.right);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        // 层序遍历
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode remove = nodes.remove(0);
                list.add(remove.val);
                if (remove.left != null) {
                    nodes.add(remove.left);
                }
                if (remove.right != null) {
                    nodes.add(remove.right);
                }
            }

            lists.add(list);
        }
        return lists;
    }

}
