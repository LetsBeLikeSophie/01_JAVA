// package
package a.b.c.ch5;

// import


public class Ex_Refer
{
	// ��� 
	// �������
	// ������
	public Ex_Refer_1(){
		System.out.println("Ex_Refer_1() ������ >>> : ");
	}
	// �Լ� 
	public void rederMethod(TestVO tvo){
		System.out.println("Ex_Refer_1.rederMethod() �Լ� ���� >>> : ");
		System.out.println("tvo >>> : " + tvo);		
	}

	public void primerMethod(int i, int i1){
		System.out.println("Ex_Refer_1.rederMethod() �Լ� ���� >>> : ");
		System.out.println("i >>> : " + i);
		System.out.println("i1 >>> : " + i1);
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// ��������, �����ڷ���
		int i = 11;
		int i1 = 22;
		
		Ex_Refer_1 ef1 = new Ex_Refer_1();
		System.out.println("ef1 >>> : " + ef1);
		ef1.primerMethod(i, i1);
		
		// ��������, �����ڷ���
		TestVO tvo = new TestVO();
		System.out.println("tvo >>> : " + tvo);
		ef1.rederMethod(tvo);
	}
}
