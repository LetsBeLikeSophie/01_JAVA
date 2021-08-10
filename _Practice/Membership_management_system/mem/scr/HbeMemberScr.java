package a.b.c.mem.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.mem.vo.HbeMemberVO;
import a.b.c.ch9.hbemem.HbeMember;
import a.b.c.mem.service.HbeMemberService;
import a.b.c.mem.service.HbeMemberServiceImpl;

public class HbeMemberScr {
	
	// ȸ������ ��ü ��ȸ
	public static void hmemSelectAll() {
		System.out.println("ȸ������ ��ü��ȸ >>> : ");
		
		HbeMemberService hs = new HbeMemberServiceImpl();
		
		ArrayList<HbeMemberVO> aList = hs.hmemSelectAll();

		if (aList !=null && aList.size() > 0) {
			for (int i=0; i < aList.size(); i++) {
				
				HbeMemberVO hvo = aList.get(i);
				HbeMemberVO.printHbeMemberVO(hvo);
			}		
		}else {
			System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
		}
		
	}
	
	// ȸ������ �˻� : ������ȸ 
	public static void hmemSelect(String hnum) {
		System.out.println("ȸ������ ������ȸ >>> : ");
		
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHnum(hnum);
		
		HbeMemberService hs = new HbeMemberServiceImpl();
		
		ArrayList<HbeMemberVO> aList = hs.hmemSelect(hvo);

		if (aList !=null && aList.size() > 0) {
			for (int i=0; i < aList.size(); i++) {
				
				HbeMemberVO _hvo = aList.get(i);
				HbeMemberVO.printHbeMemberVO(_hvo);
			}		
		}else {
			System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
		}	
		
	}
	
	// ȸ������ ��� : ȸ����ȣ�� ä������ ��� 
	public static void hmemInsert() {		
		System.out.println("ȸ������ ��� >>> : ");	
		
		String hnum = "202108060008";
		String hname = "HHHH";
		String hid = "HH00";
		String hpw = "HH1234"; 
		String hbirth = "20210801";
		String hgender = "01";
		String htel = "03212341234";
		String hhp = "01012341234"; 
		String hemail = "GG00@naver.com";
		String haddr = "���� ��õ�� ���굿 88"; 
		String hhobby = "01";
		String hphoto = "abc07.jpg";
		String hskill = "Ư��8";
		String hjob = "01";
	
		HbeMemberService hs = new HbeMemberServiceImpl();
		
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHnum(hnum);
		hvo.setHname(hname);
		hvo.setHid(hid);
		hvo.setHpw(hpw);
		hvo.setHbirth(hbirth);
		hvo.setHgender(hgender);
		hvo.setHtel(htel);
		hvo.setHhp(hhp);
		hvo.setHemail(hemail);
		hvo.setHaddr(haddr);
		hvo.setHhobby(hhobby);				
		hvo.setHphoto(hphoto);
		hvo.setHskill(hskill);
		hvo.setHjob(hjob);
		
		boolean bool = hs.hmemInsert(hvo);

		if (bool) {
			System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);	
					
		}else {
			System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);
		}			
	}
	
	// ȸ������ ����
	public static void hmemUpdate() {		
		System.out.println("ȸ������ ���� >>> : ");
		
		String hnum = "202108060008";				
		String hemail = "HH00@naver.com";
		String haddr = "���� ��õ�� ���굿 8822"; 
		String hhobby = "04";				
		String hjob = "02";
	
		HbeMemberService hs = new HbeMemberServiceImpl();
		
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHnum(hnum);			
		hvo.setHemail(hemail);
		hvo.setHaddr(haddr);
		hvo.setHhobby(hhobby);								
		hvo.setHjob(hjob);
		
		boolean bool = hs.hmemUpdate(hvo);
		if (bool) {
			System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);	
						
		}else {
			System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
		}				
	}
	
	// ȸ�� ���� : FLAG ���� DELETYN : N
	public static void hmemDelete() {
		System.out.println("ȸ������ ���� >>> : ");
		
		String hnum = "202108060008";				
	
		HbeMemberService hs = new HbeMemberServiceImpl();
		
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHnum(hnum);			
		
		boolean bool = hs.hmemDelete(hvo);
		
		if (bool) {
			System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);				
		}else {
			System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
		}			
	}

	// ���� �Լ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ȸ������ CRUD::ISUD �׽�Ʈ >>> : ");		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\nȸ������ ��ü��ȸ:1, ������ȸ:2, ���:3, ����:4, ����:5, ����:0");
			
			int isud = sc.nextInt();	
			if (0 == isud) break;
			
			switch(isud) {
				case 1:		
					try {
						HbeMemberScr.hmemSelectAll();	
					}catch(Exception e) {						
					}				
					break;
					
				case 2:
					System.out.println("��ȸ���� ȸ����ȣ�� �Է��Ͻÿ� >>> : ");
					Scanner sc1 = new Scanner(System.in);
					try {
						String hnum = sc1.next();
						HbeMemberScr.hmemSelect(hnum);	
					}catch(Exception e) {						
					}								
					break;
					
				case 3:
					try {
						HbeMemberScr.hmemInsert();	
					}catch(Exception e) {						
					}	
					break;
					
				case 4:
					try {
						HbeMemberScr.hmemUpdate();	
					}catch(Exception e) {						
					}						
					break;
					
				case 5:
					try {
						HbeMemberScr.hmemDelete();	
					}catch(Exception e) {						
					}	
					break;					
			}
		}
	}
}
