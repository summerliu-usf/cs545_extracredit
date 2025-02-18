package ec2;

public class invert_binary_tree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode new_node = new TreeNode(root.val); //create a new nod that has the value of the original passed in
        new_node.right = invertTree(root.left); // sets it in the correct place
        new_node.left = invertTree(root.right);
        return new_node;
    }
}
