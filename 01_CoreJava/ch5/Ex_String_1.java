// package
package a.b.c.ch5;

// import

// java.lang.String Ŭ������ ���ڿ��� �ٷ�� Ŭ���� �̴�. 
// 1. public final class String : String Ŭ������ �������� ������ : ������� ������ 
// 2. ���ڿ� �Һ��� : immutable : ���� ���ڿ��� �������� �ʴ´�. : immutability
// 3. ����
// 4. ������ ������
public class Ex_String_1
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// s : ��������, �������� 
		String s = "abc";
		System.out.println("s >>> : " + s);
		System.out.println("s >>> : " + System.identityHashCode(s));

		String s1 = "abc";
		System.out.println("s1 >>> : " + s1);
		System.out.println("s1 >>> : " + System.identityHashCode(s1));

		String ss1 = s + s1;
		System.out.println("ss1 >>> : " + ss1);
		System.out.println("ss1 >>> : " + System.identityHashCode(ss1));

		String s2 = "abcd";
		System.out.println("s2 >>> : " + s2);
		System.out.println("s2 >>> : " + System.identityHashCode(s2));

		String s3 = "abcd";
		System.out.println("s3 >>> : " + s3);
		System.out.println("s3 >>> : " + System.identityHashCode(s3));

		String s4 = new String("abc");
		System.out.println("s4 >>> : " + s4);
		System.out.println("s4 >>> : " + System.identityHashCode(s4));

		String s5 = new String("abcd");
		System.out.println("s5 >>> : " + s5);
		System.out.println("s5 >>> : " + System.identityHashCode(s5));


		// String ���ڿ� ���ϱ� 
		// + �����ڸ� ����ؼ� ���ڿ� ���� �� �ִ� : �̰��� �����϶�� �Ѵ�. 
		// public String concat(String str) : concat  �Լ� ����� �����Ѵ�. 
		String sss = "abc";
		String sss1 = "abc";
		String sss2 = sss + sss1; // ����
		System.out.println("sss2 >>> : " + sss2);
		String sss3 = sss.concat(sss1); // ���� 
		System.out.println("sss3 >>> : " + sss3);
		// String ���ڿ� ���ϱ� �� ���� StringBuffer, StringBuilder Ŭ���� ����� ���� �Ѵ�.

	}
}
