package a.b.c.ch5;

public class Ex_String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� <-> ���� 
		String s0 = 1 + ""; // ������ : 
		System.out.println("s0 >>> : " + s0);
		String s1 = String.valueOf(1);
		System.out.println("s1 >>> : " + s1);
		String s2 = Integer.toString(1);
		System.out.println("s2 >>> : " + s2);
		
		// ���ڼ��� �� ���ڷ� �ٲٴ� �Լ� 
		int i0 = Integer.parseInt("1");
		System.out.println("i0 >>> : " + i0);
				
		String sval[] = {"010", "1111", "2222"};
		
		int sval0 = Integer.parseInt(sval[0]);
		
		System.out.println("sval0 >>> : " + sval0);
		
		int sval1 = Integer.parseInt(sval[1]);
		System.out.println("sval1 >>> : " + sval1);
		int sval2 = Integer.parseInt(sval[2]);
		System.out.println("sval2 >>> : " + sval2);
		
		for (int i=0; i < sval.length; i++) {
			int iv = Integer.parseInt(sval[i]);
			System.out.println("iv >>> : " + iv);
		}
	}

}
