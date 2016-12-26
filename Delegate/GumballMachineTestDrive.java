package Delegate;

import java.rmi.Naming;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			GumballMachineRemote gumballMachine =  new GumballMachine("localHost",10);
			Naming.rebind("rmi://localhost/gumballmachine",gumballMachine);
			System.out.println("Bind OK");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
