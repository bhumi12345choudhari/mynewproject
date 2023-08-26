package handling1;

public class ExceptionH {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
		System.out.println(" i handled the exception.....");
		}
	
		catch(NullPointerException e)
		{
			System.out.println("thie is NPE");
		}
		catch(ClassCastException e)
		{
			System.out.println("this is CCE");
		}

}
}
