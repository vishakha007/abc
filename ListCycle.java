package jan3;

public class ListCycle {
	public boolean hasCycle(ListNode l1){
		ListNode slow=l1;
		ListNode fast=l1;
		while(slow.next !=null &&fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if (slow==fast)
				return true;
		}
		return false;
	}
	public static void main(String []args)
	{
		ListCycle C=new ListCycle();
		ListNode l1=new ListNode(5);
		//ListNode l2=new ListNode(2);
		l1.next=new ListNode(6);
		l1.next.next=new ListNode(7);
		l1.next.next.next=new ListNode(8);
		l1.next.next.next.next=l1;
		System.out.println(C.hasCycle(l1));
	}

}
