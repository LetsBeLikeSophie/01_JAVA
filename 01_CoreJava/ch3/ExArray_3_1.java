// package
package a.b.c.ch3;

// import


public class ExArray_3_1 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		int[][] arr = {{1, 2, 3}, {4, 5, 6}};

		for (int i=0; i < arr.length ; i++ ) 
			{
//			System.out.println(arr.length);
			System.out.println("arr["+i+"] >>> : " + arr[i]);
			for (int j=0; j < arr[i].length; j++) 
			{
				System.out.println("arr["+i+"]["+j+"] >>> : " + arr[i][j]);
			}
		}

		System.out.println("=====================================================");

		for (int i=0; i < arr.length ; i++ )
		{
			System.out.println("arr["+i+"] >>> : " + arr[i]);
			for (int j=0; j < arr[i].length; j++)
			{
				System.out.print("arr["+i+"]["+j+"] >>> : " + arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("=====================================================");

		for (int i=0; i < arr.length ; i++ )
		{			
			for (int j=0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " A");
			}
			System.out.println();
		}

	}
}
