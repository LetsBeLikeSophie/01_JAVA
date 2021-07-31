package a.b.c.ch7;

import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;

import a.b.c.common.FilePath;

public class Ex_InStrReadTest{

	public static void main(String args[]){
		/*	
			InputStreamReader isr = 
				new InputStreamReader(
				new FileInputStream("Ex_InStrReadTest.java"));
			while ((data=isr.read()) !=-1)
			{
				// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�. 
				System.out.print((char)data);
			}
		*/
		
		// ���� �н� ����Ŭ�������� �ҷ����� 
		String filePath = FilePath.FILE_PATH;

		// ���� �н� �� ����� ���� ������ �ʱ�ȭ 
		String inFile = filePath + "/" + "Ex_InStrReadTest.java";

		File ff = null;
		FileInputStream fis = null;
		InputStreamReader isr = null; // byte -> char ��ȯ�Ѵ� io ������Ʈ�� Ŭ���� 
		int data = 0;
		boolean bFile = false;

		try{
			ff = new File(inFile);			
			bFile = ff.exists();

			if (bFile){
				fis = new FileInputStream(ff);
				isr = new InputStreamReader(fis);

				while ((data=isr.read()) !=-1){
					// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�. 
					System.out.print((char)data);					
				}

			}else{
				System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�. >>> : ");
			}
			
			isr.close(); isr=null;
			fis.close(); fis=null;
		}
		catch (Exception e){
			System.out.println("e >>> : " + e);
		}finally{		
			if (isr !=null){
				try{isr.close(); isr=null;}catch (Exception e){}
			}
			if (fis !=null){
				try{fis.close(); fis=null;}catch (Exception e){}
			}
		}
	}
}