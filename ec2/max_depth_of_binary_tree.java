package ec2;

import java.util.Stack;

public class max_depth_of_binary_tree {

     //Definition for a binary tree node.
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
         }
     }

    public int maxDepth(TreeNode root) {
         if (root == null) {
             return 0;
         }
         return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));}
}
