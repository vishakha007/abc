package amazon;

public class Strings {

	public String intToString(int a){
		String s = Integer.toString(a); 
		System.out.println("Int "+a+" to String "+ s);
		return s;
	}
	
	public String intToSringBuilder(int a){
		String S = new StringBuilder().append(a).toString();
		
		return S;
	}
	public String intToStringBuffer(int a){
		StringBuffer sf = new StringBuffer();
		sf.append(a);
		String S =sf.toString();
		return S;
	}
	public String intToBinaryString(int a){
		String S= Integer.toBinaryString(a);
		System.out.println("Int "+a+" to binary String "+S);
		return S;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Strings str= new Strings();
		str.intToString(123);
		str.intToBinaryString(123);
	}

}
