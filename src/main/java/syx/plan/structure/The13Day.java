package syx.plan.structure;

/**
 * 数据结构->十四天计划->第十三天
 *
 * @author kixs
 * @version v1.0.0
 * @since 2022/1/1 13:26
 */
public class The13Day {

    public TreeNode searchBST(TreeNode root, int val) {
        // 700.二叉搜索树中的搜索(可以使用递归实现)
        // https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
        if (root == null) {
            return null;
        }
        TreeNode node = root;
        while (node != null) {
            if (node.val > val) {
                node = node.left;
            } else if (node.val < val) {
                node = node.right;
            } else {
                return node;
            }
        }
        return null;
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        // 701.二叉搜索树中的插入操作
        // https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/
        TreeNode node = root;
        if (node == null) {
            return new TreeNode(val);
        }
        TreeNode valNode = new TreeNode(val);
        while (node != null) {
            if (node.val > val) {
                if (node.left == null) {
                    node.left = valNode;
                    break;
                }
                node = node.left;
            } else {
                if (node.right == null) {
                    node.right = valNode;
                    break;
                }
                node = node.right;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode = insertIntoBST(new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7)), 5);
        System.out.println(treeNode);
    }

}
