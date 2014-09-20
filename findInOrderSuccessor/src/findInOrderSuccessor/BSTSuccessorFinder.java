package findInOrderSuccessor;

import javax.swing.tree.TreeNode;

public class BSTSuccessorFinder {

	public TreeNode find(TreeNode start) {
		if (start == null) return null;
		//Check if this is a leaf
		if (start.getChildAt(0) == null && start.getChildAt(1) == null) {
			//If this is a left leaf
			if (start.getParent().getChildAt(0) == start) {
				return start.getParent();
			//If this is a right leaf
			} else {
				TreeNode current = start;
				while (current != current.getParent().getChildAt(0)) {
					current = current.getParent();
				}
				return current.getParent();
			}
		}
		//If we aren't at a leaf, we can just perform an in-order traversal
		if (find(start.getChildAt(1)) != null) {
			return inOrderTraversal(start.getChildAt(1));
		}
		return null;
	}
	
	private TreeNode inOrderTraversal(TreeNode childAt) {
		
		if (childAt.getChildAt(1) != null) {
			TreeNode rightChild = childAt.getChildAt(1);
			TreeNode current = rightChild.getChildAt(0);
			while (current != null) {
				current = current.getChildAt(0);
			}
			return current;
		}
		return null;
		
	}

	
}
