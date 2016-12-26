package State;

public class GumballMachine2 {
	State soldOutState;
	State noQuarterState;
	State hasQuarerState;
	State soldState;
	State winnerState;
	State state = soldOutState;
	int count = 0;
	
	
	public GumballMachine2(int numberGumballs) {
		// TODO Auto-generated constructor stub
		soldState = new SoldState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarerState = new HasQuarterState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		if(numberGumballs > 0)
		{
			state = noQuarterState;
		}
	}
	
	public void insertQuarter()
	{
		state.insertQuarter();
	}
	
	
	public void ejectQuarter()
	{
		state.ejectQuarter();
	}
	
	public void turnCrank()
	{
		state.turnCrank();
		state.dispense();
	}
	
	
	public void setState(State state)
	{
		this.state = state;
	}
	
	public void releaseBall()
	{
		System.out.println("A gumball comes rolling out the slot ...");
		if(count != 0)
		{
			count = count-1;
		}
	}
	
	
	public State getNoQuarterState()
	{
		return this.noQuarterState;
	}
	
	
	public State getHasQuarterState()
	{
		return this.hasQuarerState;
	}
	
	public State getSoldState()
	{
		return this.soldState;
	}
	
	public State getSoldOutState()
	{
		return this.soldOutState;
	}
	
	public State getWinnerState()
	{
		return this.winnerState;
	}
	public int getCount()
	{
		return this.count;
	}
	
	public String toString() {
		return "GumballMachine   " + state.getClass().getName() + "Gumballcount: " + getCount();
	}
}
