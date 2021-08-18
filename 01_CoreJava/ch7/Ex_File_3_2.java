package a.b.c.ch7;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_File_3_2{
	
	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void printFileList(File inputDir) {
		System.out.println("" + inputDir.getAbsolutePath());
		File[] files = inputDir.listFiles();
		ArrayList subDir = new ArrayList(); 
		
		for (int i =0; i < files.length; i++) {
			String fileName = files[i].getName();
			if (files[i].isDirectory()) {
				System.out.println("[" + files[i] + "]");
				subDir.add(files[i]);	
			}
			
			totalDirs = subDir.size();
			totalFiles = files.length - totalDirs;
			System.out.println("총 디렉토리 수: " + totalDirs);
			System.out.println("총 파일 수: " + totalFiles);
			
		}
		
		
	}


	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("디렉토리명을 입력하세요: ");
		String fileName = scanner.nextLine();
		File inputDir = new File(fileName);
		
		if (args.length != 1) {
			System.out.println("Usage");
			System.exit(0);
		}
		//File directory = new File(args[0]);
		if (!inputDir.exists() || !inputDir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리 입니다.");
		}
		
		printFileList(inputDir);
		System.out.println();
		System.out.println(" 총 : " + totalFiles + " 개의 파일");
		System.out.println(" 총 : " + totalDirs + " 개의 디렉토리");
		
	}

	
}