package order;

import java.util.Scanner;

public class Both extends NonVeg {
	Scanner sc = new Scanner(System.in);
	public void calci()
	{
		veg();
		nonveg();
		StorageCalci();
		GetOrder obj=new GetOrder();
		while(true)
		{
			c=sc.nextInt();
			switch(c)
			{	
				case 0:
				{
					obj.bill();
					break;
				}
				case 1:
				{
					obj.ordering(items.get("Chappathi"));
					itemlist("Chappathi");
					break;
				}
				case 2:
				{
					obj.ordering(items.get("Chicken Biryani"));
					itemlist("Chicken Biryani");
					break;
				}
				case 3:
				{
					obj.ordering(items.get("Dosa"));
					itemlist("Dosa");
					break;
				}
				
				case 4:
				{
					obj.ordering(items.get("Fish Curry"));
					itemlist("Fish Curry");
					break;
				}
				case 5:
				{
					obj.ordering(items.get("Fried Egg"));
					itemlist("Fried Egg");
					break;
				}
				case 6:
				{
					obj.ordering(items.get("Grilled Chicken"));
					itemlist("Grilled Chicken");
					break;
				}
				case 7:
				{
					obj.ordering(items.get("Idli"));
					itemlist("Idli");
					break;
				}
				case 8:
				{
					obj.ordering(items.get("Omelette"));
					itemlist("Omelette");
					break;
				}
				default:
					System.out.println("PLEASE ENTER CORRECT CHOISE...");
			}
		}
	}
}