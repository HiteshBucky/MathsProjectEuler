class Pro3{

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

	public static void main(String[] args) {

		for( int i = (int)Math.sqrt(n); i > 1; i-- )
			if(n % i == 0 && isPrimeFunction(i))
			{
				System.out.println(i);
				break;
			}
	}
}