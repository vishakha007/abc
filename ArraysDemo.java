package jan3;

import java.util.Arrays;

public class ArraysDemo {

	public boolean ArrayEquals(int [] a1,int[]a2){
		if (Arrays.equals(a1, a2))
			return  true;
		else 
			return false;
	}
	public void FinalArray(){
		final int [] f1= {1,2,3};
		int []f2 ={4,5,6};
		f2=f1;
		//f1=f2;
		for (int i :f1)
			System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,2,3,4,5,6};
		int []b={1,2,3,4,6};
		ArraysDemo AD=new ArraysDemo();
		AD.FinalArray();
		System.out.println(AD.ArrayEquals(a, b));

	}

}
