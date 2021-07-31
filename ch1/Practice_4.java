package a.b.c.ch1;



public class Practice_4 {

	public String a(){
	return "Practice_4에 String a 함수";
	}

	public void b(){
	System.out.println("Practice_4에 String b 함수");
	}








	public static void main(String[] args) {

	Practice_4 prc4 = new Practice_4();
	String str = prc4.a();

	prc4.b();

//	prc4.a();


	System.out.println(prc4.a());
//	System.out.println(prc.b);



	} // end of main


} // end of Practice_4