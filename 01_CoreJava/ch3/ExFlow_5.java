// package
package a.b.c.ch3;

// import


public class ExFlow_5 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		for (int i=0; i < 3; i++ )
		{
			for (int j=0; j < 3; j++)
			{
				System.out.println("("+i+","+j+")");
			}
		}
		System.out.println();

		for (int i=0; i < 3; i++ )
		{
			for (int j=0; j < 3; j++)
			{
				System.out.print("("+i+","+j+")");
			}
		}
		System.out.println();
		System.out.println();

		//System.out.println("\n");

		for (int i=0; i < 3; i++ )
		{
			for (int j=0; j < 3; j++)
			{
				System.out.print("("+i+","+j+")");
			}
			System.out.println();
		}
		System.out.println();
		for (int i=0; i < 3; i++ )
		{
			for (int j=0; j < 3; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}