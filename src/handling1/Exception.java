package handling1;

public class Exception {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("i handled the exception........");
		}
	}

}
