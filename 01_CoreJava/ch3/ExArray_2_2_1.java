// package
package a.b.c.ch3;

// import


public class ExArray_2_2
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점	
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		String strArray[] = {"Java", "Android", "C", "JavaScript", "Python"};
		System.out.println("String lang : strArray >>>>>>>>>>>>> : ");
		for (String lang : strArray )
		{
			System.out.println("lang >>> : " + lang);
		}
		
		System.out.println("String a : args >>>>>>>>>>>>> : ");
		for (String a : args )
		{
			System.out.println("a >>> : " + a);
		}
		
		System.out.println("int i=0; i < args.length; i++ >>>>>>>>>>>>> : ");
		for (int i=0; i < args.length; i++ )
		{
			System.out.println("args["+i+"] >>> : " + args[i]);
		}


		/*
			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_2_2 11 22 33
			String lang : strArray >>>>>>>>>>>>> :
			lang >>> : Java
			lang >>> : Android
			lang >>> : C
			lang >>> : JavaScript
			lang >>> : Python
			String a : args >>>>>>>>>>>>> :
			a >>> : 11
			a >>> : 22
			a >>> : 33
			int i=0; i < args.length; i++ >>>>>>>>>>>>> :
			args[0] >>> : 11
			args[1] >>> : 22
			args[2] >>> : 33		
		*/
	}
}
