package jan3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapDemo {
	static class Comp_Implement implements  Comparator<Integer> {
		@Override
		public int compare(Integer a, Integer b) {
			// TODO Auto-generated method stub
			return -(a-b);
		}
		
		public static void main(String args[]){
			int ar[]={1,2,3,4,5,6,7,8,9,10};
			PriorityQueue <Integer>pq=new PriorityQueue<Integer>();
			for (int i:ar)
				pq.offer(i);
			System.out.println(pq);
			
			Comp_Implement cmp=new Comp_Implement();
			PriorityQueue<Integer> pq2= new PriorityQueue<Integer>(10,cmp);
			for (int i:ar)
				pq2.offer(i);
			System.out.println(pq2);
			System.out.println("Size : "+pq2.size());
			System.out.println("Peek : "+pq2.peek());
			System.out.println("Poll : "+pq2.poll());
			System.out.println("Size : "+pq2.size());
			pq2.offer(11);
			pq2.offer(12);
			System.out.println(pq2);
			System.out.println("Size : "+pq2.size());

		}
		
	}

}
