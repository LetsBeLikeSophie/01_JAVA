package a.b.c.ch5;

public class Ex_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ڹٴ� ���ڿ��� int �� �ȴ�. int �� �ƴ� ���� double
		// byte char short int long float double : �����ڷ��� : ��ü�� �ƴϴ�. 
		// ���� �ڷ����� �����ϴ� Wrapper Class �� �ִ�. 
		// Wraper Class ����� �����Ѵ�. 
		
		Integer i0 = new Integer(100);
		Integer i1 = new Integer("100");
		System.out.println("i0 >>> : " + i0);
		System.out.println("i1 >>> : " + i1);	
		
		// Integer �� int ������ ��ȯ �� �� 
		int i0Val = i0.intValue();
		int i1Val = i1.intValue();
		System.out.println("i0Val >>> : " + i0Val);
		System.out.println("i1Val >>> : " + i1Val);		
		
		// ���ڼ��� Integer ���� int �� ���ڷ� ��ȯ �� ��  "12234" : ���ڷε� ���ڿ� "1", "12"
		int i2 = Integer.parseInt("100");
		System.out.println("i2 >>> : " + i2);	
		
		int i3 = 100;
		System.out.println("i3 >>> : " + i3);		
	}

}
