package Iterator;

import java.util.Iterator;

public class Waitress {
	MenuComponent allmenus;
	
	public Waitress(MenuComponent allMenus) {
		// TODO Auto-generated constructor stub
		this.allmenus = allMenus;
	}
	
	public void printMenu()
	{
		allmenus.print();
	}
	
	public void printVegetarianMenu()
	{
		Iterator iterator = new CompositeIterator(allmenus.createIterator());
		System.out.print("\nVEGETARIAN MENU\n----");
		while(iterator.hasNext())
		{
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			try
			{
				if(menuComponent.isVegetarian())
				{
					menuComponent.print();
					
				}
			}catch (UnsupportedOperationException e)
			{
				
			}
		}
	}
}
