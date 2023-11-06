package com.ncamc.easy;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeTraversal {
    public static void bfs(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // 将根节点入队
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); // 出队当前节点
            System.out.print(node.val + " "); // 访问当前节点
            if (node.left != null) {
                queue.offer(node.left); // 左子节点入队
            }
            if (node.right != null) {
                queue.offer(node.right); // 右子节点入队
            }
        }
    }

    public static void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root); // 将根节点入栈

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop(); // 出栈当前节点
            System.out.print(node.val + " "); // 访问当前节点

            if (node.right != null) {
                stack.push(node.right); // 右子节点入栈
            }

            if (node.left != null) {
                stack.push(node.left); // 左子节点入栈
            }
        }
    }


    public static void main(String[] args) {
        // 创建二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        /**
         *               1
         *             2   3
         *            4 5
         */
        // 广度优先遍历
        System.out.println("广度优先遍历结果：");
        bfs(root);

        System.out.println();
        // 深度优先遍历
        System.out.println("广度优先遍历结果：");
        dfs(root);
    }
}