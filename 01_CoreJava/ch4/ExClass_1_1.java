// package
package a.b.c.ch4;

// import
import java.lang.Object;

public class ExClass_1 extends Object
{
	// ��� 
	// �������
	// ������
	public ExClass_1(){
		System.out.println("ExClass_1() ������");
	}

	// �Լ� 
	public String toString(){
		
		String str = "�� java.lang.Object root Ŭ������ �ִ� toString() �Լ��̴�. !!";
		String str1 = "����� ���� Ŭ���� ExClass_1 Ŭ�������� java.lang.Object �θ� Ŭ������ �ִ�";
		String str2 = "toString() �Լ��� �ҷ��� �����ؼ� ����ϴ� ���̴�.";
		String str3 = "�θ� Ŭ������ �ִ� �ڿ��� �Լ��� �ҷ��� ����ϴ� �������̵��̴�.";

		// 	str.concat(str1).concat(str2).concat(str3) 
		//  �Լ��� .(��ũ ������) �� �̿��ؼ� �Լ��� ȣ�� ����� �޼ҵ� ü�� �̶�� �θ���. 
		return str.concat(str1).concat(str2).concat(str3);
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExClass_1.main() �Լ� ���� >>> : ");
		
		/*
		����� ���� ExClass_1 �� �ν��Ͻ� �ϸ� 
		��� ���踦 Ȯ���ϰ� ��ӵ� Ŭ������ ���� �޸𸮿� �ø���.
		����� ���� ����ϴ� Ŭ������ �����Ƿ� 
		�⺻������ ��ӵǴ� java.lang.Object Ŭ������ �޸𸮿� 
		���� �ø���.
		*/
		ExClass_1 ec1 = new ExClass_1();
		System.out.println("ec1 �ּҰ� >>> : " + ec1);
		System.out.println("ec1.toString() >>> : " + ec1.toString());
		
		
		System.out.println("ExClass_1.main() �Լ� �� >>> : ");
	}
}
