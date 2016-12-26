package State;

public class NoQuarterState implements State{
	GumballMachine2 gumballMachine;
	public NoQuarterState(GumballMachine2 gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned but there's no quarter");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You need to pay first");
	}

}
