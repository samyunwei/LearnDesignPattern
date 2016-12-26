package factory;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza()
	{
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extrea Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppinglist.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	public void cut()
	{
		System.out.println("Cutting the pizza intto square slices");
	}
}
