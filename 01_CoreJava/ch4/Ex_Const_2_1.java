// package
package a.b.c.ch4;

// import

/*
�ֿܼ��� �ܺε����� �Է� �޴� ���
java.util.Scanner sc = new java.util.Scanner(System.in);
����� �μ� 
main(String args[]){}
String args[] = {"aa", "bb", "cc", "dd"};
args[0] = "aa";
args[1] = "bb";
args[2] = "cc";
args[3] = "dd";
*/

public class  Ex_Const_2_1
{
	// ��� 
	// �������
	String name;
	String id;
	String pw;
	String juso;

	// ������
	// �����ڸ� �̿��ؼ� �ܺο��� �Էµ� �����͸� ��������� �ʱ�ȭ �ϴ� ��� 
	public Ex_Const_2(String name, String id, String pw, String juso){
		System.out.println("Ex_Const_2() ������ >>> : ");
		System.out.println("name >>> : " + name);
		System.out.println("id >>> : " + id);
		System.out.println("pw >>> : " + pw);
		System.out.println("juso >>> : " + juso);

		// ���� �Լ��� �ִ� �������� �����͸�
		// �����ڸ� ���ؼ� ���� �Լ� ������ ������ ���ͼ� 
		// ��������� ���� ������ �Ѵ�. 
		// ��������� �ִ� �����͸� ������ �ٸ� Ŭ�������� ����Ѵ�. 
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.juso = juso;		
	}

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// ��������, �������� 
		String name = args[0];
		String id = args[1];
		String pw = args[2];
		String juso = args[3];

		Ex_Const_2 ec2 = new Ex_Const_2(name, id, pw, juso);
		System.out.println("ec2 >>> : " + ec2);
		System.out.println("ec2.name >>> : " + ec2.name);
		System.out.println("ec2.id >>> : " + ec2.id);
		System.out.println("ec2.pw >>> : " + ec2.pw);
		System.out.println("ec2.juso >>> : " + ec2.juso);
	}
}


/*
C:\00.KOSMO93\10.JExam\ch4>java a.b.c.ch4.Ex_Const_2 ���翵 ojy ojy00 "�����ν� ȣ��2��"
Ex_Const_2() ������ >>> :
name >>> : ���翵
id >>> : ojy
pw >>> : ojy00
juso >>> : �����ν� ȣ��2��
ec2 >>> : a.b.c.ch4.Ex_Const_2@15db9742
*/