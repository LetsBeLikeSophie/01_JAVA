package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import a.b.c.common.FilePath;


public class Ex_URL_1 {

	public static void main(String[] args) {
		
		String filePath = FilePath.FILE_PATH_08;
		String urlByString = "https://www.naver.com";
		
		try {
			URL url = new URL(urlByString);
			//InputStreamReader inputStreamReader = ;
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(url.openStream(), "UTF-8"));
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
			String line = "";
			
			while ((line = bufferedReader.readLine()) != null){
				System.out.println(line);
				bufferedWriter.write(line);
				
			}
			bufferedWriter.flush();
			bufferedWriter.close();
			bufferedReader.close();
			
		
		} catch (Exception e) {
			System.out.println("에러메세지" + e);
		}
		
		

	}

}
