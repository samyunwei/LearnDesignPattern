package Delegate;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Server says, 'Hey' ";
	}
	
	public MyRemoteImpl() throws RemoteException{
		
	}
	
	public static void main(String[] args)
	{
		try
		{
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("rmi://localhost/RemoteHello",service);
			System.out.println("°ó¶¨³É¹¦");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
