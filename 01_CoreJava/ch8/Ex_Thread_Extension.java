package a.b.c.ch8;

public class Ex_Thread_Extension extends Thread{

	@Override
	public void run() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
	}
	
	public static void main(String[] args) {
	
		new Ex_Thread_Extension().start();
		
		Ex_Thread_Extension ex = new Ex_Thread_Extension();
		Thread thread = new Thread(ex);
		
		// 출력이 다르게 됨 아마 동시처리해서 그런가........하...
		// 중간에 sleep? 넣으면 될듯한데 thread 공부해야할듯
		// thread 내부 값도 모르겠음 >> [Thread-2,5,main]
		// start 에서 runnable 갔다가 running 해서 그런듯
		// 나중에 계속 생각해볼것
		
		System.out.println("Thread: " + thread);
		System.out.println("getId(): " + thread.getId());
		System.out.println("getName(): " + thread.getName());
		System.out.println("getPriority(): " + thread.getPriority());
		thread.start();
	}
}
