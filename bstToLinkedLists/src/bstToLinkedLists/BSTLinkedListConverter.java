package bstToLinkedLists;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BSTLinkedListConverter {
	
	public List<LinkedList<TreeNode>> convert(TreeNode root) {
		if (root == null) return null;
		List<LinkedList<TreeNode>> finalList = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> currentList = new LinkedList<TreeNode>();
		currentList.add(root);
		while(! currentList.isEmpty()) {
			finalList.add(currentList);
			LinkedList<TreeNode> childList = new LinkedList<TreeNode>();
			for (TreeNode tn : currentList) {
				Enumeration<TreeNode> enumeration = tn.children();
				while (enumeration.hasMoreElements()) {
					childList.add(enumeration.nextElement());
				}
			}
			currentList = childList;
		}
		return finalList;
		
	}

}
