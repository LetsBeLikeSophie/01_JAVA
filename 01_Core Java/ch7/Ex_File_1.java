package a.b.c.ch7;

import java.io.File;

import a.b.c.common.FilePath;


public class Ex_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = FilePath.FILE_PATH;
		
		try {
			// File Ŭ������  �ڹٿ��� ���� �� ���� ��ü�� �ٷ�� Ŭ�����̴�. 
			//  new File() : File Ŭ������ �ν��Ͻ��� ���� 
			// ���� �ϵ��ũ�� �������� ����/����(���丮)�� �������� �ʴ´�. 
			// ���� ����/����(���丮)�� ����� ���ؼ��� File Ŭ������ �ִ� �Լ��� ȣ���ؾ� �Ѵ�. 
			// createNewFile(), mkdir(), mkdirs()
			File f = new File("aaaaaa");
			System.out.println("f >>> :  " + f);
			System.out.println("f.getName() >>> :  " + f.getName());
			boolean bf = f.createNewFile();
			System.out.println("bf >>> : " + bf);
		
			boolean bdir = f.isDirectory();
			System.out.println("bdir >>> : " + bdir);
			boolean bfile = f.isFile();
			System.out.println("bfile >>> : " + bfile);
			
			String getPath = f.getPath(); // File�� �Էµ� ��� ��� 
			System.out.println("getPath >>> : " + getPath);
			String getAbsolutePath = f.getAbsolutePath(); // ������ + �Էµ� ���(������� ���� ���)
			System.out.println("getAbsolutePath >>> : " + getAbsolutePath);
			String getCanonicalPath = f.getCanonicalPath(); // ������ + �Էµ� ���(����� ���)
			System.out.println("getCanonicalPath >>> : " + getCanonicalPath);
						
			File f1 = new File(filePath + "/" + "aaaaaa.txt");
			System.out.println("f1 >>> :  " + f1);
			System.out.println("f1.getName() >>> :  " + f1.getName());
			boolean bf1 = f1.createNewFile();
			System.out.println("bf1 >>> : " + bf1);
			
			boolean bdir1 = f1.isDirectory();
			System.out.println("bdir1 >>> : " + bdir1);
			boolean bfile1 = f1.isFile();
			System.out.println("bfile1 >>> : " + bfile1);
			
			String getPath1 = f1.getPath(); // File�� �Էµ� ��� ��� 
			System.out.println("getPath1 >>> : " + getPath1);
			String getAbsolutePath1 = f1.getAbsolutePath(); // ������ + �Էµ� ���(������� ���� ���)
			System.out.println("getAbsolutePath1 >>> : " + getAbsolutePath1);
			String getCanonicalPath1 = f1.getCanonicalPath(); // ������ + �Էµ� ���(����� ���)
			System.out.println("getCanonicalPath1 >>> : " + getCanonicalPath1);
			
		}catch(Exception io) {
			
		}		
	}
}
