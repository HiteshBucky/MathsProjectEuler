class Pro4{

	public static boolean isPalindromeFunction(String str)
	{
		for(int i = 0; i < str.length()/2; i++)
			if(str.charAt(i) != str.charAt(str.length() - 1 - i))
				return false;

		return true;
	}

	public static void main(String[] args) {

		int largestPalindromeNumber = 0;
		for(int i = 315; i < 1000; i++)
			for(int j = 315; j < 1000; j++)
			{
				int product = i * j;
				if(isPalindromeFunction(Integer.toString(product)) && product > largestPalindromeNumber)
					largestPalindromeNumber = product;
			}
		System.out.println(largestPalindromeNumber);
	}
}