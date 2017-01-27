package DynamicProg;

public class Fibonacci {

	public int Fib_dp(int i){
		if (i<=1)
			return i;
		final int[] arr= new int[i];
		arr[0]=0;
		arr[1]=1;
		for(int l=2;l<i;l++){
			arr[l]=arr[l-1]+arr[l-2];
		}
		return arr[i-2]+arr[i-1];
	}
	public int Fib(int i){
		if (i<=1)
			return i;
		int result=Fib(i-1)+Fib(i-2);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f= new Fibonacci();
		System.out.println(f.Fib(5));
	}

}
