package a.b.c.common;

public abstract class CodeUtil {
	
	// ��� 
	static final String hVal[] = {"����", "���ǰ���", "�", "����", "��ȭ", "���"};
	// ���� 
	static final String jVal[] = {"ȸ���", "�ڿ���", "�л�", "�ֺ�", "����", "����"};
	
	// ������� 
	public static String birth(String s) {

		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if (s !=null && s.length() > 0){			
			int sLen = s.length();			
			if (8 == sLen) {
				s0 = s.substring(0, 4);
				s1 = s.substring(4, 6);
				s2 = s.substring(6);				
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}		
		return ss;
	}
	
	// ����
	public static String gender(String s) {
		
		String g = "";	
		
		if (s !=null && s.length() > 0){			
			if ("01".equals(s)) {
				g = "����";
			}else if ("02".equals(s)){
				g = "����";
			}			
		}			
		return g;
		
		/*
		String g = "";		
		if ("01".equals(s)) {
			g = "����";
		}
		if ("02".equals(s)) {
			g = "����";
		}				
		return g;
		*/
		
		/*
		if ("01".equals(s)) {
			return "����";
		}else {
			return "����";
		}
		*/
		
		// return "01".equals(s) ? "����" : "����";
	}
	
	// ��ȭ��ȣ 
	public static String tel(String s) {

		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if (s !=null && s.length() > 0){			
			int sLen = s.length();			
			if (10 == sLen) {
				s0 = s.substring(0, 2);
				s1 = s.substring(2, 6);
				s2 = s.substring(6);
				ss = s0 + "-" + s1 + "-" + s2;
			}		
			if (11 == sLen) {
				s0 = s.substring(0, 3);
				s1 = s.substring(3, 7);
				s2 = s.substring(7);
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}
		return ss;
	}
	
	// ��ȭ��ȣ 
	public static String hp(String s) {

		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if (s !=null && s.length() > 0){			
			int sLen = s.length();			
			if (11 == sLen) {
				s0 = s.substring(0, 3);
				s1 = s.substring(3, 7);
				s2 = s.substring(7);
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}		
		return ss;
	}

	// ���
	public static String hobby(String s) {
		
		String h = "";				
		if (s !=null && s.length() > 0){							
			for (int i=1; i < hVal.length; i++) {	
				if (("0" + i).equals(s)) {
					h = CodeUtil.hVal[i-1];
				}
			}			
		}		
		return h;
	}
	
	// ����
	public static String job(String s) {
		
		String j = "";		
		if (s !=null && s.length() > 0){			
			for (int i=1; i < jVal.length; i++) {				
				if (("0" + i).equals(s)) {
					j = CodeUtil.jVal[i-1];
				}
			}		
		}		
		return j;
	}
	
	// 0001 �ڸ��� ä��� �Լ�,  commNO �� �� ���� 0 ���� ä��� 
	public static String numPad(String s) {
		
		int sLen = s.length();		
		for (int i=sLen; i < 4; i++) {
			s = "0" + s;
		}		
		return s;
	}
	
	public static void main(String args[]) {
		
		// �������
		String b = CodeUtil.birth("20210801");		
		System.out.println("b >>> : " + b);
		
		// ��ȭ��ȣ
		String t = CodeUtil.tel("03212341234");		
		System.out.println("t >>> : " + t);
		
		// �ڵ���
		String hp = CodeUtil.tel("01012341234");		
		System.out.println("hp >>> : " + hp);		
		
		// ����
		String g = CodeUtil.gender("02");
		System.out.println("g >>> : " + g);
		// ���
		String h = CodeUtil.hobby("02");
		System.out.println("h >>> : " + h);
		// ����
		String j = CodeUtil.job("02");
		System.out.println("j >>> : " + j);
	}
}
