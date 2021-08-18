package a.b.c.ch8;

public class Ex_Thread_0 extends Thread{
	public void run() {
		System.out.println("run()");
		System.out.println("Thread 클래스에 있는 start() 를 시작하면");
		System.out.println("바로 run() 함수를 호출.");
		System.out.println("run()");
		
		
	}

	public static void main(String[] args) {
		new Ex_Thread().start();


	}

}
