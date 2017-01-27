package GraphTheory;

import java.util.HashMap;
import java.util.Map.Entry;
class Doubl_linked_Node{
	int key,value;
	Doubl_linked_Node next,pre;
	public Doubl_linked_Node (int key,int value){
		this.key=key;
		this.value=value;
	}
}
public class LRUCache {
	int size;
	HashMap<Integer,Doubl_linked_Node> map=new HashMap<Integer, Doubl_linked_Node>();
	Doubl_linked_Node head=null;
	Doubl_linked_Node end=null;
	public LRUCache(int size){
		this.size=size;
		 head=null;
		 end=null;
	}
	public int get(int key){
		if(map.containsKey(key)){
			//get Doubl_linked_Node/object stored at key 
			Doubl_linked_Node n = map.get(key);
			//remove the Doubl_linked_Node and set it as most recently used as the head
			remove(n);
			setHead(n);
			return n.value;
		}
		
		return -1;
	}
	
	 void setHead(Doubl_linked_Node n) {
		// TODO Auto-generated method stub
		n.next=head;
		n.pre=null;
		if(head!=null)
			head.pre=n;
		head=n;
		if(end==null)
			end=head;
			
	}
	
	 void remove(Doubl_linked_Node n) {
		// TODO Auto-generated method stub
		if(n.pre!=null)
			n.pre.next=n.next;
		else
			head=n.next;
		if(n.next!=null)
			n.next.pre=n.pre;
		else
			end=n.pre;
		
	}
	 
	 public void set(int key,int value){
		 //Update key
		 if(map.containsKey(key)){
			 Doubl_linked_Node oldnode=map.get(key);
			 //update the value of this Doubl_linked_Node to param value
			 oldnode.value=value;
			 remove(oldnode);
			 setHead(oldnode);
		 }
		 //Insert new key
		 else{
			 Doubl_linked_Node newnode= new Doubl_linked_Node(key,value);
			 if(map.size()>=size)
				 map.remove(end.key);
			 setHead(newnode);
			 }
			 
	 }
	 public void print(LRUCache cache){
		 for(Entry<Integer, Doubl_linked_Node> n : cache.map.entrySet())
			 System.out.println("( "+n.getKey()+" , "+n.getValue()+" )");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache cache=new LRUCache(5);
		
		for(int i=0;i<5;i++)
			cache.set(i, i);
			
		cache.print(cache);
			
		
	}

}
