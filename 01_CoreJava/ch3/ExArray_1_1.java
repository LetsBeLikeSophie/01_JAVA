// package
package a.b.c.ch3;

// import


public class ExArray_1_1
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		char[] cA = new char[26];
		char ch = 'A';

		for (int i=0; i < cA.length; i++)
		{
			// ��ҿ� �� ���� 
			cA[i] = ch;
			ch++;
		}

		for (int i=0; i < cA.length; i++ )
		{
			// ����� ���� ��ȸ, �ƽ�Ű 10������ ����ȯ �ؼ� ��ȸ 
			System.out.println(cA[i] + " , " + (int)cA[i]);
			// 8����, 16������ ��ȸ �غ��� print ����ؼ� �� �ٷ� �����ֱ�, �� ���ĺ� �빮�ڸ� 
		}
	}
}
