package syx.plan.structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author syx
 * @className The14Day
 * @description 数据结构->十四天计划->第十四天
 * @url https://leetcode-cn.com/problems/validate-binary-search-tree/、https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/、https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * @tips 98.验证二叉搜索树、653.两数之和IV-输入BST、235.二叉搜索树的最近公共祖先
 * @date 2022/01/05 15:12
 */
public class The14Day {

    public boolean isValidBST(TreeNode root) {
        // 98.验证二叉搜索树
        return false;
    }

    public boolean findTarget(TreeNode root, int k) {
        // 653.两数之和IV-输入BST
        Set<Integer> set = new HashSet<>();
        return find(root, k, set);
    }

    private boolean find(TreeNode root, int k, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 235.二叉搜索树的最近公共祖先
        return null;
    }

}
