package a.b.c.ch5;

import java.util.Date;

public class Ex_Date_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		/*
			Date Ŭ������ epoch �ð�(����ũ �ð�)�� �����Ѵ�.
			1970�� 1�� 1�� 00:00:00 �ð��� �������� ������ �ð��� millisecond �� ��ȯ�Ѵ�.			  	
		*/
		
		// �� 
		// public int getYear()
		int year = d.getYear();
		System.out.println("year >>> : " + year);
		year = year + 1900;
		System.out.println("year + 1900 >>> : " + year);
		
		// ��
		// public int getMonth()
		int month = d.getMonth();
		System.out.println("month >>> : " + month);	
		month = month + 1;
		System.out.println("month + 1 >>> : " + month);		
		
		// �� 
		// public int getDate()
		int date = d.getDate();
		System.out.println("date >>> : " + date);		
		
		String time = year + "." + month + "." + date;
		System.out.println("time >>> : " + time);
		time = time.replace('.', '-');
		System.out.println("time >>> : " + time);	
		time = time.replace('-', '/');
		System.out.println("time >>> : " + time);
	}
}
