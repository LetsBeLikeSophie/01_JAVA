package a.b.c.ch8;

public class Ex_Thread_0 extends Thread{
	public void run() {
		System.out.println("run()");
		System.out.println("Thread Ŭ������ �ִ� start() �� �����ϸ�");
		System.out.println("�ٷ� run() �Լ��� ȣ��.");
		System.out.println("run()");
		
		
	}

	public static void main(String[] args) {
		new Ex_Thread().start();


	}

}
