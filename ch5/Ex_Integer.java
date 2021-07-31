package a.b.c.ch5;

public class Ex_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자바는 숫자에서 int 만 안다. int 가 아닌 것이 double
		// byte char short int long float double : 기초자료형 : 객체가 아니다. 
		// 기초 자료형에 대응하는 Wrapper Class 가 있다. 
		// Wraper Class 상수로 존재한다. 
		
		Integer i0 = new Integer(100);
		Integer i1 = new Integer("100");
		System.out.println("i0 >>> : " + i0);
		System.out.println("i1 >>> : " + i1);	
		
		// Integer 를 int 형으로 변환 한 것 
		int i0Val = i0.intValue();
		int i1Val = i1.intValue();
		System.out.println("i0Val >>> : " + i0Val);
		System.out.println("i1Val >>> : " + i1Val);		
		
		// 문자숫자 Integer 형을 int 형 숫자로 변환 한 것  "12234" : 숫자로된 문자열 "1", "12"
		int i2 = Integer.parseInt("100");
		System.out.println("i2 >>> : " + i2);	
		
		int i3 = 100;
		System.out.println("i3 >>> : " + i3);		
	}

}
