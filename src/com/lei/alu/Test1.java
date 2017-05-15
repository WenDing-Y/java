package com.lei.alu;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1="A3BC4";
     String str2="3A4CB";
     String result=lsce(str1,str2);
     System.out.println(result);
	}

	private static String lsce(String str1, String str2) {
		// TODO Auto-generated method stub
		char[] chs1=str1.toCharArray();
		char[] chs2=str2.toCharArray();
		int[][] dp=getdp(chs1,chs2);
	    int m=chs1.length-1;
	    int n=chs2.length-1;
	    char[] res=new char[dp[m][n]];
	    int index=res.length-1;
	   
	    while (index>=0) {
			if (n>0&&dp[m][n]==dp[m][n-1]) {
				n--;
			}else if (m>0&&dp[m][n]==dp[m-1][n]) {
				m--;
			}else {
				res[index--]=chs1[m];
				n--;
				m--;
			}
		}
	  
		return String.valueOf(res);
	}

	private static int[][] getdp(char[] chs1, char[] chs2) {
		// TODO Auto-generated method stub
		int[][] dp=new int[chs1.length][chs2.length];
		dp[0][0] =chs1[0]==chs2[0] ? 1:0;
		for(int i=1;i<chs1.length;i++)
		{
			dp[i][0]=Math.max(dp[i-1][0], chs1[i]==chs2[0]?1:0);
		}
		for(int j=1;j<chs2.length;j++)
		{
			dp[0][j]=Math.max(dp[0][j-1],chs1[0]==chs2[j]?1:0 );
		}
		for(int i=1;i<chs1.length;i++)
		{
			for(int j=1;j<chs2.length;j++)
			{
				dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				if (chs1[i]==chs2[j]) {
					dp[i][j]=Math.max(dp[i][j], dp[i-1][j-1]+1);
				}
				//System.out.println("dp"+"["+i+"]"+"["+j+"]="+dp[i][j]);
			}
		}
		return dp;
	}

}
