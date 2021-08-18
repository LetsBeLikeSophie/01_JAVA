// package
package a.b.c.ch3;

// import


public class ExOper_2 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// 관계 연산자는 연산의 결과를 논리 값(true, false)으로 반환 한다. 
		System.out.println( 3 < 5 );
		System.out.println( 3 > 5 );
		System.out.println( 3 <= 5 );
		System.out.println( 3 >= 5 );
		System.out.println( 3 == 5 ); // == : 상등연산자 : 같은지 비교하는 연산자, 
		System.out.println( 3 != 5);

		boolean bool = false;
		
		bool = 3 < 5;
		System.out.println("3 < 5 = " + bool);
		bool = 3 > 5;
		System.out.println("3 > 5 = " + bool);
		bool = 3 <= 5;
		System.out.println("3 <= 5 = " + bool);
		bool = 3 >= 5;
		System.out.println("3 >= 5 = " + bool);
		bool = 3 == 5;
		System.out.println("3 == 5 = " + bool);
		bool = 3 != 5;
		System.out.println("3 != 5 = " + bool);

		bool = 'a' < 'b';
		System.out.println(bool);
		bool = 'A' < 'B';
		System.out.println(bool);
		bool = 'A' < 40;
		System.out.println(bool);
		bool = 'A' < 0x65;
		System.out.println(bool);
		
		bool = 'a' < '가';
		System.out.println(bool);

		bool = '가' < '나';
		System.out.println(bool);

		
		//bool = '가나' < '나라';
		//System.out.println(bool);
		
		//bool = "가" < "나";
		//System.out.println(bool);
		
	}
}
