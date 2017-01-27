package DynamicProg;

public class Min_EditDistance {
	public static int minDist(String w1, String w2){
		int l1= w1.length();
		int l2 =w2.length();
		int [][]dp=new int [l1+1][l2+1];
		for(int i=0;i<l1;i++)
			dp[i][0]=i;
		for(int j=0;j<l1;j++)
			dp[0][j]=j;
		/*
		 * if w1.charAt(i) == w2.charAt(j), then dp[i][j] == dp[i-1][j-1]
			if  w1.charAt(i) != w2.charAt(j), and we insert y for word1, then dp[i][j] = dp[i][j-1] + 1
			if  w1.charAt(i) != w2.charAt(j), and we delete x for word1, then dp[i][j] = dp[i-1][j] + 1
			if  w1.charAt(i) != w2.charAt(j)x != y, and we replace x with y for word1, 
			then dp[i][j] = dp[i-1][j-1] + 1
			When  w1.charAt(i) != w2.charAt(j), dp[i][j] is the min of the three situations.
			Initial condition:
			dp[i][0] = i, dp[0][j] = j

		 */
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (w2.charAt(i - 1) == w1.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] ;
					else
						dp[i][j]=Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
			}
			}
		for(int i=0;i<l1;i++){
		for(int j=0;j<l2;j++)
			System.out.print(dp[i][j]+"  ");//dp[i][0]=w1.charAt(i);
		System.out.println("  ");//dp[i][0]=w1.charAt(i);
		}
		return dp[l1][l2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Min_EditDistance m=new Min_EditDistance();
		System.out.println("Min Distance is "+m.minDist("abcdef", "ghidef"));
	}

}
