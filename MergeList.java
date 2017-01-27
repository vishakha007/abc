package jan4;

public class MergeList {
	class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
			this.next=null;
		}
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
		
		return t2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
