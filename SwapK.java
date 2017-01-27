package amazon;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
class SwapNode{
	int val;
	SwapNode next;
	 
	public SwapNode(int val){
		this.val=val;
	}
	
	public SwapNode() {
		// TODO Auto-generated constructor stub
	}

	public int size(SwapNode snode){
		int counter=0;
		
		SwapNode node=snode;
		while(node.next != null){
			counter++;
			node=node.next;
		}
		return counter;
	}
	
	
}
public class SwapK {
	SwapNode head;
	
	public void swapk(SwapNode node, int k){
		if(node==null||node.next==null){
			return ;
		}
		int length=node.size(node);
		if(length<k)
			return;
		SwapNode kth=new SwapNode();
		SwapNode k_prev= new SwapNode();
		SwapNode nth= new SwapNode();
		SwapNode n_prev=new SwapNode();
		kth=node;
		nth=node;
		//Obtain pointers for k and k previos node
		for(int i=1;i<k;i++){
			k_prev=kth;
			kth=k_prev.next;
		}
		////obtain pointers for n-k and its previous node
		for(int i=1;i<length-k-1;i++){
			n_prev=nth;
			nth=n_prev.next;
		}
		if(k_prev!= null)
			k_prev.next=nth;
			
		if(n_prev!=null)
			n_prev.next=kth;
		SwapNode tmp= kth.next;
		kth.next=nth.next;
		nth.next=tmp;
		
			
	}
    
	public static void main(String a[]){
    	
    	
    }

}
