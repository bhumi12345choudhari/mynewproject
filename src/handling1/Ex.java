package handling1;

public class Ex {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
			System.out.println("exception is get handled successfully");
		}
		finally
		{
			System.out.println("this is always going to execute......");
		}
	}

}
