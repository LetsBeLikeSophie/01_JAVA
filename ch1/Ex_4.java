package a.b.c.ch1;

public class Ex_4 {

	public static void main(String[] args) {
	
	int i = 1;

	System.out.println(i);

	// int i = 2; // 에러가 예상됨 -> int i 가 이 전에 선언됨
	// 아래 에러내용

	/**
	 *
	 * C:\00.KOSMO93\10.JExam\ch1>javac -d . Ex_4.java
	 * Ex_4.java:11: error: variable i is already defined in method main(String[])
     * int i = 2; // 에러가 예상됨
     *     ^
	 * 1 error
	 *
	 */ 
		
	 i = 2;
	 System.out.println(i);


	} // end of main method
} // end of Ex_4 class