package a.b.c.ch5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Date_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Deprecated. : ���粨 ���� �� ���� ������ ������ �̰��� ������� ���ÿ� 
		// ���Ϳ��� �ð��� : �ʷ� ����Ѵ�. : 1 day = 24 * 60 * 60 = 86400
		// The leap second : ���� : 
		// Greenwich mean time (GMT) 
		// global positioning system (GPS)
		// A year y is represented by the integer y - 1900.
		// A month is represented by an integer from 0 to 11; 0 is January, 1 is February, and so forth; thus 11 is December.
		// A date (day of month) is represented by an integer from 1 to 31 in the usual manner.
		// Date Ŭ������ ������ ��� ���� 
		
		// ��ǻ�� �ð� : Ŭ���̾�Ʈ �ð�, ���� �ð�  
		Date d = new Date();
		System.out.println("d >>> : " + d);
		System.out.println("d >>> : " + System.identityHashCode(d));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");		
		System.out.println("sdf >>> : " + sdf);
		System.out.println("sdf >>> : " + sdf.format(d));
		
		Date d1 = new Date();
		System.out.println("d1 >>> : " + d1);
		System.out.println("d1 >>> : " + System.identityHashCode(d1));	
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("sdf1 >>> : " + sdf1);
		System.out.println("sdf 1>>> : " + sdf1.format(d1));
	}

}
