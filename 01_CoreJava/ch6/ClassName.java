package a.b.c.ch6;


public class ClassName {

	public void aM() {
		System.out.println("ClassName.aM() 함수 ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassName cn = new ClassName();
		System.out.println("cn 참조변수 >>> : " + cn);
		System.out.println("cn.getClass() >>> : " + cn.getClass());
		System.out.println("cn.getClass().getName() >>> : " + cn.getClass().getName());
		
		try {
			Class cc = Class.forName("a.b.c.ch6.ClassName");
			System.out.println("cc >>> : " + cc);
			ClassName cc1 = (ClassName)cc.newInstance();
			System.out.println("cc1 >>> : " + cc1);
			cc1.aM();
			
			Class aList = Class.forName("java.util.ArrayList");
			java.util.ArrayList aList1 = (java.util.ArrayList)aList.newInstance();
			System.out.println("aList1 >>> : " + aList1);
			
			Class d = Class.forName("java.util.Date");
			java.util.Date dd = (java.util.Date)d.newInstance();
			System.out.println("dd >>> : " + dd);
			
		}catch(Exception c) {
			System.out.println("c 에러가 >>>  :" + c);
		}
		
	}

}
