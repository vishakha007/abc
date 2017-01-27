package DynamicProg;

public class SubSeq_Dist_String {
	public int subsequence_dist(String S,String T){
		int [][]tab=new int[S.length()+1][T.length()+1];
		for(int i=0;i<S.length();i++)
			tab[i][0]=1;
		for(int i=1;i<S.length();i++){
			for(int j=1;j<T.length();j++){
				if (S.charAt(i-1)==T.charAt(j-1))
					tab[i][j]+=tab[i-1][j-1]+tab[i-1][j];
				else
					tab[i][j]+=tab[i-1][j];
				
			}
		}
		for(int i=0;i<S.length();i++){
			for(int j=0;j<T.length();j++)
				System.out.print(tab[i][j]+"  ");//dp[i][0]=w1.charAt(i);
			System.out.println("  ");//dp[i][0]=w1.charAt(i);
			}
		
		return tab[S.length()][T.length()];
	}
	
	public int subsequence_dist_nspace(String S,String T){
	
		if(S==null||T==null||T.length()==0)
			return 0;
		int []dist=new int[T.length()];
		for(int i=0;i<S.length();i++){
			for(int j=T.length()-1;j>=0;j--)
			{
				if(S.charAt(i)==T.charAt(j))
					dist[j]+=j!=0?dist[j-1]:1;
					System.out.print(dist[j]+" ");
			}System.out.println();
		}
		
		return dist[T.length()-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSeq_Dist_String m=new SubSeq_Dist_String();
		System.out.println("Min Distance is "+m.subsequence_dist_nspace("crabbbit", "dddd"));

	}

}
