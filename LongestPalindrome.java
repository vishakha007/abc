package DynamicProg;

public class LongestPalindrome {
	
	public String longestP(String S){
		if(S==null)
			return "";
		if(S.length()<=1)
			return S;
		int counter=0;
		System.out.println(S.length());
		String l=S.substring(0, 1);
		for(int i=0;i<S.length()-1;i++){
			String t= longestP(S,i,i);
			if(t.length()>l.length())
				l=t;
			t=longestP(S,i,i+1);
			if(t.length()> l.length())
				l=t;
			System.out.println(l+ " count " + ++counter+" i " +i);
		}
		
		return l;
	}
	public String longestP(String S, int begin,int end ){
		while(begin>=0 && end<=S.length() && S.charAt(begin)==S.charAt(end))
		{
			begin--;
			end++;
		}
		System.out.println("                                     "+S.substring(begin+1,end));
		return S.substring(begin+1,end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindrome m=new LongestPalindrome();
		System.out.println("Longest Palindrome is "+m.longestP("abcdefgaa"));
		//
	}
}
