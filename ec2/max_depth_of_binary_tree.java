package ec2;

import java.util.Stack;

public class max_depth_of_binary_tree {

    public int maxDepth(TreeNode root) {
         if (root == null) {
             return 0;
         }
         return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));}
}
