package a.b.c.ch8;

public class Ex_Thread_5 extends Thread {
	
	int seqNum;
	
	public Ex_Thread_5 (int seqNum) {
		this.seqNum = seqNum;
	}
	
	@Override
	public void run() {
		synchronized(this) {
		System.out.println(this.seqNum + " Thread Starts");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		System.out.println(this.seqNum + " Thread Ends");
		}
	}
	
	
	public static void main(String[] args) {
		
		for (int i = 0; i <20; i++) {
			Ex_Thread_5 tx5 = new Ex_Thread_5(i);
			tx5.start();
		}
		System.out.println("¸ÞÀÎ ³¡");
	}

}
