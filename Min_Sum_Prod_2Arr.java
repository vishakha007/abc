package GraphTheory;

import java.util.Arrays;
import java.util.Collections;

public class Min_Sum_Prod_2Arr {
	
	public int minsumprod(int []a,int[]b){
		int r=0;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<a.length;i++){
			r+=a[i]*b[b.length-1-i];
		}
		
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Min_Sum_Prod_2Arr m= new Min_Sum_Prod_2Arr();
		int[] a={2,5,3,7,4,1,9,};
		
		int b[]={44,2,4,65,7,5,1};
		System.out.println(m.minsumprod(a, b));

	}

}
