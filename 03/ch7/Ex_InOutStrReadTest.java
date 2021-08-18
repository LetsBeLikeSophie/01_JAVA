package a.b.c.ch7;

import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import a.b.c.common.FilePath;

public class Ex_InOutStrReadTest{

	public static void main(String args[]) throws IOException{
		
		// ���� �н� ����Ŭ�������� �ҷ����� 
		String filePath = FilePath.FILE_PATH;

		// ���� �н� �� ����� ���� ����� �ʱ�ȭ 
		String inFile = filePath + "/" + "Ex_InOutStrReadTest.java";
		String outFile = filePath + "/" + "Ex_InOutStrReadTest.bak";
		
		File ff = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		InputStreamReader isr = null; // byte -> char ��ȯ�Ѵ� io ������Ʈ�� Ŭ���� 
		OutputStreamWriter osw = null; // char -> byte ��ȯ�Ѵ� io ������Ʈ�� Ŭ����
		int data = 0;
		boolean bFile = false;

		try{
			ff = new File(inFile);			
			bFile = ff.exists();  

			if (bFile){
				fis = new FileInputStream(ff);
				isr = new InputStreamReader(fis);

				fos = new FileOutputStream(outFile);
				osw = new OutputStreamWriter(fos);

				while ((data=isr.read()) !=-1){
					// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�. 
					System.out.print((char)data);
					osw.write(data);
				}
				// flush() �ϱ� 
				osw.flush();
			}else{
				System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�. >>> : ");
			}
			
			isr.close(); isr=null;
			osw.close(); osw=null;
			fis.close(); fis=null;
			fos.close(); fos=null;
		}catch (Exception e){
			System.out.println("e >>> : " + e);
		}finally{		
			if (isr !=null){
				try{isr.close(); isr=null;}catch (Exception e){}
			}if (osw !=null){
				try{osw.close(); osw=null;}catch (Exception e){}
			}if (fis !=null){
				try{fis.close(); fis=null;}catch (Exception e){}
			}if (fos !=null){
				try{fos.close(); fos=null;}catch (Exception e){}
			}
		}
	}
}