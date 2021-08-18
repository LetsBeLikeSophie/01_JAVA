package a.b.c.ch5;

public class Ex_String_3 extends java.lang.Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��Ʈ�� Ŭ���� ���ڿ� �� �Լ� equals()
		String s1 = "abc";
		String s2 = "abc";	
		
		System.out.println("s1 >>> : " + s1);
		System.out.println("s2 >>> : " + s2);
		System.out.println("System.identityHashCode(s1) >>> : " + System.identityHashCode(s1));
		System.out.println("System.identityHashCode(s2) >>> : " + System.identityHashCode(s2));		
		
		boolean b = s1.equals(s2);
		System.out.println("b >>> : " + b);

//		== : ������ : �ڹٿ����� �����ڷ������� ����ϴ� �� : ���� ���ϴ� ������ 
//      �ڹٿ����� == �ϰ� java.lang.Object.equals() ������ ��� �̴�. 		
//		�ڹٽ�ũ��Ʈ : ������Ÿ���� ������ �� �ڵ�� ������ ���� �ʴ´�. 
//		�ڹٽ�ũ��Ʈ�� ������ Ÿ���� �������� �ʴ´�.
//		������ Ÿ�� ���� var �ϳ��� �ִ�. 
//		���ڿ� == ���ڿ� 
//		���� == ����
//		���� == ����  
		boolean b1_1 = s1 == s2;
		System.out.println("b1_1 >>> : " + b1_1);	
		
		String ss1 = "abcd";
		String ss2 = "abcde";
		boolean b1 = ss1.equals(ss2);
		System.out.println("b1 >>> : " + b1);	
		
		String s3 = new String("abc");
		String s4 = new String("abc");	
		
		System.out.println("new String(\"abc\") s3 >>> : " + s3);
		System.out.println("new String(\"abc\") s4 >>> : " + s4);
		System.out.println("System.identityHashCode(s3) >>> : " + System.identityHashCode(s3));
		System.out.println("System.identityHashCode(s4) >>> : " + System.identityHashCode(s4));		
		
		boolean b2 = s3.equals(s4);
		System.out.println("b2 >>> : " + b2);
		boolean b2_1 = s3 == s4;
		System.out.println("b2_1 >>> : " + b2_1);		
		
		/*
			java.lang.Object.equals(); 
				��ü�� �ּҰ��� �� �ϴ� �Լ�
			java.lang.String.equals(); 
				���ڿ��� ���ϴ� �Լ� 
				Object Ŭ������ �ִ� equals() �Լ��� �������̵��ؼ� 
				String Ŭ���������� ���ڿ��� ���� ���ϴ� �����ڷ� ����Ѵ�. 
			equals()�� ����� �� ���ϴ� ��ü�� ����  jvm�� �Ǵ��� �Ѵ�. 
			
			java.util.Objects.euquas() 
		*/
		
//		Object obj = new Ex_String_2();
//		Ex_String_2 ex2 = (Ex_String_2)obj;
//		boolean b3 = obj.equals(ex2);
//		System.out.println("b3 >>> : " + b3);
//		boolean b3_1 = obj == ex2;
//		System.out.println("b3_1 >>> : " + b3_1);
	}

}
