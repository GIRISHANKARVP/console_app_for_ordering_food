import order.*;
public class Main 
{
	public static void main(String arg[])
	{
		AbstractView obj=new GetOrder();
		obj.start();
		obj.getUser();
		obj.bill();
		
	}

}
