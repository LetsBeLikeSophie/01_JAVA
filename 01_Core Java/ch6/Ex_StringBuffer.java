package a.b.c.ch6;

public class Ex_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. StringBuffer �ϰ� String �� ���� �ٸ� ��ü �̴�. 
//		2. ��ȣ���� �����͸� ����� ���� ����ȯ�� �ؾ� �Ѵ�. 
//		3. StringBuffer �Һ����� ������ ���� �ʴ´�. 
		
		StringBuffer sb = new StringBuffer("java");
		System.out.println("sb >>> : " + sb);
		System.out.println("sb >>> : " + System.identityHashCode(sb));

		sb.append(" and");
		sb.append(" android");
		sb.append(" programming is fun!!!");
		System.out.println("sb >>> : " + sb);
		System.out.println("sb >>> : " + System.identityHashCode(sb));

		String str = sb.toString();
		System.out.println("str >>> : " + str);
		System.out.println("str >>> : " + System.identityHashCode(str));

		String str1 = str + "\n��Ʈ��Ŭ���� �Һ��� �����ϱ� ��";
		System.out.println("str1 >>> : " + str1);
		System.out.println("str1 >>> : " + System.identityHashCode(str1));
	}

}
