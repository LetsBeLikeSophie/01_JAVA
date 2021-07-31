package a.b.c.ch7;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex_InetAddress_2 {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress addressByName1 = InetAddress.getByName("www.naver.com");
		System.out.println("Host name: " + addressByName1.getHostName());
		System.out.println("Address: " + addressByName1.getHostAddress());
		System.out.println();
		
		InetAddress addressByName2 = InetAddress.getByName("www.google.com");
		System.out.println("Host name: " + addressByName2.getHostName());
		System.out.println("Address: " + addressByName2.getHostAddress());
		System.out.println();
		
		InetAddress addressByName3 = InetAddress.getByName("www.youtube.com");
		System.out.println("Host name: " + addressByName3.getHostName());
		System.out.println("Address: " + addressByName3.getHostName());
		System.out.println();
		
		InetAddress addressByName4 = InetAddress.getByName("www.daum.net");
		System.out.println("Host name: " + addressByName4.getHostName());
		System.out.println("Address: " + addressByName4.getHostName());
		System.out.println();
				
		

	}

}
