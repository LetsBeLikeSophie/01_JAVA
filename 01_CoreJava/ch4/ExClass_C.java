// package
package a.b.c.ch4;

// import


public class ExClass_C extends ExClass_P
{
	// ��� 
	// �������
	// ������
	public ExClass_C(){
		System.out.println("ExClass_C() ������ >>> : ");
	}

	// �Լ� 
	public String toString(){
		
		return "��������";
	}

	public String exClass_b(){
		return "ExClass_C.exClass_b() �Լ� >>> : ";
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExClass_C.main() �Լ� ���� >>> : ");

		/*
			1. ExClass_C Ŭ������ �ν��Ͻ� �ϸ� 
			2. extends ExClass_P �θ� Ŭ������ ���� ã�Ƽ� �޸𸮿� �ε��Ѵ�.
			3. �ڽ� Ŭ���� ExClass_C �� �޸𸮿� �ε��Ѵ�. 
		*/
		ExClass_C ecc = new ExClass_C();
		System.out.println("ecc �ּҰ� >>> : " + ecc);
		System.out.println("ecc.toString() >>> : " + ecc.toString());

		String a = ecc.exClass_a();
		System.out.println("a >>> : " + a);

		String b = ecc.exClass_b();
		System.out.println("b >>> : " + b);

		System.out.println("ExClass_C.main() �Լ� �� >>> : ");
	}
}
