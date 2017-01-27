package GraphTheory;

import java.util.ArrayList;
import java.util.Stack;

class Node{
	int val;
	Node next;
	ArrayList <Node> neighbors=new ArrayList<Node>();
	boolean visited =false;
	Node (int val){
		this.val=val;
	}
	Node (int val, ArrayList<Node>neighbours){
		this.val=val;
		this.neighbors=neighbours;
	}
}
class Queue {
	Node first, last;
	public void enqueue(Node n){
		if(first==null){
			first=n;
			last=first;
		}
		else{
			last.next=n;
			last=n;
		}	
	}
	public Node dequeu(){
		if(first==null){
			return null;
		}
		else{
			Node tmp= new Node(first.val,first.neighbors);
			first=first.next;
			return tmp;
		}
	}
}
public class B_F_Search {
	
	public static void bfs(Node root, int x){
		if(root.val==x)
			System.out.println("Found "+x+" at root");
		Queue q=new Queue();
		root.visited=true;
		q.enqueue(root);
		System.out.print(root.val);
		while(q.first != null){
			Node curr=q.dequeu();
			for(Node n:curr.neighbors){

				if(!n.visited)
				{
					n.visited=true;
					q.enqueue(n);
					//if (n.val==x){
						System.out.print(" -> "+n.val);
					//}
				}
			}
		}
	}
	
	public static void dfs(Node root){
		if(root==null)
			return;
		Stack <Node> s=new Stack <Node>();
		s.push(root);
		while(!s.isEmpty()){
			root= s.pop();
			if (!root.visited){
				root.visited=true;
				System.out.print(" -> "+root.val);
				for (Node n:root.neighbors)
					dfs(n);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1); 
		Node n2 = new Node(2); 
		Node n3 = new Node(3); 
		Node n4 = new Node(4); 
		Node n5 = new Node(5); 
 
		/*
		 * 				1
		 *  		/	/	/ 
		 * 			2	3---5
		 * 			/___/	|
		 * 			4-------|
		 * */
		n1.neighbors.add(n2);// = new ArrayList <Node>{n2,n3,n5};
		n1.neighbors.add(n3);
		n1.neighbors.add(n5);

		n2.neighbors.add(n1);
		n2.neighbors.add(n4);
		
		n3.neighbors.add(n1);
		n3.neighbors.add(n4);
		n3.neighbors.add(n5);
		
		n4.neighbors.add(n2);n4.neighbors.add(n3);n4.neighbors.add(n5);
		n5.neighbors.add(n1);n5.neighbors.add(n3);n5.neighbors.add(n4);
		
		//bfs(n1, 5);
		dfs(n1);
	}

}
