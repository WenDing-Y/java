package com.lei.alu;

public class Test2 {
  public static void main(String[] args) {
	String con="chara";
	int n=con.length();
	char[] str=con.toCharArray();
	int result=findhuiwen(str,n);
	System.out.println("�����"+result);
}

private static int findhuiwen(char[] str,int n) {
	// TODO Auto-generated method stub
	int[][] dp=new int[n][n];
	int tmp;
	
	for(int i=0; i<n; i++) dp[i][i] = 1;
	// i ��ʾ ��ǰ����Ϊ i+1�� ������
	for(int i=1; i<n; i++){
		tmp = 0;
		//�������������ĳ���Ϊi+1���Ӵ�. �ô�Ϊ str[j, j+i]
		for(int j=0; j+i<n; j++){
			//�����β��ͬ
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
	//���ش� str[0][n-1] �Ľ��
	return dp[0][n-1];
}
}

