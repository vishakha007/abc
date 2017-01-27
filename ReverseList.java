package jan3;

//import jan4.MergeList.ListNode;

class ListNode{
	int val;
	ListNode next;
	public ListNode(int val){
		this.val=val;
		this.next=null;
	}
	
}

public class ReverseList {
	ListNode head;
	public ListNode Reverse(ListNode L){
		head=L;
		ListNode curr=head.next;
		while(curr!=null)
		{
			ListNode temp= curr.next;
			curr.next=head;
			head=curr;
			curr=temp;
			//System.out.println("head "+head.val);
			//head.next=null;
		}
		L.next=null;
		return head;
		
	}
	public void printList(ListNode first)
	{System.out.print("\nPrinting List ");
		while(first!=null)
		{
			System.out.print(first.val+"  ");
			first=first.next;
		}
	}
public ListNode CreateList_of_num(int num){
	ListNode first =new ListNode(0);
	ListNode dummy =first;
	System.out.println("Creating list of "+num+" elements.\n");
	for (int i=1;i<num;i++){
		ListNode list=new ListNode(i);
		dummy.next=list;
		dummy=list;
		//System.out.println(dummy.val);
		
	}
return first;
}
public ListNode CreateList_of_num(int start,int end){
	ListNode first =new ListNode(start++);
	ListNode dummy =first;
	System.out.println("Creating list of "+end+" elements.\n");
	for (int i=0;i<end;i++){
		ListNode list=new ListNode(start++);
		dummy.next=list;
		dummy=list;
		//System.out.println(dummy.val);
		
	}
return first;
}

public ListNode Merge(ListNode a, ListNode b)
{
	ListNode t1=a;
	ListNode t2=b;
	while(t2 != null){
		ListNode tmp1= t1.next;
		ListNode tmp2 = t2.next;
		t1.next=t2;
		t2.next=tmp1;
		t1=tmp1;
		t2=tmp2;
	}
	//a.next=null;
	//b.next=null;
	return a;
			
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList list =new ReverseList();
		
		ListNode l=list.CreateList_of_num(10,10);
		ListNode l2=list.CreateList_of_num(30,10);

		list.printList(l);
		list.printList(l2);
		l=list.Reverse(l);
		list.printList(l);

		//ListNode reverse = list.Reverse(l);
		ListNode merge=list.Merge(l, l2);
		
		//System.out.println(l.val+ "  "+l.next.val);
		list.printList(merge);
	}

}
