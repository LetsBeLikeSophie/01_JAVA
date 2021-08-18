// package
package a.b.c.ch5;

// import
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.HashMap;


// �������� ����

/*
��������� Ex_Reference Ŭ������ �ڿ� = ���� 3�� + �Լ� 1��
���� 3��, 
	��� CONST_VAL 
	������� s
	������� i
�Լ� 1�� 
	Ex_Reference() ������ 

�� �ڿ��� ����Ϸ��� 
Ex_Reference exr = new Ex_Reference();
�������� exr �� ������ s, i 
*/
public class Ex_Reference
{
	// ���
	public static final String CONST_VAL = "���ڻ��";
	// �������
	String s;
	int i;
	// ������
	public Ex_Reference(){
		System.out.println("Ex_Reference() ������");
	}

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		/*
			1. ���������� �ּҰ��� �����Ѵ�.
			2. �ּҰ��� ����Ű�� �����ʹ� ������ �̴�. 
			3. ��Ʈ�� Ŭ�������� ���ڿ�, ����, ����, ��¥, �����͸� ����ϴ� Ŭ��������
			   ���������� �ּҰ� ��� ���� ��Ÿ����.
			   ������ ������ �����ϰ� �ϱ����ؼ��̴�.
		*/
		// ����� ���� Ŭ������ new �����ڸ� �̿��ؼ� ���������� ����ϴ� ��� 
		Ex_Reference exr = new Ex_Reference();
		System.out.println("\n�������� �ּҰ� :: exr >>> : " + exr);
		System.out.println("exr >>> : " + System.identityHashCode(exr));
		System.out.println("�������� �ּҰ� :: exr.s >>> : " + exr.s);
		System.out.println("�������� �ּҰ� :: exr.i >>> : " + exr.i);

		TestVO tvo = new TestVO();
		System.out.println("\n�������� �ּҰ� :: tvo >>> : " + tvo);
		System.out.println("tvo >>> : " + System.identityHashCode(tvo));

		// rt.jar : built-in class : labrary : reference ����ϱ� 
		
		// ���ڿ�
		String s = "abc";
		System.out.println("\n�������� �ּҰ� :: s >>> : " + s);
		System.out.println("s >>> : " + System.identityHashCode(s));

		String s1 = new String("abc");
		System.out.println("\n�������� �ּҰ� :: s1 >>> : " + s1);
		System.out.println("s1 >>> : " + System.identityHashCode(s1));

		// ����
		Integer i = new Integer(10);
		System.out.println("\n�������� �ּҰ� :: i >>> : " + i);
		System.out.println("i >>> : " + System.identityHashCode(i));
		
		// ����
		Date d = new Date();
		System.out.println("\n�������� �ּҰ� :: d >>> : " + d);
		System.out.println("d >>> : " + System.identityHashCode(d));

		Calendar c = Calendar.getInstance();
		System.out.println("\n�������� �ּҰ� :: c >>> : " + c);
		System.out.println("c >>> : " + System.identityHashCode(c));

		// ������ 
		int ii[] = new int[3];
		System.out.println("\n�������� �ּҰ� :: ii >>> : " + ii);
		System.out.println("ii >>> : " + System.identityHashCode(ii));

		ArrayList aList = new ArrayList();
		System.out.println("\n�������� �ּҰ� :: aList >>> : " + aList);
		System.out.println("aList >>> : " + System.identityHashCode(aList));

		HashMap hp = new HashMap();
		System.out.println("\n�������� �ּҰ� :: hp >>> : " + hp);
		System.out.println("hp >>> : " + System.identityHashCode(hp));
		
	}
}

/*
��������� TestVO Ŭ���� �ڿ� = ���� 2�� + �Լ� 5��;
���� 2�� 
	������� sval
	������� ival
�Լ� 5�� 
	setSval(String sval)
	setIval(String ival)
	getSval()
	getIval()
	TestVO() ������
*/
class TestVO
{
	private String sval;
	private String ival;

	public TestVO(){
		
	}

	public void setSval(String sval){
		this.sval = sval;
	}
	public void setIval(String ival){
		this.ival = ival;
	}

	public String getSval(){
		return this.sval; 
	}
	public String getIval(){
		return this.ival; 
	}

}