package isBalanced;

public class IsBalancedTree {

	public int isBalanced(TreeNode root) {
		if (root == null) return 0;
		int leftHeight = isBalanced(root.left) + 1;
		int rightHeight = isBalanced(root.right) + 1;
		if (Math.abs(leftHeight - rightHeight) > 1) return Integer.MIN_VALUE;
		
		return Math.max(leftHeight, rightHeight);
	}
	
	public boolean treeIsBalanced(TreeNode root) {
		return isBalanced(root) > 0;
	}
	
}
