package a.b.c.ch5;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex_HashMap_1 {

	public ArrayList hashMap() {
	
		HashMap hm0 = new HashMap();
		hm0.put("�̸�", "��ٴ�");
		hm0.put("����", "29");
		hm0.put("�ּ�", "����� ���ϵ�");
	
		HashMap hm1 = new HashMap();
		hm1.put("�̸�", "������");
		hm1.put("����", "33");
		hm1.put("�ּ�", "���Ǳ� �Ÿ���");
		
		HashMap hm2 = new HashMap();
		hm2.put("�̸�", "������");
		hm2.put("����", "29");
		hm2.put("�ּ�", "��õ�� �ſ���");
		
		ArrayList aList = new ArrayList();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);	
		
		return aList;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex_HashMap_1 ex1 = new Ex_HashMap_1();
		ArrayList aList = ex1.hashMap();
		System.out.println("aList.size() >>> : " + aList.size());
		
		for (int i=0; i < aList.size(); i++) {
			
			HashMap hm = (HashMap)aList.get(i);			
			Object obj1 = hm.get("�̸�");
			String name1 = (String)obj1;
			System.out.println("�̸� >>> : " + name1);
		}
	}
}
