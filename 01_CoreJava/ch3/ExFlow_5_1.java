// package
package a.b.c.ch3;

// import


public class ExFlow_5_1
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// �ܺ� for ��
		for (int i=0; i < 9; i++ )
		{
			System.out.println("\n�ܺ� for i >>> : " + i + "\n");
			// ���� for �� 
			for (int j=0; j < 9; j++ )
			{
				System.out.println("���� for j >>> : " + j);
			}			
		}

		for (int i=0; i < 9; i++ )
		{			
			for (int j=0; j < 9; j++ )
			{
				System.out.print("("+i+","+j+")");
			}			
		}
		System.out.println();

		// ������ 1 ~ 9
		for (int i=1; i <= 9; i++ )
		{			
			for (int j=1; j <= 9; j++ )
			{
				System.out.print("("+i+","+j+")");
			}			
		}
		System.out.println();
	}
}
