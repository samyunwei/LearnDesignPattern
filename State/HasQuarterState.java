package State;

import java.util.Random;

public class HasQuarterState implements State{
	GumballMachine2 gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis());
	public HasQuarterState(GumballMachine2 gumballMachine) {
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
		int winner = randomWinner.nextInt(10);
		if((winner == 0) && (gumballMachine.getCount() > 1))
		{
			gumballMachine.setState(gumballMachine.getWinnerState());
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
}
