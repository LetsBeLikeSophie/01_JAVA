package a.b.c.ch6;

public class Ex_Invoke_2 {

	public Ex_Invoke_1() {
		System.out.println("Ex_Invoke_1() ������ >>> : ");	
	}
	
	public int aM() {
		System.out.println("aM() �Լ� ���� >>> : ");
		
		System.out.println("aM() �Լ� ");
		// aM()�Լ� ������ bM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = bM();
		System.out.println("aM() �Լ� �� >>> : ");
		
		return sum;
	}

	public int bM() {
		System.out.println("bM() �Լ� ���� >>> : ");
		
		System.out.println("bM() �Լ� ");
		// bM()�Լ� ������ cM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = cM();
		
		System.out.println("bM() �Լ� �� >>> : ");
		
		return sum;
	}

	public int cM() {
		System.out.println("cM() �Լ� ���� >>> : ");
		
		System.out.println("cM() �Լ� ");
		// cM()�Լ� ������ dM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = dM();
		System.out.println("cM() �Լ� �� >>> : ");
		
		return sum;
	}

	public int dM() {
		System.out.println("dM() �Լ� ���� >>> : ");
		
		System.out.println("dM() �Լ� ");
		
		System.out.println("dM() �Լ� �� >>> : ");
		
		return 0;
	}
	
	// main() �Լ��� ������ �ܼ� ���ø����̼��̶�� �θ���. 
	// �ܼ� ���ø����̼ǿ��� �Լ��� ��������  main() �Լ� �̴�. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Invoke_1 :: main() �Լ� ���� >>> : ");
		System.out.println("Ex_Invoke_1 :: main() �Լ� ù ���� ���� ��������Ʈ ������� ���� �ȴ�. >>> : ");
		
		// ����� ���� Ŭ���� �������� ����ϱ�
		Ex_Invoke_1 exi = new Ex_Invoke_1();
		System.out.println("exi �ּҰ� >>> : " + exi);
		
		// �����Լ� ������ �������� exi �� aM()�� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = exi.aM();
		System.out.println("main sum >>> : " + sum);
	}
}
