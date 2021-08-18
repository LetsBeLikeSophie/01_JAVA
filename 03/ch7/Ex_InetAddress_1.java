package a.b.c.ch7;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex_InetAddress {

	public static void main(String[] args) throws UnknownHostException {
//		DESKTOP-F83HPLG
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("InetAddress.getLocalHost()");
		System.out.println("address: " + address);
		System.out.println("Host name: " + address.getHostName());
		System.out.println("Host address: " + address.getHostAddress());
		System.out.println();
		
		InetAddress addressByName1 = InetAddress.getByName("localhost");
		System.out.println("InetAddress.getByName(localhost)");
		System.out.println("address: " + addressByName1);
		System.out.println("Host name: " + addressByName1.getHostName());
		System.out.println("Host address: " + addressByName1.getHostAddress());
		System.out.println();
		
		InetAddress addressByName2 = InetAddress.getByName("DESKTOP-F83HPLG");
		System.out.println("InetAddress.getByName(DESKTOP-F83HPLG)");
		System.out.println("address: " + addressByName2);
		System.out.println("Host name: " + addressByName2.getHostName());
		System.out.println("Host address: " + addressByName2.getHostAddress());
		System.out.println();
		
		InetAddress addressByName3 = InetAddress.getByName("192.168.219.107");
		System.out.println("InetAddress.getByName(192.168.219.107)");
		System.out.println("address: " + addressByName3);
		System.out.println("Host name: " + addressByName3.getHostName());
		System.out.println("Host address: " + addressByName3.getHostAddress());
		System.out.println();
		
		
	}

}
