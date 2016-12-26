package Delegate;

import java.io.Serializable;
import java.rmi.RemoteException;

public class GumballMachine implements GumballMachineRemote,Serializable{
	State soldOutState;
	State noQuarterState;
	State hasQuarerState;
	State soldState;
	State state = soldOutState;
	String location;
	int count = 0;
	
	
	public GumballMachine(String location,int numberGumballs) {
		// TODO Auto-generated constructor stub
		soldState = new SoldState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarerState = new HasQuarterState(this);
		soldOutState = new SoldOutState(this);
		this.location = location;
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
	
	public int getCount()
	{
		return this.count;
	}
	
	public String toString() {
		return "GumballMachine   " + state.getClass().getName() + "Gumballcount: " + getCount();
	}

	@Override
	public String getLocation() throws RemoteException {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public State getState() throws RemoteException {
		// TODO Auto-generated method stub
		return state;
	}
}
