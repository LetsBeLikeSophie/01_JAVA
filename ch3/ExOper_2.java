// package
package a.b.c.ch3;

// import


public class ExOper_2 
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// ���� �����ڴ� ������ ����� �� ��(true, false)���� ��ȯ �Ѵ�. 
		System.out.println( 3 < 5 );
		System.out.println( 3 > 5 );
		System.out.println( 3 <= 5 );
		System.out.println( 3 >= 5 );
		System.out.println( 3 == 5 ); // == : ������ : ������ ���ϴ� ������, 
		System.out.println( 3 != 5);

		boolean bool = false;
		
		bool = 3 < 5;
		System.out.println("3 < 5 = " + bool);
		bool = 3 > 5;
		System.out.println("3 > 5 = " + bool);
		bool = 3 <= 5;
		System.out.println("3 <= 5 = " + bool);
		bool = 3 >= 5;
		System.out.println("3 >= 5 = " + bool);
		bool = 3 == 5;
		System.out.println("3 == 5 = " + bool);
		bool = 3 != 5;
		System.out.println("3 != 5 = " + bool);

		bool = 'a' < 'b';
		System.out.println(bool);
		bool = 'A' < 'B';
		System.out.println(bool);
		bool = 'A' < 40;
		System.out.println(bool);
		bool = 'A' < 0x65;
		System.out.println(bool);
		
		bool = 'a' < '��';
		System.out.println(bool);

		bool = '��' < '��';
		System.out.println(bool);

		
		//bool = '����' < '����';
		//System.out.println(bool);
		
		//bool = "��" < "��";
		//System.out.println(bool);
		
	}
}
