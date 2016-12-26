package Delegate;

public class HasQuarterState implements State{
	transient GumballMachine gumballMachine;
	public HasQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't inset another quarter");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned...");
		if(gumballMachine.getCount() > 0)
		{
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else
		{
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");
	}
	
	
	public String toString()
	{
		return "HasQuarterState";
	}
}
