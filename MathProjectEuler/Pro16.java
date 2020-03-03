import java.math.BigInteger;

class Pro16
{
	public static void main(String[] args)
	{

		BigInteger n = BigInteger.ONE;
		for(int i = 0; i < 1000; i++)
			n = n.multiply(BigInteger.valueOf(2));

		String str = n.toString();

		int sumOfDigits = 0;
		for(int i = 0; i < str.length(); i++)
			sumOfDigits += (str.charAt(i) - '0');

		System.out.println(sumOfDigits);
	}
}