package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class EX_URL_2 {

	public static void main(String[] args) {
		String urlByString = 
				"https"
				+ "://"
				+ "nid.naver.com"
				+ "/nidlogin.login"
				+ "?"
				+ "mode=form"
				+ "&"
				+ "url=https%3A%2F%2Fwww.naver.com";
		try {
			URL url = new URL(urlByString);
			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host: " + url.getHost());
			System.out.println("Path: " + url.getPath());
			System.out.println("Port: " + url.getPort());
			System.out.println("Query: " + url.getQuery());
			System.out.println("File: " + url.getFile());
			System.out.println();
			
			BufferedReader bufferedReader = new BufferedReader(
											new InputStreamReader(url.openStream(), "UTF-8"));
			String readByLine ="";
			while((readByLine = bufferedReader.readLine()) != null) {
				System.out.println(readByLine);
			}
			bufferedReader.close();	
		}catch (Exception e) {
				System.out.println("에러메세지: " + e);		
			}
		}

}
