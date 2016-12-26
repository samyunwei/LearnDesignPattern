package factory;

public class NYPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if(item.equals("cheese"))
		{
			return new NYStyleCheesePizza();
		}else if(item.equals("veggie"))
		{
			return new VeggizePizza();
		}else if(item.equals("clam"))
		{
			return new ClamPizza();
		}else if(item.equals("pepperoni"))
		{
			return new PepperoniPizza();
		}else
		{
			return null;
		}
	}
	
}
