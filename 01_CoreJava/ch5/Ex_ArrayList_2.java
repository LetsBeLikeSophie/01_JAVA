package a.b.c.ch5;

import java.util.ArrayList;

import a.b.c.TestVO;

public class Ex_ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList aList  = new ArrayList();
		
		for (int i=0; i < 3; i++) {
			
			TestVO tvo = new TestVO();
			
			tvo.setMnum("00" + i);
			tvo.setMid("aa " + i);
			tvo.setMpw("aa00 " + i);
			tvo.setMhp("010 " + i);
			tvo.setMjuso("�ּ� " + i);
			
			aList.add(tvo);
			
			System.out.println(aList);
			
		}
		System.out.println(aList.size());
		for (int i=0; i < aList.size(); i++) {
			
			System.out.println(i + " >>> : " + aList.get(i));
			
			TestVO tvo = (TestVO)aList.get(i);
			
			System.out.print(" " + tvo.getMnum());
			System.out.print(" " + tvo.getMid());
			System.out.print(" " + tvo.getMpw());
			System.out.print(" " + tvo.getMhp());
			System.out.println(" " + tvo.getMjuso());
		}
		
		// ���ʸ� : Generic : ������ Ÿ���� ���� �Ѵ�(�Ѱ����� ����ؾ� �Ѵ�.)
		System.out.println("\n���ʸ����� �غ��� ##################\n");
		
		ArrayList<TestVO> aList1  = new ArrayList<TestVO>();
		
		for (int i=0; i < 3; i++) {
			
			TestVO tvo1 = new TestVO();
			
			tvo1.setMnum("00" + i);
			tvo1.setMid("aa " + i);
			tvo1.setMpw("aa00 " + i);
			tvo1.setMhp("010 " + i);
			tvo1.setMjuso("�ּ� " + i);
			
			aList1.add(tvo1);
			
			System.out.println(aList1);
			
		}
		System.out.println(aList1.size());
		for (int i=0; i < aList1.size(); i++) {
			
			System.out.println(i + " >>> : " + aList1.get(i));
			
			TestVO tvo1 = (TestVO)aList1.get(i);
			
			System.out.print(" " + tvo1.getMnum());
			System.out.print(" " + tvo1.getMid());
			System.out.print(" " + tvo1.getMpw());
			System.out.print(" " + tvo1.getMhp());
			System.out.println(" " + tvo1.getMjuso());
		}

	}

}
