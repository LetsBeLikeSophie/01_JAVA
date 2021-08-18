package a.b.c.ch8;

public class Ex_Thread_1 implements Runnable{
		
		@Override
		public void run () {
			System.out.println("Runnable 인터페이스에서 오버라이딩");
			
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_Thread_1 ex1 = new Ex_Thread_1();
		Thread thread_1 = new Thread(ex1);
		Thread thread_2 = new Thread(new Ex_Thread_1());
		
		
		System.out.println("==========Thread_1==========");
		System.out.println("thread: " + thread_1);
		System.out.println("getId(): " + thread_1.getId());
		System.out.println("getPriority " + thread_1.getPriority());
		System.out.println();

		System.out.println("==========Thread_2==========");
		System.out.println("thread: " + thread_2);
		System.out.println("getId(): " + thread_2.getId());
		System.out.println("getPriority " + thread_2.getPriority());
		

	}

}
