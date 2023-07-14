package order;

import java.util.Map;
import java.util.TreeMap;

public class Storage
{
	static TreeMap<String, Integer> items = new TreeMap<>();
	static TreeMap<String, Integer> billitems =new TreeMap<>();
	public void StorageCalci() 
	{
		int n=1;
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("CHOICE -   DISHES        |    COST(RS)");
		System.out.println("---------------------------------------");
		for(Map.Entry<String,Integer> i: items.entrySet())
		{
			System.out.printf("%d - %20s | %5d%n",n,i.getKey(),i.getValue());
			n++;
		}
		System.out.println("---------------------------------------");
		System.out.println("0 -     \"TO ORDER THE CHOOSED DISHES\"");
		System.out.println();
		System.out.println("ENTER YOUR CHOICES : ");
		
		
	}
	
	protected int c=0;
	public void calci() {
		
	}
	
	public void itemlist(String str)
	{
		if(billitems.containsKey(str))
		{
			billitems.put(str, (billitems.get(str))*2);
		}
		else
		{
			billitems.put(str, items.get(str));
		}
	}
	
	public TreeMap<String, Integer> getBillItems() 
	{
        return billitems;
    }
	
	
}