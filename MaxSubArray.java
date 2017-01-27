package DynamicProg;

public class MaxSubArray {
	
	public int maxSubArray(int []a){
		int sum=a[0];
		int newsum=a[0];
		int[] newarr= new int[a.length];
		int n=0;
		for(int i=1;i<a.length;i++){
			newsum=Math.max(newsum+a[i], a[i]);
			sum=Math.max(newsum, sum);
			newarr[n++]=a[i];
		}
		for(int i=0;i<newarr.length;i++)
			System.out.print(newarr[i]);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a ={ -2,1, -3, 4, -1, 2, 1, -5, 4};
		MaxSubArray m= new MaxSubArray();
		System.out.println(m.maxSubArray(a));
	}

}
