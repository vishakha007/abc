package amazon;

public class StringBuffMultiThread {
private static final StringBuffer sb = new StringBuffer();

public static StringBuffer getsb(){
	return sb;
}
public static void addTosb(String S)
{
	sb.append(S);
}
}
