// package
package a.b.c.ch5;

// import

// java.lang.String 클래스는 문자열을 다루는 클래스 이다. 
// 1. public final class String : String 클래스를 변경하지 마세요 : 상속하지 마세요 
// 2. 문자열 불변성 : immutable : 원본 문자열은 변경하지 않는다. : immutability
// 3. 보안
// 4. 스레드 안정성
public class Ex_String_1
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// s : 지역변수, 참조변수 
		String s = "abc";
		System.out.println("s >>> : " + s);
		System.out.println("s >>> : " + System.identityHashCode(s));

		String s1 = "abc";
		System.out.println("s1 >>> : " + s1);
		System.out.println("s1 >>> : " + System.identityHashCode(s1));

		String ss1 = s + s1;
		System.out.println("ss1 >>> : " + ss1);
		System.out.println("ss1 >>> : " + System.identityHashCode(ss1));

		String s2 = "abcd";
		System.out.println("s2 >>> : " + s2);
		System.out.println("s2 >>> : " + System.identityHashCode(s2));

		String s3 = "abcd";
		System.out.println("s3 >>> : " + s3);
		System.out.println("s3 >>> : " + System.identityHashCode(s3));

		String s4 = new String("abc");
		System.out.println("s4 >>> : " + s4);
		System.out.println("s4 >>> : " + System.identityHashCode(s4));

		String s5 = new String("abcd");
		System.out.println("s5 >>> : " + s5);
		System.out.println("s5 >>> : " + System.identityHashCode(s5));


		// String 문자열 더하기 
		// + 연산자를 사용해서 문자열 더할 수 있다 : 이것은 지양하라고 한다. 
		// public String concat(String str) : concat  함수 사용을 지향한다. 
		String sss = "abc";
		String sss1 = "abc";
		String sss2 = sss + sss1; // 지양
		System.out.println("sss2 >>> : " + sss2);
		String sss3 = sss.concat(sss1); // 지향 
		System.out.println("sss3 >>> : " + sss3);
		// String 문자열 더하기 할 때는 StringBuffer, StringBuilder 클래스 사용을 지향 한다.

	}
}
