package balancedTreeFromSortedArray;

public class CreateBalancedTree {
	
	public Node createBST(int[] array, int start, int end) {
		if (end < start) return null;
		
		int middle = (start+end / 2);
		Node root = new Node(array[middle], null, null);
		root.left = createBST(array, start, middle);
		root.right = createBST(array, middle+1, end);
		return root;
	}
	
	public Node arrayToBST(int[] array) {
		int end = array.length - 1;
		return createBST(array, 0, end);
	}

}
