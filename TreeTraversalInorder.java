package jan3;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode (int val){
		this.val=val;
		this.left=null;
		this.right=null;
	}
	
	
}
public class TreeTraversalInorder {
	public static ArrayList <Integer> l=new ArrayList<Integer>();
	
	
	public ArrayList<Integer> PreOrder(TreeNode root){
		ArrayList <Integer> l1=new ArrayList <Integer>();
		if (root==null)
			return l1;
		Stack <TreeNode>st=new Stack<TreeNode>();
		st.push(root);
		while(!st.empty()){
			TreeNode n=st.pop();
			l1.add(n.val);
			
			if(n.left!=null){
				//l1.add(n.left.val);
				st.push(n.left);

			}
			if (n.right!=null){
				//l1.add(n.right.val);
				st.push(n.right);
			}
		}
		return l1;
		}
	public void PreOrder_Recurse(TreeNode root){
		
	if(root==null)
		return;
		{
			l.add(root.val);
			PreOrder_Recurse(root.left);
			PreOrder_Recurse(root.right);
		}
		
		return;
		
	}
	public ArrayList<Integer> InOrderRecurse(TreeNode root,ArrayList <Integer> li){
		//ArrayList <Integer>li=new ArrayList <Integer>();
		if (root==null)
			return li;
		InOrderRecurse(root.left,li);
		li.add(root.val);
		InOrderRecurse(root.right,li);
		return li;
	}
	
	public TreeNode InvertTree(TreeNode root){
		if (root==null)
			return root;
		if(root.right!=null)
			root.right=InvertTree(root.right);
		if(root.left!=null)
			root.left=InvertTree(root.left);
		TreeNode tmp=root.left;
		root.left=root.right;
		root.right=tmp;
		return root;
			
	}
	public static void main(String []args){
		
		TreeTraversalInorder In=new TreeTraversalInorder();
		TreeNode T=new TreeNode(5);
		T.left=(new TreeNode(4));
		T.right=(new TreeNode(6));
		T.left.left=(new TreeNode(2));
		T.left.right=(new TreeNode(7));
		T.right.left=(new TreeNode(3));
		T.right.right=(new TreeNode(9));
		//Tree :   5
		//		4	  6
		//	 2	 7	3	9	
		/*In.PreOrder_Recurse(T);
		System.out.println("PreOder traversal ");
		for(Integer i:l)
			System.out.print(" "+i+"->");*/
		//new TreeNode();
		
		ArrayList <Integer> li=new ArrayList<Integer>();
		li=In.InOrderRecurse(T,li);
		System.out.println("In Order Traverssal ");
		for(Integer i:li)
			System.out.print(" "+i+"->");
		li.clear();
		TreeNode inverse= In.InvertTree(T);
		li=In.InOrderRecurse(inverse,li);
		System.out.println("In Order Traverssal ");
		for(Integer i:li)
			System.out.print(" "+i+"->");
	}

}
