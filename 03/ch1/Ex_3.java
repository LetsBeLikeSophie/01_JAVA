package a.b.c.ch1;

public class Ex_3 {

	// main �Լ� : �ܼ� ���ø����̼��� ������ 
	public static void main(String args[]){
		System.out.println("Ex_3 :: main() ���� >>> :  ");

		int i = 1;
		System.out.println(i); // 1
		
		i = 2;
		System.out.println(i); // 2

		// int ii;
		System.out.println(ii); // 
		/*
			Ex_3.java:15: error: cannot find symbol
					System.out.println(ii); //
									   ^
			symbol:   variable ii
			location: class Ex_3
			1 error
		*/
		/*
			�Լ� �� �ȿ��� �����ϴ� ������ ����������� �θ���.
			���� ������ ����ϱ� ���� �� �ʱ�ȭ�� �ؾ� �Ѵ�.
		*/
		int ii = 22;
		System.out.println(ii); // 22

		System.out.println("Ex_3 :: main() �� >>> :  ");
	} // end of main �Լ� 
} // end of Ex_2 Ŭ���� 