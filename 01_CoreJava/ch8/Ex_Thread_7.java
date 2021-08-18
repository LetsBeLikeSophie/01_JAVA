package a.b.c.ch8;

public class Ex_Thread_7 {

	public static void main(String args[]) {

		Runnable r = new SyncTest_1();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
	}
}

class BankAccount_1 {

	int balance = 1000;
	// int balance = 1000000;
	
	/*
		synchronized Ű���� :  ����ȭ�� ��ü�� ���� ����ȭ�� �̷�� ��
		                                         ���� ��ü�� ���� ��� ����ȭ ���� �� ������ 
							 ���� �� �����常�� �� ������ ����(����) �ϵ��� �Ѵ�. 
							 ���� ������ �õ��ϴ� �ٸ� ��������� 
							 �� ���� �����尡 ������ ��ġ�� ���� ��� ������
							 ���(blocked) ���°� �ȴ�. 

		�����
		1. synchronized void �Լ�()
		2. static synchronized void �Լ�() 
		3. synchronized(this){}
		4. static synchronized(this){}
	*/
	public synchronized void withdraw(int money){
		System.out.println("synchronized void withdraw(int money) �Լ� ���� >>> : ");
		if(balance >= money) {
			try { Thread.sleep(1000);} catch(Exception e) {}
			balance -= money;
		}
	} // withdraw
}
class SyncTest_1 implements Runnable {
	BankAccount_1 ac1 = new BankAccount_1();
	
	public void run() {
		System.out.println("run() �Լ� ���� >>> : ");
	
		synchronized(this){
			System.out.println("synchronized(this) �� ���� >>> : ");
		
			while(ac1.balance > 0) {
				System.out.println("while(ac1.balance > 0) �� ���� >>> : ");
			
				// 100, 200, 300���� �� ���� ������ �����ؼ� ���(withdraw)
				int money = (int)(Math.random() * 3 + 1) * 100;
				ac1.withdraw(money);
				
				System.out.println("balance >>> : " + ac1.balance
					               + " : ��ݽð� >>> : " 
					               + CurrentTime_1.cTime());
			}
		}
	} 
}

// a.b.c.common.DataUtil.cTime() ���� �̵��ϱ� 
abstract class CurrentTime_1 
{
	public static String cTime(){
		
		long time = System.currentTimeMillis();		
		java.text.SimpleDateFormat sdf = 
			new java.text.SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		String cTime = sdf.format(new java.util.Date(time));

		return cTime;
	}
}




