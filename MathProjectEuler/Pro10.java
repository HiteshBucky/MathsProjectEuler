class Pro10
{
	public static boolean isPrimeFunction(int n)
	{
		if(n == 2 || n == 3)
			return true;

		if(n % 2 == 0 || n % 3 == 0)
			return false;

		for(int i = 5; i*i <= n; i += 6)
			if(n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}

	public static void main(String[] args)
	{

		long sum = 0;
		for(int i = 2; i < 2000000; i++)
			if(isPrimeFunction(i))
				sum += i;

		System.out.println(sum);
	}
}