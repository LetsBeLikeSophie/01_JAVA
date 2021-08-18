package a.b.c.ch5;

import java.util.Calendar;

public class Ex_Calendar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cd = Calendar.getInstance();
		System.out.println("cd >>> : /n" + cd);
		
		// ³â
		int y = cd.get(Calendar.YEAR);
		System.out.println("y >>> : " + y);
		System.out.println("cd.get(1) >>> : " + cd.get(1));
		
		// ¿ù 
		int m = cd.get(Calendar.MONTH);// + 1;
		System.out.println("m >>> : " + m);
		System.out.println("(cd.get(2)+1) >>> : " + (cd.get(2)+1));		
		
		// ÀÏ 
		int d = cd.get(Calendar.DATE);
		System.out.println("d >>> : " + d);
		System.out.println("cd.get(5) >>> : " + cd.get(5));
		
		int d1 = cd.get(Calendar.DAY_OF_MONTH);
		System.out.println("d1 >>> : " + d1);
	}

}
