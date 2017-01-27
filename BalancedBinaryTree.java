package GraphTheory;
class Height{
	int height;
	Height(int height){
		this.height=height;
	}
	public Height() {
		// TODO Auto-generated constructor stub
	}
}
public class BalancedBinaryTree {
	int data;
	BalancedBinaryTree left,right;
	//int height;
	
	public boolean isBalanced(BalancedBinaryTree root, Height height){
		if(root==null){
			height.height=0;
			return true;
		}
		Height lh=new Height();
		Height rh= new Height();
		boolean ltree=isBalanced(root.left,lh);
		boolean rtree=isBalanced(root.right,rh);
		int l=lh.height;
		int r =rh.height;
		height.height= Math.max(l, r)+1;
		return((Math.abs(l-r)<=1 && ltree && rtree)? true:false);
		
	}
	
	

	BalancedBinaryTree(int data){
		this.data=data;
	}
	public BalancedBinaryTree() {
		// TODO Auto-generated constructor stub
	}



	public boolean isBalanced(BalancedBinaryTree root){
		if(root==null){
			
			return true;
		}
		int l_height=height(root.left);
		int r_height=height(root.right);
		
		return((Math.abs(l_height-r_height)<=1) && isBalanced(root.left) && isBalanced(root.right));
	//	return false;
	}
	public int height(BalancedBinaryTree root){
		if(root==null)
			return 0;
		return 1+ Math.max(height(root.left), height(root.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Height height = new Height();
		 
	        /* Constructed binary tree is
	                   1
	                 /   \
	                2      3
	              /  \    /
	            4     5  6
	            /
	           7         */
	        BalancedBinaryTree tree = new BalancedBinaryTree(1);
	       // tree = new Node(1);
	        tree.left = new BalancedBinaryTree(2);
	        tree.right = new BalancedBinaryTree(3);
	        tree.left.left = new BalancedBinaryTree(4);
	        tree.left.right = new BalancedBinaryTree(5);
	     //   tree.right.right = new BalancedBinaryTree(6);
	        tree.left.left.left = new BalancedBinaryTree(7);
	 
	        if (tree.isBalanced(tree, height))
	            System.out.println("Tree is balanced");
	        else
	            System.out.println("Tree is not balanced");
	}

}
