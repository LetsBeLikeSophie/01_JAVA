// package
package a.b.c.ch5;

// import


public class Ex_Refer
{
	// 상수 
	// 멤버변수
	// 생성자
	public Ex_Refer_1(){
		System.out.println("Ex_Refer_1() 생성자 >>> : ");
	}
	// 함수 
	public void rederMethod(TestVO tvo){
		System.out.println("Ex_Refer_1.rederMethod() 함수 진입 >>> : ");
		System.out.println("tvo >>> : " + tvo);		
	}

	public void primerMethod(int i, int i1){
		System.out.println("Ex_Refer_1.rederMethod() 함수 진입 >>> : ");
		System.out.println("i >>> : " + i);
		System.out.println("i1 >>> : " + i1);
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// 지역변수, 기초자료형
		int i = 11;
		int i1 = 22;
		
		Ex_Refer_1 ef1 = new Ex_Refer_1();
		System.out.println("ef1 >>> : " + ef1);
		ef1.primerMethod(i, i1);
		
		// 지역변수, 참조자료형
		TestVO tvo = new TestVO();
		System.out.println("tvo >>> : " + tvo);
		ef1.rederMethod(tvo);
	}
}
