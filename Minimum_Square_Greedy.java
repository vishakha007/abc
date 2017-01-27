package GraphTheory;

public class Minimum_Square_Greedy {
	
	
	public int minimumsquare(int a, int b){
		int result=0;
		System.out.println(a+" a and b "+ b);
		if (a<b)
			{
			int temp=a;
			a=b;
			b=temp;
			}
		System.out.println(a+" a and b "+ b);
		while(b>0){
			result=result+a/b;
			int rem=a%b;
			a=b;
			b=rem;
			//b=b-result*a;
			//System.out.println(a+" a and b "+ b);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Minimum_Square_Greedy m= new Minimum_Square_Greedy();
		System.out.println(m.minimumsquare(13,34));
	
	}

}
