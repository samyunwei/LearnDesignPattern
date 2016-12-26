package Duck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavoir;
	
	public Duck()
	{
		
	}
	
	public void performFly()
	{
		flyBehavior.fly();
	}
	
	public void performQuack()
	{
		quackBehavoir.quack();
	}
	
	public void swin()
	{
		System.out.println("All ducks float ,even decoys");
	}
	
	public void setFlyBehavior(FlyBehavior fb)
	{
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb)
	{
		quackBehavoir = qb;
	}
}
