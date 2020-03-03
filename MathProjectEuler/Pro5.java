class Pro5
{
	public static boolean dividedByAll(int n)
	{
		for(int i = 3; i < 20; i++)
			if(n % i != 0)
				return false;

		return true;
	}

	public static void main(String[] args)
	{

		for(int n = 2000; ; n += 20)
			if(dividedByAll(n))
			{
				System.out.println(n);
				break;
			}
	}
}