package a.b.c.ch5;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex_Calendar_2 {

	public static void timeZone() {
		
		String cityID[] = TimeZone.getAvailableIDs();
		System.out.println("������ ���� �� >>> : " + cityID.length);
		
		for (int i=0; i < cityID.length; i++) {
			System.out.println("cityID["+i+"] >>> : " + cityID[i]);			
		}
	}
	
	public static String cityTime(Calendar cd) {
		
		String time = 	"����ð� : "
				 		+ cd.get(Calendar.YEAR) + "�� "
				 		+ (cd.get(Calendar.MONTH) + 1) + "�� "
				 		+ cd.get(Calendar.DATE) + "�� "
				 		+ cd.get(Calendar.HOUR_OF_DAY) + "�� "
				 		+ cd.get(Calendar.MINUTE) + "�� "
				 		+ cd.get(Calendar.SECOND) + "��";
		
		return time;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �� ���� ���ø� �������� 
		Ex_Calendar_1.timeZone();
		
		String strID[] = {  "Asia/Seoul"
				           ,"America/New_York"
				           ,"Europe/Paris"
				           ,"Europe/London"
				           ,"Australia/Sydney"};
		String strName[] = {"����", "����", "�ĸ�", "����", "�õ��"};
		
		// ���ýð� �������� 
		for (int i=0; i < strID.length; i++) {
			
			TimeZone tz = TimeZone.getTimeZone(strID[i]);
			
			Calendar cd = Calendar.getInstance(tz);
			
			String t = Ex_Calendar_1.cityTime(cd);
			
			System.out.println(strName[i] + " " + t);
		}		
	}
}