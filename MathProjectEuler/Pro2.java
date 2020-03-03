class Pro2{
	public static void main(String[] args) {
		int a = 1, b = 2, sum = 2;
		while( a + b <= 4000000 )
		{
			int temp = a + b;
			if(temp % 2 == 0)
				sum += temp;

			a = b;
			b = temp;
		}

		System.out.println(sum);
	}
}