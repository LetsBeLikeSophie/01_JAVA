// package
package a.b.c.ch3;

// import


public class ExArray_2_1
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	// String[] args : main �Լ��� �ƱԸ�Ʈ �̰� String �迭�̴�. 
	// String[] args = {"abc", "def", ........};
	// �ܼ� ���ø����̼� ����� �μ� ��� �θ���. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		System.out.println("args.length >>> : " + args.length);

		// String[] args = {..................};
		System.out.println("args[0] >>> : " + args[0]);
		System.out.println("args[1] >>> : " + args[1]);

		/*
			�ܼ� ���ø����̼� ���� �Լ� ��Ʈ�� �迭 �ƱԸ�Ʈ ���� 
			�ܼ�â���� Ŭ���� ������ �� ���౸�� �ڿ��� �ƱԸ�Ʈ�� �� �����ڷ� �ؼ� �Է��Ѵ�. 
			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_2_1 abc def
			String[] args = {"abc", "def"};
			args[0] >>> : abc
			args[1] >>> : def


			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_2_1 abc def
			args.length >>> : 2
			args[0] >>> : abc
			args[1] >>> : def

			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_2_1 abc def d f d
			args.length >>> : 5
			args[0] >>> : abc
			args[1] >>> : def

			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_2_1 abc def d f d d f d d d
			args.length >>> : 10
			args[0] >>> : abc
			args[1] >>> : def
		
		*/
	}
}
