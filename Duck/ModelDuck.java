package Duck;

public class ModelDuck extends Duck{
	public ModelDuck()
	{
		flyBehavior = new FlyNoWay();
		quackBehavoir = new Quack();
	}
	
	public void disply()
	{
		System.out.println("I'm a model duck");
	}
}
