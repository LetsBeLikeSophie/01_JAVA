package a.b.c.ch5;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.TestVO;

public class Ex_ArrayList_4 {

	public ArrayList<TestVO> memSelect() {
		
		ArrayList<TestVO> aList  = new ArrayList<TestVO>();		
		
		for (int i=0; i < 3; i++) {			
		
			TestVO tvo = new TestVO();			
			
			tvo.setMnum("00_" + i);
			tvo.setMid("aa_" + i);
			tvo.setMpw("aa00_" + i);
			tvo.setMhp("010_" + i);
			tvo.setMjuso("�ּ�_" + i);			
			
			aList.add(tvo);		
			
			System.out.println(aList);
		}
		
		return aList;
	}
		
	public ArrayList<TestVO> memSelect(TestVO tvo) {
		
		// �ǵ������� �����͸� �����ϱ� 
		ArrayList<TestVO> aList  = new ArrayList<TestVO>();	
		for (int i=0; i < 3; i++) {					
			TestVO tt = new TestVO();						
			tt.setMnum("00_" + i);
			tt.setMid("aa_" + i);
			tt.setMpw("aa00_" + i);
			tt.setMhp("010_" + i);
			tt.setMjuso("�ּ�_" + i);						
			aList.add(tt);					
			System.out.println(aList);
		}
		
		ArrayList<TestVO> aList_1  = new ArrayList<TestVO>();			
		
		if ("00_1".equals(tvo.getMnum())) {
		
			TestVO _tvo = new TestVO();									
			_tvo.setMnum(aList.get(0).getMnum());
			_tvo.setMid(aList.get(0).getMid());
			_tvo.setMpw(aList.get(0).getMpw());
			_tvo.setMhp(aList.get(0).getMhp());
			_tvo.setMjuso(aList.get(0).getMjuso());						
			
			aList_1.add(_tvo);							
		}
				
		return aList_1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("��ȸ Ű���带 �Է� �Ͻÿ� : ������ȸ  S, ��ü��ȸ SALL");
		Scanner sc = new Scanner(System.in);
		String isud = sc.next();
		isud = isud.toUpperCase();
		
		if ("S".equals(isud)) {
			System.out.println("isud >>> : " + isud);
			
			Ex_ArrayList_3 ex3 = new Ex_ArrayList_3();		
			
			// ���������� ��ü �Ǵ� �����ڷ����� �� default ������ �ʱ�ȭ �ؼ� ����� �ؾ� �Ѵ�. 
			TestVO tvo = null;
			tvo = new TestVO();
			tvo.setMnum("00_1");
			
			ArrayList<TestVO> aList = ex3.memSelect(tvo);			
			System.out.println("aList.size() >>> : " + aList.size());
			System.out.println("aList >>> : " + aList);
			
			if (aList.size()> 0) {			
				
				for (int i=0; i < aList.size(); i++) {					
										
					TestVO _tvo = aList.get(i);					
					
					System.out.print(_tvo.getMnum());
					System.out.print(" " + _tvo.getMid());
					System.out.print(" " + _tvo.getMpw());
					System.out.print(" " + _tvo.getMhp());
					System.out.println(" " + _tvo.getMjuso());
				}
			}
		}
		if ("SALL".equals(isud)) {
			System.out.println("isud >>> : " + isud);
			
			Ex_ArrayList_3 ex3 = new Ex_ArrayList_3();		
			
			ArrayList<TestVO> aList = ex3.memSelect();
			
			System.out.println("aList.size() >>> : " + aList.size());
			System.out.println("aList >>> : " + aList);
			
			if (aList.size()> 0) {			
				
				for (int i=0; i < aList.size(); i++) {					
										
					TestVO tvo = aList.get(i);					
					
					System.out.print(tvo.getMnum());
					System.out.print(" " + tvo.getMid());
					System.out.print(" " + tvo.getMpw());
					System.out.print(" " + tvo.getMhp());
					System.out.println(" " + tvo.getMjuso());
				}
			}
		}		
	}
}
