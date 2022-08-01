package com.dening.study.api.common;

import java.util.ArrayDeque;

/**
 * 判断两颗二叉树是否相同
 */
public class TreeDemo {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode();
        TreeNode n2 = new TreeNode();
        String s1 = levelOrder(n1);
        String s2 = levelOrder(n1);
        boolean isSame = false;
        if (null != s1 && null != s2 && s1.equals(s2)) {
            isSame = true;
        }
        System.out.println("isSame=" + isSame);
    }

    public static String levelOrder(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (null == root) {
            return "";
        }
        ArrayDeque<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        while (!que.isEmpty()) {
            TreeNode tempNode = que.pop();
            sb.append(tempNode.val);
            if (tempNode.left != null) {
                que.add(tempNode.left);
            }
            if (tempNode.right != null) {
                que.add(tempNode.right);
            }
        }
        return sb.toString();
    }

    /**
     * 性能优化：每个节点依次判断，不同则先返回
     *
     * @param r1
     * @param r2
     * @return
     */
    public static boolean levelOrder1(TreeNode r1, TreeNode r2) {
        StringBuilder sb = new StringBuilder();
        if ((null == r1 && null != r2) || (null != r1 && null == r2) || (null == r1 && null == r2)) {
            return false;
        }
        ArrayDeque<TreeNode> que1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> que2 = new ArrayDeque<>();
        que1.add(r1);
        que2.add(r2);
        while (!que1.isEmpty() && !que2.isEmpty()) {
            TreeNode n1 = que1.pop();
            TreeNode n2 = que2.pop();

            if (n1.val != n2.val) {
                return false;
            }

            if (n1.left != null) {
                que1.add(n1.left);
            }
            if (n1.right != null) {
                que1.add(n1.right);
            }
            if (n2.left != null) {
                que1.add(n2.left);
            }
            if (n2.right != null) {
                que1.add(n2.right);
            }
        }
        return true;
    }
}
