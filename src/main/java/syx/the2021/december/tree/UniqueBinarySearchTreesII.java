package syx.the2021.december.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author syx
 * @className UniqueBinarySearchTreesII
 * @description 95.不同的二叉搜索树 II
 * @url https://leetcode-cn.com/problems/unique-binary-search-trees-ii/
 * @tips 树、二叉搜索树、动态规划、回溯、二叉树
 * @date 2021/12/30 14:16
 */
public class UniqueBinarySearchTreesII {

    public static void main(String[] args) {
        List<TreeNode> treeNodes = generateTrees(3);
        System.out.println(treeNodes);
    }

    public static List<TreeNode> generateTrees(int n) {
        // 按照顺序存放
        TreeNode first = new TreeNode(1);
        if (n == 1) {
            return Collections.singletonList(first);
        }
        return initTree(1, n);
    }

    private static List<TreeNode> initTree(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if (start > end) {
            list.add(null);
            return list;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> lefts = initTree(start, i - 1);
            List<TreeNode> rights = initTree(i + 1, end);
            for (TreeNode left : lefts) {
                for (TreeNode right : rights) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    list.add(node);
                }
            }
        }
        return list;
    }

}
