class Test
{
	static boolean arePythagoreanTriplet(int a, int b, int c)
	{
		return a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a;
	}

	public static void main(String[] args)
	{

	Loop:for( int i = 251; i < 1000; i++ )
		for( int j = i; j < 1000; j++ )
		{
			int c = 1000 - i - j;
			if(arePythagoreanTriplet(i, j, c))
			{
				System.out.println(i * j * c);
				break Loop;
			}
		}
	}
}