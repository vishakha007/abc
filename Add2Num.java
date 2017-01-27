package jan3;

public class Add2Num {
	
	public int num;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Add2Num)) {
			return false;
		}
		Add2Num other = (Add2Num) obj;
		if (num != other.num) {
			return false;
		}
		return true;
	}
	public ListNode Add2List (ListNode l1,ListNode l2){
		ListNode newHead=new ListNode(0);
		ListNode t1=l1;
		ListNode t2=l2;
		ListNode t3=newHead;
		int carry=0;
		while(t1!=null||t2!=null){
			if(t1!=null){
				carry+=t1.val;
				t1=t1.next;
			}
			if(t2!=null){	
				carry+=t2.val;
				t2=t2.next;
			}
			t3.next=new ListNode(carry%10);
			t3=t3.next;
			carry=carry/10;
		}
		if(carry>0)
			t3.next=new ListNode(carry);
		return newHead;
	}

public void print(ListNode l1)
{
	while (l1!=null){
		System.out.println(l1.val);
		l1=l1.next;
		
	}
	
}
	public static void main(String args[]){
		Add2Num A=new Add2Num();
		ListNode l1=new ListNode(5);
		ListNode l2=new ListNode(2);
		l1.next=new ListNode(5);
		l1.next.next=new ListNode(5);
		l2.next=new ListNode(2);
		l2.next.next=new ListNode(2);
		
		ListNode L3=A.Add2List(l1, l2);
		A.print(L3);
		
		
	}

}
