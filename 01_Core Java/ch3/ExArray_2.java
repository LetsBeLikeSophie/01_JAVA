// package
package a.b.c.ch3;

// import


public class ExArray_2
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		String str[] = new String[] {"abc", "def", "ghi"};
		System.out.println("str >>> " + str);
		System.out.println("��Ʈ�� �迭 Ŭ������ �迭�� ���� :: str.length >>> " + str.length);
		
		int strLen = str.length;
		for (int i=0; i < strLen; i++ )
		{
			System.out.println("str["+i+"] >>> : " + str[i]);
			for (int j=0; j < str[i].length(); j++)
			{
				System.out.println("str["+i+"].charAt("+j+") >>> : " + str[i].charAt(j));
				System.out.println("str["+i+"].charAt("+j+") >>> : 0x" + 
										Integer.toHexString(str[i].charAt(j)));
			}
		}

		// new String[] �� ������ ��Ʈ�� �迭 
		String str1[] = {"abc", "def", "ghi"};
		System.out.println("str1 >>> " + str1);
		System.out.println("��Ʈ�� �迭 Ŭ������ �迭�� ���� :: str1.length >>> " + str1.length);

		// str1[] �ֿܼ� ����� ����
		int str1Len = str1.length;
		for (int i=0; i < str1Len; i++ )
		{
			System.out.println("str1["+i+"] >>> : " + str1[i]);
			for (int j=0; j < str1[i].length(); j++)
			{
				System.out.println("str1["+i+"].charAt("+j+") >>> : " + str1[i].charAt(j));
				System.out.println("str1["+i+"].charAt("+j+") >>> : 0x" + 
										Integer.toHexString(str1[i].charAt(j)));
			}
		}

	}
}
