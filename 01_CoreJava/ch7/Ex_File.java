package a.b.c.ch7;

import java.io.File;
import java.io.IOException;

public class Ex_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// File Ŭ������  �ڹٿ��� ���� �� ���� ��ü�� �ٷ�� Ŭ�����̴�. 
			File f = new File("aaaaaa");
			System.out.println("f >>> :  " + f);
			System.out.println("f.getName() >>> :  " + f.getName());
			boolean bf = f.createNewFile();
			System.out.println("bf >>> : " + bf);
			
		}catch(Exception io) {
			
		}		
	}
}
