package flexton;

public class Merge2SortedArrays {
	
	public int[] MergeArr(int []a1,int[]a2){
		int [] result =new int[a1.length+a2.length];
		int i=a1.length;
		int j=a2.length;
		int k= i+j-1;
		while(i>0 && j>0)
		{
			if (a1[i-1]>a2[j-1])
			{	
				result[k--]=a1[i-1];
				i--;
			}else{
				result[k--]=a2[j-1];
				j--;
			}
			
		}
		result[k]=a1[--i];
		return result;
	}
	
	public static void main(String args[]){
		int [] a={1,3,5,7,9,11};
		int [] b={2,4,6,8,10};
		Merge2SortedArrays M= new Merge2SortedArrays();
		int [] r=M.MergeArr(a, b);
		for (int i:r)
		System.out.println(i);
	}

}
