package a.b.c.ch1;

public class ������ {

	// ��� ���� 
	public String name;
	public String role;

	// ������ 
	public ������(String role){
		this.role = role;
	}
	// main �Լ� : �ܼ� ���ø����̼��� ������ 
	public static void main(String args[]){

		������ �Ŷ� = new ������("������ Ī���ϴ� ��Ʈ");
		System.out.println("�Ŷ� >>> : " + �Ŷ�);
		System.out.println("�Ŷ�.role >>> : " + �Ŷ�.role);
		������ ���� = new ������("�ڹ� õõ�� ����Ű��");
		System.out.println("���� >>> : " + ����);
		System.out.println("����.role >>> : " + ����.role);
		������ ģ�� = new ������("�볪�� ��ƾ���");
		System.out.println("ģ�� >>> : " + ģ��);
		System.out.println("ģ��.role >>> : " + ģ��.role);
	
	} // end of main �Լ� 
} // end of Ex_5 Ŭ���� 