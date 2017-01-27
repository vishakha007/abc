package jan3;

import java.util.ArrayList;

public class SmallestPair {

	public ArrayList<int[]> Smallest_Pairs_K(int[]a,int[]b, int num){

		ArrayList<int[]> result= new ArrayList<int[]>();
		num=Math.min(num, a.length*b.length);
		int[]idx=new int[a.length];
		while(num>0){
			int min=Integer.MAX_VALUE;
			int t=0;
			 for(int i=0; i<a.length; i++){
		            if(idx[i]<b.length && a[i]+b[idx[i]]<min){
		                t=i;
		                min = a[i]+b[idx[i]];
		       		 System.out.println(min);

		            }
		        }
		 
		        int[] arr = {a[t], b[idx[t]]};    
		        result.add(arr);
		 
		        idx[t]++;
		 
		        num--;
		    }
		for (int i:idx)
		 System.out.print(i);
		    return result;
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,2,3,4,5};
		SmallestPair S=new SmallestPair();
		int[]b={6,7,8,9,10};
		ArrayList<int[]> pairs=S.Smallest_Pairs_K(a, b, 7);
		
		for(int [] i:pairs){
			for(int ai :i )
				System.out.print(ai+" ");
			System.out.println();

		}
	}

}
