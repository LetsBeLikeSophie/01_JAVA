// package
package a.b.c.ch3;

// import


public class ExArray_1 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// �迭 : ��ü : new : ������ : ����Ʈ�� �ʱ�ȭ 
		int[] i = new int[3]; // ��Ұ� [0], [1], [2]
		System.out.println("int�� �������迭�� �������� i�� �ּҰ� >>> : " + i);
		/*
			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_1
			int�� �������迭�� �������� i�� �ּҰ� >>> : [I@15db9742

			[ : 1���� �迭 ������ ǥ�� 
			I : int �� : Integer
			@ : ������ 
			15db9742 : JVM�� �ִ� �ּҰ� 
		*/
		System.out.println("��迡 �ִ� i �� �ּҰ� >>> : " + System.identityHashCode(i));

		System.out.println("�迭�� �ִ� ����� ���� ������ �� ");
		System.out.println("�迭��������[index(�迭�� ÷��)], ù ��° ����� ���� ���� �Ͻÿ�  >>> :  " 
							+ "[0] :: " + i[0]); 
		System.out.println("�迭��������[index(�迭�� ÷��)], �� ��° ����� ���� ���� �Ͻÿ�  >>> :  " 
							+ "[1] :: " + i[1]); 
		System.out.println("�迭��������[index(�迭�� ÷��)], �� ��° ����� ���� ���� �Ͻÿ�  >>> :  " 
							+ "[2] :: " + i[2]); 

		int iLen = i.length;
		System.out.println("�迭�� ���̴� �迭�� ��������.length �ʵ� ��� >>> : ��Ұ��� - 1 :: " + iLen);

		/*
		for (int j=0; j <= iLen; j++ )
		{
			/*
			���(element) �� 3�� : 0, 1, 2
			j <= iLen
			0 <= 3 : i[0]
            1 <= 3 : i[1]
            2 <= 3 : i[2] 

			3 <= 3 : i[3] : 4��° ��Ҵ� �����Ͱ� ���� �� 
			java.lang.ArrayIndexOutOfBoundsException: 3
			*/
			// System.out.println("["+j+"] >>> : " + i[j]);
		// }
		
		/*
		[0] >>> : 0
		[1] >>> : 0
		[2] >>> : 0
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
				at a.b.c.ch3.ExArray_1.main(ExArray_1.java:54)

				java.lang.ArrayIndexOutOfBoundsException : ���� Ŭ���� : Exception class
				�ڹ� �迭�� �ε����� ���� ������ ��
				������ �ε��� �� ����� �ε����� ���̺��� ��ġ�ų�(���̰� ��ų�), ���ڶ�� (���̰� ª����)���� �����̴�. 
		
		*/


		// 1���� �迭�� �迭�� ����(length)�� �̿��ؼ� for ������ �迭 ��� ��ȸ�� ���� 
		for (int j=0; j < iLen; j++ )
		{
			System.out.println("["+j+"] >>> : " + i[j]);
		}
		
		i[0] = 11;
		i[1] = 12;
		i[2] = 13;

		for (int j=0; j < iLen; j++ )
		{
			System.out.println("["+j+"] >>> : " + i[j]);
		}

		// �迭 ����� ���ÿ� �ʱ�ȭ �ϴ� ��� 
		int ii[] = new int[]{1, 2, 3};
		System.out.println("int�� �������迭�� �������� ii �� �ּҰ� >>> : " + ii);		
		System.out.println("��迡 �ִ� ii �� �ּҰ� >>> : " + System.identityHashCode(ii));
		for (int j=0; j < ii.length; j++ )
		{
			System.out.println("["+j+"] >>> : " + ii[j]);
		}

		// �迭 ����� ���ÿ� �ʱ�ȭ �ϴ� ���, new int[] �����ϱ� : ���� ���� ����ϴ� ��� 
		int iii[] = {1, 2, 3};
		System.out.println("int�� �������迭�� �������� iii �� �ּҰ� >>> : " + iii);		
		System.out.println("��迡 �ִ� iii �� �ּҰ� >>> : " + System.identityHashCode(iii));
		for (int j=0; j < iii.length; j++ )
		{
			System.out.println("["+j+"] >>> : " + iii[j]);
		}
	}
}
