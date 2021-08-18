package a.b.c.ch1;

public class 최솔잎 {

	//public String name;
	public String role;

	public 최솔잎(String role){
		this.role = role;
	}

	public static void main (String args[]){

	최솔잎 학생 = new 최솔잎 ("천천히 자바공부함!");
	System.out.println("학생 >>> : " + 학생);
	System.out.println("학생.role >>> : " + 학생.role);

	최솔잎 튜터 = new 최솔잎 ("열심히 같이스터디!");
	System.out.println("튜터 >>> : " + 튜터);
	System.out.println("튜터.role >>> : " + 튜터.role);

	최솔잎 연인 = new 최솔잎 ("희천이 내가이름한번 올려줌");
	System.out.println("연인 >>> : " + 연인);
	System.out.println("연인.role >>> " + 연인.role);

	} // end of main method
} // end of 최솔잎 class