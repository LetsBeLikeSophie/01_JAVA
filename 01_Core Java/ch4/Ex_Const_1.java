// package
package a.b.c.ch4;

// import

// ConstTest_1 : �θ� Ŭ���� 
// Ex_Const_1 : �ڽ� Ŭ���� 
public class Ex_Const_1 extends ConstTest_2
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	public Ex_Const_1(){
		super("�θ�Ŭ���� ������ ȣ��");
		System.out.println("Ex_Const_1() ������ >>> : ");
	}

	public Ex_Const_1(String src){
		super(src);
		System.out.println("Ex_Const_1(String src) ������ >>> : ");
		System.out.println("Ex_Const_1(String src) ������ src >>> : " + src);
	}
	
	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		Ex_Const_1 ec1 = new Ex_Const_1();
		System.out.println("ec1 >>> : " + ec1);

		Ex_Const_1 ec2 = new Ex_Const_1("�θ�Ŭ����������ȣ��");
		System.out.println("ec2 >>> : " + ec2);
	}
}

class ConstTest_2 extends java.lang.Object
{
	public ConstTest_2(){
		System.out.println("ConstTest_2() ������ >>> : ");		
	}

	public ConstTest_2(String name){
		System.out.println("ConstTest_2(String name) ������ >>> : ");
		System.out.println("ConstTest_2() ������ name >>> : " + name);
	}
}
