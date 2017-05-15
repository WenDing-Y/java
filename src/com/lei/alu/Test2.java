package com.lei.alu;

public class Test2 {
  public static void main(String[] args) {
	String con="chara";
	int n=con.length();
	char[] str=con.toCharArray();
	int result=findhuiwen(str,n);
	System.out.println("结果是"+result);
}

private static int findhuiwen(char[] str,int n) {
	// TODO Auto-generated method stub
	int[][] dp=new int[n][n];
	int tmp;
	
	for(int i=0; i<n; i++) dp[i][i] = 1;
	// i 表示 当前长度为 i+1的 子序列
	for(int i=1; i<n; i++){
		tmp = 0;
		//考虑所有连续的长度为i+1的子串. 该串为 str[j, j+i]
		for(int j=0; j+i<n; j++){
			//如果首尾相同
			if(str[j] == str[j+i]){
				tmp = dp[j+1][j+i-1] + 2;
			}else{
				tmp = Math.max(dp[j+1][j+i],dp[j][j+i-1]);
			}
			dp[j][j+i] = tmp;
			System.out.println("dp"+"["+j+"]"+"["+(j+i)+"]"+tmp);
		}
		System.out.println("ccccccccccccc");
	}
	//返回串 str[0][n-1] 的结果
	return dp[0][n-1];
}
}

