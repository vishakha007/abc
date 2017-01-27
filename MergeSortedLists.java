package flexton;
class ListNode{
	public int data;
	public ListNode next;
	
	public ListNode(){};
	public ListNode(int data) {
		//super();
		this.data = data;
		this.next = null;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public ListNode getNext() {
		return next;
	}


	public void setNext(ListNode next) {
		this.next = next;
	}
}
public class MergeSortedLists {
	
	
	
	public ListNode MergeLists(ListNode L1,ListNode L2){
		ListNode head=new ListNode();
		ListNode p= head;
		while(L1 != null || L2 != null){
			
		if (L1!=null&&L2!=null){
			if(L1.getData()<L2.getData()){
				p.setNext(L1);
				L1.setNext(L1.getNext());
			}
			else{
				p.setNext(L2);
				L2.setNext(L2.getNext());
			}
			p=p.getNext();}
		else if(L1==null){
			p.setNext(L2);
			break;
		}else{
			p.setNext(L1);
			break;
		}
		
		}
		return head.getNext();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode l1= new ListNode(5);
		ListNode l2 = new ListNode(6);

	}

}
