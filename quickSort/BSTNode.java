
public class BSTNode {
	public int key; 
	public BSTNode left; 
	public BSTNode right; 
	
	public BSTNode (int key, BSTNode left, BSTNode right){
		this.key = key; 
		this.left = left; 
		this.right = right; 
	}
	
	public BSTNode(int key){
		this.key = key; 
		left = null; 
		right = null; 
	}
}
