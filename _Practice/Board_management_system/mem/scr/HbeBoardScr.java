package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.HbeBoardService;
import a.b.c.board.service.HbeBoardServiceImpl;
import a.b.c.board.vo.HbeBoardVO;
import a.b.c.common.HbeBoardChabun;

public class HbeBoardScr {

	// ��ü ��ȸ
	public static void hboardSelectAll(){
		
		try {
			// ���� ȣ�� 
			HbeBoardService hs = new HbeBoardServiceImpl();	

			ArrayList<HbeBoardVO> aList = hs.hboardSelectAll();

			if (aList !=null && aList.size() > 0) {
				for (int i=0; i < aList.size(); i++) {				
					HbeBoardVO hvo = aList.get(i);	
					HbeBoardVO.printHbeBoardVO(hvo);
				}		
			}else {
				System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
	}
	
	// ���� ��ȸ
	public static void hboardSelect(String bnum){
		
		try {
			// ���� ȣ�� 
			HbeBoardService hs = new HbeBoardServiceImpl();	
			HbeBoardVO hvo = null;
			hvo = new HbeBoardVO();
			hvo.setBnum(bnum);

			ArrayList<HbeBoardVO> aList = hs.hboardSelect(hvo);

			if (aList !=null && aList.size() > 0) {
				for (int i=0; i < aList.size(); i++) {				
					HbeBoardVO _hvo = aList.get(i);	
					HbeBoardVO.printHbeBoardVO(_hvo);
				}		
			}else {
				System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
		
	}
	
	// �� �Է�
	public static void hboardInsert(){
		
		String bnum = HbeBoardChabun.gubunNum();
		String bsubject = "�׽�Ʈ����12";
		String bwriter = "�׽�Ʈ �۾���12";
		String bpw = "test12";
		String bcontents = "�۾��� �׽�Ʈ12";
		
		try {
			// ���� ȣ�� 
			HbeBoardService hs = new HbeBoardServiceImpl();	
			HbeBoardVO hvo = null;
			hvo = new HbeBoardVO();
			
			hvo.setBnum(bnum);
			hvo.setBsubject(bsubject);
			hvo.setBwriter(bwriter);			
			hvo.setBcontents(bcontents);
			hvo.setBpw(bpw);
			
			
			int nCnt = hs.hboardInsert(hvo);					
			
			if (nCnt > 0) {				
				System.out.println("�Խñ� " + nCnt + " �� ��� �Ǿ����ϴ�.");				
			}else {
				System.out.println("�Խñ� ��� ����.");
			}			
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
	}
	
	// �� ���� 
	public static void hboardUpdate(){
		
		String bnum = "B0001";		
		String bsubject = "�׽�Ʈ����10";
		String bcontents = "�۾��� �׽�Ʈ10";
		
		try {
			// ���� ȣ�� 
			HbeBoardService hs = new HbeBoardServiceImpl();	
			HbeBoardVO hvo = null;
			hvo = new HbeBoardVO();
			
			hvo.setBnum(bnum);
			hvo.setBsubject(bsubject);
			hvo.setBcontents(bcontents);
						
			int nCnt = hs.hboardUpdate(hvo)		;	
			
			if (nCnt > 0) {				
				System.out.println("�Խñ� " + nCnt + " �� ���� �Ǿ����ϴ�.");				
			}else {
				System.out.println("�Խñ� ���� ����.");
			}			
		}catch(Exception e) {
			System.out.println("���� �� ������ >>> : " + e.getMessage());
		}		
		 
	}
	
	// �� ����
	public static void hboardDelete(){
		
		String bnum = "B0001";		

		try {
			// ���� ȣ�� 
			HbeBoardService hs = new HbeBoardServiceImpl();	
			HbeBoardVO hvo = null;
			hvo = new HbeBoardVO();
			
			hvo.setBnum(bnum);
						
			int nCnt = hs.hboardDelete(hvo);	
			
			if (nCnt > 0) {				
				System.out.println("�Խñ� " + nCnt + " �� ���� �Ǿ����ϴ�.");				
			}else {
				System.out.println("�Խñ� ���� ����.");
			}			
		}catch(Exception e) {
			System.out.println("���� �� ������ >>> : " + e.getMessage());
		}				 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Խ��� CRUD::ISUD �׽�Ʈ >>> : ");		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n�Խ������� ��ü��ȸ:1, ������ȸ:2, ���:3, ����:4, ����:5, ����:0");
			
			int isud = sc.nextInt();	
			if (0 == isud) {
				System.out.println("���α׷� ���� !!");
				break;
			} 
			
			switch(isud) {
				case 1:		
					try {
						HbeBoardScr.hboardSelectAll();
					}catch(Exception e) {						
					}
					break;
					
				case 2:
					System.out.println("��ȸ���� �۹�ȣ�� �Է��Ͻÿ� >>> : ");
					Scanner sc1 = new Scanner(System.in);
					try {
						String bnum = sc1.next();
						HbeBoardScr.hboardSelect(bnum);
					}catch(Exception e) {						
					}								
					break;
					
				case 3:
					try {
						HbeBoardScr.hboardInsert();
					}catch(Exception e) {						
					}
					break;
					
				case 4:
					try {
						HbeBoardScr.hboardUpdate();
					}catch(Exception e) {						
					}				
					break;
					
				case 5:
					try {
						HbeBoardScr.hboardDelete();
					}catch(Exception e) {						
					}	
					break;					
			}
		}
	}
}
