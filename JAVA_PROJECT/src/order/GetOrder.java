package order;

import java.util.*;

public class GetOrder extends AbstractView {
	Scanner sc=new Scanner(System.in);
	static String name;
	static String pno;
	private int amount;
	public void getUser()
	{
		System.out.println("ENTER YOUR NAME :");
		name=sc.nextLine();	
		System.out.println("ENTER YOUR PHONE NUMBER :");
		pno=sc.nextLine();
		System.out.println("1-VEG\n2-NON-VEG\n3-BOTH\n0-EXIT\nENTER YOUR CHOICE: ");
		int c=sc.nextInt();
		if(c==1)
		{
			Storage obj=new Veg();
			obj.calci();
		}
		else if(c==2)
		{
			Storage obj=new NonVeg();
			obj.calci();
		}
		else if(c==3)
		{
			Storage obj=new Both();
			obj.calci();
		}
		else if(c==0)
		{
			System.out.println("exit...");
			System.exit(0);
		}
		else
		{
			System.out.println("WRONG CHOICE. TRY AGAIN...");
			System.exit(0);
		}
	}
	
	public void ordering(int a)
	{
		amount=amount+a;
		
	}
	
	public void bill()
	{
		Storage b=new Storage();
		TreeMap<String,Integer> bitems=b.getBillItems();
		
		System.out.println("GET THE BILL");
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("NAME             : "+name);
		System.out.println("PHONE NUMBER     : "+pno);
		System.out.println("ORDERED DISHES");
		System.out.println("-------------------------------------------");
		System.out.println("S.NO -       DISHES      ->    COST(RS)");
		System.out.println("-------------------------------------------");
		int p=0;
		for(Map.Entry<String,Integer> i:bitems.entrySet())
		{
			System.out.printf("%d - %20s -> %5d%n",++p,i.getKey(),+i.getValue());
		}
		
		System.out.println("-------------------------------------------");
		System.out.println();
		System.out.println("TOTAL AMOUNT(RS) : "+amount);
		System.out.println("*******************************************");
		System.out.println();
		System.out.println("``THANK YOU FOR ORDERING``");
		System.exit(0);
	}
}





