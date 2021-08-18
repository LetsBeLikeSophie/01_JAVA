package a.b.c.ch8;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex_Thread_3 extends JFrame implements Runnable{
	
	private static final long serialVersionUID = 1L;
	
	private static final int TIME_ZONE_0 = 0;
	private static final int TIME_ZONE_1 = 1;
	private static final int TIME_ZONE_2 = 2;
	private static final int TIME_ZONE_3 = 3;
	
//	private static final int TIME_CITY_0 = 0;
//	private static final int TIME_CITY_1 = 1;
//	private static final int TIME_CITY_2 = 2;
//	private static final int TIME_CITY_3 = 3;
	
	public static final String timeZone[] = {  "Asia/Seoul"
											  ,"America/New_York"
											  ,"Europe/Paris"
											  ,"Europe/London"};
	public static final String timeCity[] = {  "서울"
											  ,"뉴욕"
											  ,"파리"
											  ,"런던"};

	private Thread thread;
	private JLabel label;
	private String timeZoneID;
	
	public Ex_Thread_3(String timeZoneID, String timeCity) {
		
		super(timeCity + " ::: 현재시간");
		this.timeZoneID = timeZoneID;
		
		setLayout(new FlowLayout()); //중앙정렬
		label = new JLabel();
		label.setFont(new Font("Serif", Font.PLAIN, 20));
	
		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}
		add(label);
		setBounds(100,100,400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void run() {
		TimeZone timeZone = TimeZone.getTimeZone(this.timeZoneID);
		while (true) {
			Calendar calendar = Calendar.getInstance(timeZone);
			
			String now = calendar.get(Calendar.YEAR)+"년"+
						(calendar.get(Calendar.MONTH)+1)+"월"+
						calendar.get(Calendar.DATE)+"일"+
						calendar.get(Calendar.HOUR)+"시"+
						calendar.get(Calendar.MINUTE)+"분"+
						calendar.get(Calendar.SECOND)+"초";	
			
		label.setText("::: " + now);
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}	
	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("도시를 선택하세요.");
		System.out.println(	"서울: 00 \n"+
							"뉴욕: 01 \n"+
							"파리: 02 \n"+
							"런던: 03 \n");		

		String zoneID = scanner.next();
		
		if ("00".equals(zoneID)) {
			System.out.println("서울 시간을 선택 했습니다.");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_0]
					,Ex_Thread_3.timeCity[0]);
		}

		if ("01".equals(zoneID)) {
			System.out.println("뉴욕 시간을 선택 했습니다.");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_1]
					,Ex_Thread_3.timeCity[1]);
		}

		if ("02".equals(zoneID)) {
			System.out.println("서울 시간을 선택 했습니다.");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_2]
					,Ex_Thread_3.timeCity[2]);
		}

		if ("03".equals(zoneID)) {
			System.out.println("서울 시간을 선택 했습니다.");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_3]
					,Ex_Thread_3.timeCity[3]);
		}
		scanner.close();	
	}

}
