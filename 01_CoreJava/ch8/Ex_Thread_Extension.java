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
		
		// ����� �ٸ��� �� �Ƹ� ����ó���ؼ� �׷���........��...
		// �߰��� sleep? ������ �ɵ��ѵ� thread �����ؾ��ҵ�
		// thread ���� ���� �𸣰��� >> [Thread-2,5,main]
		// start ���� runnable ���ٰ� running �ؼ� �׷���
		// ���߿� ��� �����غ���
		
		System.out.println("Thread: " + thread);
		System.out.println("getId(): " + thread.getId());
		System.out.println("getName(): " + thread.getName());
		System.out.println("getPriority(): " + thread.getPriority());
		thread.start();
	}
}
