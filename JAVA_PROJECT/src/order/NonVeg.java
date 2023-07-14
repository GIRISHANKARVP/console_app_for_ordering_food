package order;

import java.util.Scanner;

public class NonVeg extends Veg
{
	public void nonveg()
	{
		
		items.put("Chicken Biryani", 70);
		items.put("Fish Curry", 90);
		items.put("Fried Egg", 7);
		items.put("Grilled Chicken",50);
		items.put("Omelette", 7);
		
	}
	
	Scanner sc = new Scanner(System.in);
	public void calci()
	{
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
					obj.ordering(items.get("Chicken Biryani"));
					itemlist("Chicken Biryani");
					break;
				}
				case 2:
				{
					obj.ordering(items.get("Fish Curry"));
					itemlist("Fish Curry");
					break;
				}
				case 3:
				{
					obj.ordering(items.get("Fried Egg"));
					itemlist("Fried Egg");
					break;
				}
				case 4:
				{
					obj.ordering(items.get("Grilled Chicken"));
					itemlist("Grilled Chicken");
					break;
				}
				case 5:
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