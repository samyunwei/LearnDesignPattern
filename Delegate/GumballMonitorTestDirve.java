package Delegate;

import java.rmi.Naming;


public class GumballMonitorTestDirve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup("rmi://localhost/gumballmachine");
			GumballMonitor monitor = new GumballMonitor(machine);
			monitor.report();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
