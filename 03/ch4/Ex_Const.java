// package
package a.b.c.ch4;

// import

// ConstTest_1 : �θ� Ŭ���� 
// Ex_Const : �ڽ� Ŭ���� 
public class Ex_Const extends ConstTest_1
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	public Ex_Const(){
		System.out.println("Ex_Const() ������ >>> : ");
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		Ex_Const ec = new Ex_Const();

		// java.lang.Objec.toString();
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// ec >>> : a.b.c.ch4.Ex_Const@15db9742
		System.out.println("Ex_Const() ������ ec �ּҰ� JVM  >>> : " + ec.toString());
		System.out.println("ec.getClass() >>> : " + ec.getClass());
		System.out.println("ec.getClass().getName() >>> : " + ec.getClass().getName());
		// System.identityHashCode(Object x)
		System.out.println("��� >>> : " + System.identityHashCode(ec));

	}
}


class ConstTest_1 extends java.lang.Object
{
	public ConstTest_1(){
		System.out.println("ConstTest_1() ������ >>> : ");
	}
}