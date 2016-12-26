package Delegate;

import java.rmi.Naming;

public class MyRemoteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyRemoteClient().go();
	}
	
	public void go()
	{
		try{
			MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
			String s = service.sayHello();
			System.out.println(s);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
