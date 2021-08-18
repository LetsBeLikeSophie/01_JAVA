package a.b.c.ch6;

import java.util.UUID;

// �н����� ��ƿ 
public class Ex_Math_7 {

	/*
	 * �ڹ� �ߺ����� �ʴ� ���� Ű 
	 * UUID(Universally unique identifier)
	 * ���ڿ� ����(�ҹ���)���� �����Ͽ� �ӽú�й�ȣ ����
	 * 32�� ���� + '-' = 36��	   
	 */
	public static String tempPW(int len) {
		
		String u = UUID.randomUUID().toString();
		System.out.println("u >>> : " + u);
		
		u = u.replace("-","").substring(0, len);
		
		// System.out.println("u >>> : " + u);
		
		return u;
	}
	
	public static String randomPW(int len) {
		
		char c[] = {
						'1','2','3','4','5','6','7','8','9','0', 
			        	'A','B','C','D','E','F','G','H','I','J',
			        	'K','L','M','N','O','P','Q','R','S','T',
			        	'U','V','W','X','Y','Z', 
			        	'a','b','c','d','e','f','g','h','i','j',
			        	'k','l','m','n','o','p','q','r','s','t',
			        	'u','v','w','x','y','z',
			        	'!','@','#','&'
			        	//'!','@','#','$','%','^','&','*','(',')'
		        	}; 
		
		String p = "";
		
		for (int i=0; i < len; i++) {
			int a = (int)(Math.random()*(c.length));
			p += c[a];
		}
		
		return p;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = Ex_Math_7.tempPW(8);
		String s2 = Ex_Math_7.randomPW(8);
		
		System.out.println("UUID >>> : " + s1);
		System.out.println("random >>> : " + s2);
	}

}
