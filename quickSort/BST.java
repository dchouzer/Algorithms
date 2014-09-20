import java.util.Queue;
import java.util.concurrent.SynchronousQueue;


public class BST {
	protected BSTNode root; 
	
	public BST(){ 
		root = null; 
	}
	 
	protected void visit(BSTNode p){
		System.out.println(p.key + " ");
	}
	
	
	public BSTNode search (BSTNode p, int el){
		if(p == null)
			return null; 
		if(p.key == el)
			return p; 
		if(p.key>el)
			search(p.left, el);
		if(p.key<el)
			search(p.right, el);
		return null; 		
	}
	
	public void breadthFirst(BSTNode p) throws InterruptedException{
		Queue q = new SynchronousQueue(); 
		while(p!=null){
			((SynchronousQueue) q).put(p);
			while(!q.isEmpty()){
				visit(p);
				if(p.left!=null)
					((SynchronousQueue) q).put(p.left);
				if(p.right!=null)
					((SynchronousQueue) q).put(p.left);
				p = (BSTNode) ((SynchronousQueue) q).take(); 

			}
		}
	}
	
	public void preorder(BSTNode p){ 
		if(p==null)
			return; 
		visit(p); 
		if(p.left != null)
			preorder(p.left); 
		if(p.right !=null)
			preorder(p.right); 
	}
	
	public void postorder(BSTNode p){
		if(p==null)
			return; 
		if(p.left != null)
			postorder(p.left); 
		if(p.right !=null)
			postorder(p.right); 
		visit(p); 
	}
	
	public void inorder(BSTNode p){
		if(p==null)
			return;
		if(p.left!=null)
			inorder(p.left); 
		visit(p); 
		if(p.right !=null)
			inorder(p.right); 
	}
}
