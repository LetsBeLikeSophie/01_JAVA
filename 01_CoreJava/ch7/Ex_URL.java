package a.b.c.ch7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex_URL {

	public static void main(String[] args) {
		String urlByString = "https://www.naver.com";
		
		try {
			URL url = new URL(urlByString);
			InputStreamReader inputStreamReader = new InputStreamReader(url.openStream(), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String line = "";
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
			
		} catch (Exception e) {
			System.out.println("에러 메세지: " + e);
		}
	}
}
