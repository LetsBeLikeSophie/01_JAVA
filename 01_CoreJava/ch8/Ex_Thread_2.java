package a.b.c.ch8;

public class Ex_Thread_2 extends Thread {
	
	public static void methodA() {
		
		System.out.println("methodA ���� (1��)");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
		}
	}
	
	public void run() {
		
		System.out.println("run() �Լ� ���� (3��)");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {			
		}

		methodA();
	}

	public static void main(String[] args) {
		
		new Ex_Thread_2().start();

	}
}
