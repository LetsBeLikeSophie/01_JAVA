package a.b.c.ch7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.FilePath;

public class Ex_BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� �н� ����Ŭ�������� �ҷ����� 
		String filePath = FilePath.FILE_PATH;

		// ���� �н� �� ����� ���� ����� �ʱ�ȭ 
		String inFile = filePath + "/" + "Ex_BufferedStream.java";
		String outFile = filePath + "/" + "Ex_BufferedStream.bak";
		
		BufferedInputStream inbuf = null;
		BufferedOutputStream outbuf = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
		
			fis = new FileInputStream(inFile);
			inbuf = new BufferedInputStream(fis);
		}catch (Exception e) {
		
			
		}
	}

}
