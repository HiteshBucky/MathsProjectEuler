class Pro6{
	public static void main(String []args)
	{
		int sum0=0, sum1=0, sum2;
		for(int i = 1; i <= 100; i++ )
		{
			 sum0 += i*i;
			 sum1 += i; 
		}
		sum2 = sum1 * sum1;
		System.out.println(sum2-sum0);
	}
}