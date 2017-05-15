package com.lei.alu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr={5,10,25,1};
      int aim=15;
      int sum=coin3(arr,aim);
      System.out.println("有多少种方法"+sum);
	}

	private static int coin3(int[] arr, int aim) {
		// TODO Auto-generated method stub
		if (arr==null||arr.length==0||aim<0) {
			return 0;
		}
		int[][] db=new int[arr.length][aim+1];
		for (int i = 0; i < arr.length; i++) {
			db[i][0]=1;
		}
		for(int j=0;arr[0]*j<=aim;j++)
		{
			db[0][arr[0]*j]=1;
		}
		int num=0;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=1;j<=aim;j++)
			{
				num=0;
				for(int k=0;j-arr[i]*k>=0;k++)
				{
					
					num+=db[i-1][j-arr[i]*k];
				}
				System.out.println("db"+"["+i+"]"+"["+j+"]="+num);
				db[i][j]=num;
			}
		}
		return db[arr.length-1][aim];
	}

}
