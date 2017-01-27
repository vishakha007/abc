package jan3;

public class BinarySearchTree {
	public class BinaryNode{
		int ele;
		BinaryNode left;
		BinaryNode right;
		public BinaryNode (int ele){
			this.ele=ele;
		}
		
	}
	
	public BinaryNode root;
	public BinaryNode insert(int x, BinaryNode root)
	{
		if (root==null)
			return new BinaryNode(x);
		if(x<root.ele)
			root.left=insert(x,root.left);
		if(x>root.ele)
			root.right=insert(x,root.right);
		return root;
	}
	
	//NOt DOne Remove routine
	public BinaryNode remove(int x,BinaryNode root){
		if (root==null)
			return null;
		if(x<root.ele)
			root.left=remove(x,root.left);
		if(x>root.ele)
			root.right=remove(x,root.right);
		return root;
	}
	public BinaryNode FindMin(BinaryNode root)
	{
		if (root==null)
			return null;
		if(root.left!=null)
			root.left=FindMin(root.left);
		return root;
	}
	
	public BinaryNode FindMax(BinaryNode root){
		if (root!=null){
			while(root.right!=null)
				root=root.right;
			
		}
		return root;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
