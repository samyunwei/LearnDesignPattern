package factory;

public class PizzaTestDirve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nystroe = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagpPizzaStore();
		
		Pizza pizza = nystroe.OrderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.OrderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}

}
