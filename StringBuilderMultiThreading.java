package amazon;

public class StringBuilderMultiThreading {
	
	private static final StringBuilder sb = new StringBuilder();

	public static StringBuilder getsb(){
		return sb;
	}
	public static void addTosb(String S)
	{
		sb.append(S);
	}
	
}


