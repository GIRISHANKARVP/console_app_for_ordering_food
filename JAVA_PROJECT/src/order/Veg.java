package order;

import java.util.Scanner;

public class Veg extends Storage
{
	public void veg()
	{	
		items.put("Chappathi", 15);
		items.put("Dosa",12);
		items.put("Fried Egg", 30);
		items.put("Idli", 8);
		items.put("Omelette", 20);
		
	}
	
	Scanner sc = new Scanner(System.in);
	public void calci()
	{
		veg();
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
					obj.ordering(items.get("Dosa"));
					itemlist("Dosa");
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
					obj.ordering(items.get("Idli"));
					itemlist("Idli");
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