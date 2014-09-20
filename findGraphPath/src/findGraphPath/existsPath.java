package findGraphPath;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class existsPath {
	
	public boolean isPath(TreeNode start, TreeNode end) {
		
		if (start == null || end == null) return false;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(start);
		while(! q.isEmpty()) {
			TreeNode current = q.remove();
			//Also mark this node as visited
			Enumeration<TreeNode> n = current.children();
			if (current.equals(end)) return true;
			while (n.hasMoreElements()) {
				TreeNode elementToAdd = n.nextElement();
				q.add(elementToAdd);
			}
		}
		
		return false;
		
	}

}
