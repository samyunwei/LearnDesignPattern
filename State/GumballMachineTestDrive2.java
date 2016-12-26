package State;

public class GumballMachineTestDrive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine2 gumballMachine = new GumballMachine2(5);
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}

}
