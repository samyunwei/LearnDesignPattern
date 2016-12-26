package factory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppinglist = new ArrayList<String>();
	public void prepare()
	{
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for(int i = 0;i< toppinglist.size();i++)
		{
			System.out.println(" "+toppinglist.get(i));
		}
	}
	public void bake()
	{
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut()
	{
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box()
	{
		System.out.println("Place pizaa in official PizzaStroe box");
	}
	
	public String getName()
	{
		return name;
	}
}
