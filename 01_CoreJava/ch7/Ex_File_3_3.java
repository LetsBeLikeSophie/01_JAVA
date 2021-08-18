package a.b.c.ch7;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_File_3_3{
	
	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void printFileList(File directory){
		
		System.out.println("Absolute path: " + directory.getAbsolutePath());
		
		File[] files = directory.listFiles();

		ArrayList subDir = new ArrayList();

		for (int i=0; i < files.length; i++){
			String fileName = files[i].getName();

			if (files[i].isDirectory())
			{
				fileName = "���丮 >>> : [" + fileName + "]";
				subDir.add(i + "");
			}
			System.out.println("���� >>> :" +  fileName);
		}

		int NumOfDirs = subDir.size();
		int NumOfFiles = files.length - NumOfDirs;

		totalFiles += NumOfFiles;
		totalDirs += NumOfDirs;

		System.out.println(NumOfFiles + " ���� ����, " + NumOfDirs + " ���� ���丮");
		System.out.println();

		for (int i=0; i < subDir.size(); i++){
			
			System.out.println("subDir.get("+i+") >>> : " + subDir.get(i));
			
			// 1. subDir.get(i)
			// 2. (String)subDir.get(i)
			// 3. Integer.parseInt() 
			int index = Integer.parseInt((String)subDir.get(i));
			printFileList(files[index]); 
		}
	}

	public static void main(String args[]){
		//String arg = "C:\\00.JExam";
		
		// String args = c:\\00.kosmo93\10.JExam
		if (args.length != 1){
			System.out.println(" USAGE : java FileTest_5 DIRECTORY");
			System.exit(0);
		}

		File directory = new File(args[0]);

		if (!directory.exists() || !directory.isDirectory()){
			System.out.println(" ��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
	
		// �޼ҵ� 
		printFileList(directory);
		System.out.println();
		System.out.println(" �� : " + totalFiles + " ���� ����");
		System.out.println(" �� : " + totalDirs + " ���� ���丮");
	}
}