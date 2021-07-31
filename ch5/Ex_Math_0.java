package a.b.c.ch6;

import java.text.DecimalFormat;

public class Ex_Math_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// E : �ڿ��α��� ���� e �� : 2.718
		System.out.println("E : " + Math.E);
		
		// PI : ������ �� : 3.14159
		System.out.println("PI : " + Math.PI);
		
		// max : ū��
		int max = Math.max(2, 2);
		System.out.println("max >>> : " + max);
		
		// min : ���� ��
		int min = Math.min(2, 2);
		System.out.println("min >>> : " + min);
		
		// random() : 0.0 ~ 1.0 ���� ���� (0.0 ~ 0.9)
		double random = Math.random(); // java.util.Random
		System.out.println("random >>> : " + random);
		
		// abs() : ���밪 (-, + ��ȣ��Ʈ ����)
		int abs = Math.abs(-10);
		System.out.println("abs >>> : " + abs);
		
		// round : �Ҽ��� ù ��° �ڸ� �ݿ���
		System.out.println("round >>> : #######################");		
		double round = Math.round(1.12345);
		System.out.println("round >>> : " + round);
		double d = 3.123456789;
		System.out.println("Math.round(d) >>> : " + Math.round(d));
		System.out.println("Math.round(d*100)/100.0 >>> : " + Math.round(d*100)/100.0);
		System.out.println("Math.round(d*1000)/1000.0 >>> : " + Math.round(d*1000)/1000.0);
		System.out.println("Math.round(d*1000000)/1000000.0 >>> : " + Math.round(d*1000000)/1000000.0);

		System.out.println("String.format(\"%.2f\", d) >>> : " + String.format("%.2f", d));
		System.out.println("String.format(\"%.3f\", d) >>> : " + String.format("%.3f", d));
		System.out.println("String.format(\"%.5f\", d) >>> : " + String.format("%.5f", d));

		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("���� >>> : " + df.format(1.234567));
		
		System.out.println("round >>> : #######################");
		
		// ceil : ���� ���� �Ǽ����� ���� ���� �� ���� ���� ���� ��ȯ
		double ceil = Math.ceil(10.1);
		System.out.println("ceil >>> : " + ceil);
		
		// floor : ���� ���� �Ǽ����� ���� ���� �� ���� ū ���� ��ȯ
		double floor = Math.floor(10.9);
		System.out.println("floor >>> : " + floor);
		
		// pow : �������� : (5, 2) -> 25
		double pow = Math.pow(5, 2);
		System.out.println("pow >>> : " + pow);		

	}

}