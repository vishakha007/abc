package amazon;

public class StringSpplit {
	public void StringSwap (String a, String b){
		System.out.println("Value of a "+a+" Value at b "+b);
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("Value of a "+a+" Value at b "+b);

	}
	public String[] StringSplit(String str){
		String[] split=str.split("@");
		for(String a:split)
			System.out.print(a+" ");
		return split;
	}
	 public void ExampleReplace(String str)
	 {
		 String replace=str.replace('@', ' ');
			System.out.println("\n"+replace);
			replace=str.replace("@h", " th");
			System.out.println(replace);
			replace=str.replaceAll("\f", "");
			System.out.println(replace);
		 
	 }
	 public int StringToInt(String s){
		 int i ;
		 i = Integer.parseInt(s,35);
		 System.out.println("Integer value of "+s+ " is "+i);
		 return i;
	 }
public static void main(String []args){
	String str= "I@am@here	@for @you";
	String a = "Hello";
	String b = "World";
	
	StringSpplit strsp =new StringSpplit();
	
	strsp.StringSplit(str);
	strsp.ExampleReplace(str);
	strsp.StringSwap(a, b);
	strsp.StringToInt("123");
	
	
	
}
}
