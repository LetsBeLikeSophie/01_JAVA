// package
package a.b.c.ch5;

// import


public class Ex_String_2
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		String s = "";
		int sLen = s.length();
		System.out.println("sLen >>> : " + sLen);

		String s1 = "      ";
		int sLen1 = s1.length();
		System.out.println("sLen1 >>> : " + sLen1);

		String s2 = "  kosmo hello world     ";
		System.out.println("s2 >>> : " + s2);		
		int sLen2 = s2.length();		
		System.out.println("sLen2 >>> : " + sLen2);

		// trim() �Լ��� ���ڿ��� ��, ���� ���� ���ڸ� �����ϴ� �Լ�, �� ���ڿ� �߰� �ش� ���� 
		String s3 = s2.trim();
		System.out.println("s3 >>> : " + s3);
		int sLen3 = s3.length();
		System.out.println("sLen3 >>> : " + sLen3);

		String sNull = null;
		System.out.println("sNull >>> : " + sNull);
		// System.out.println("sNull.length() >>> : " + sNull.length());
		/*
			sNull >>> : null
			Exception in thread "main" java.lang.NullPointerException
			 at a.b.c.ch5.Ex_String_1.main(Ex_String_1.java:40)
		*/

		// "" : ���̰� 0 (length()) 0 �� �� ���ڿ� 
		// null : null ������ : �����Ͱ� ����. 
		// String  ���ڿ� if ������ Validation �� ���� 
		String sVal = "";
		if (sVal !=null && sVal.length() > 0)
		{
			System.out.println("���̰� 0�� ������ �ɷ����� :: length() 0 Validation >>> : ");
		}
		String sVal1 = null;
		if (sVal1 !=null && sVal1.length() > 0)
		{
			System.out.println("null ������ �ɷ����� :: null Validation >>> : ");
		}
	}
}
