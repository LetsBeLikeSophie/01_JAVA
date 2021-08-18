package a.b.c.ch9.csimem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch9.csimem.sql.CsiMemberSqlMap;
import a.b.c.ch9.csimem.vo.CsiMemberVO;
import a.b.c.common.CsiConnProperty;

public class CsiMember {
	
	// ��ü ��ȸ �Լ� 
	public ArrayList<CsiMemberVO> hmemSelectAll() {
		System.out.println("HbeMember.hmemSelectAll() �Լ� ���� ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<CsiMemberVO> aList = null;
		
		try {
			
			conn = CsiConnProperty.getConnection();
			pstmt = conn.prepareStatement(CsiMemberSqlMap.getCsiMemberSelectAllQuery());
			System.out.println("��ü��ȸ \n" + CsiMemberSqlMap.getCsiMemberSelectAllQuery());
			
			rsRs = pstmt.executeQuery();			
						
			if (rsRs !=null) {
				
				aList = new ArrayList<CsiMemberVO>();
				
				while (rsRs.next()) {
					
					CsiMemberVO hvo = new CsiMemberVO();
					hvo.setHnum(rsRs.getString(1));
					hvo.setHname(rsRs.getString(2));
					hvo.setHid(rsRs.getString(3));
					hvo.setHpw(rsRs.getString(4));
					hvo.setHbirth(rsRs.getString(5));
					hvo.setHgender(rsRs.getString(6));
					hvo.setHtel(rsRs.getString(7));
					hvo.setHhp(rsRs.getString(8));
					hvo.setHemail(rsRs.getString(9));
					hvo.setHaddr(rsRs.getString(10));
					hvo.setHhobby(rsRs.getString(11));
					hvo.setHphoto(rsRs.getString(12));
					hvo.setHskill(rsRs.getString(13));
					hvo.setHjob(rsRs.getString(14));
					hvo.setDeleteyn(rsRs.getString(15));
					hvo.setInsertdate(rsRs.getString(16));
					hvo.setUpdatedate(rsRs.getString(17));
										
					aList.add(hvo);
				}				
			}
		}catch(Exception e) {
			System.out.println("hmemSelectAll() �Լ����� ��񿬰� �Ǵ� �������� ������ ����׿� >>> : " + e.getMessage());
		}
		
		return aList;
	}
	
	// ��ü ���� �Լ� 
	public ArrayList<CsiMemberVO> hmemSelect(CsiMemberVO hvo) {
		System.out.println("CsiMember.hmemSelect() �Լ� ���� ");
		CsiMemberVO.printlnHbeMemberVO(hvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<CsiMemberVO> aList = null;
		
		try {
			
			conn = CsiConnProperty.getConnection();
			pstmt = conn.prepareStatement(CsiMemberSqlMap.getCsiMemberSelectQuery());
			System.out.println("������ȸ \n" + CsiMemberSqlMap.getCsiMemberSelectQuery());
			
			pstmt.clearParameters();
			// 
			pstmt.setString(1, hvo.getHnum());
			rsRs = pstmt.executeQuery();			
						
			if (rsRs !=null) {
				
				aList = new ArrayList<CsiMemberVO>();
				
				while (rsRs.next()) {
					
					CsiMemberVO _hvo = new CsiMemberVO();
					_hvo.setHnum(rsRs.getString(1));
					_hvo.setHname(rsRs.getString(2));
					_hvo.setHid(rsRs.getString(3));
					_hvo.setHpw(rsRs.getString(4));
					_hvo.setHbirth(rsRs.getString(5));
					_hvo.setHgender(rsRs.getString(6));
					_hvo.setHtel(rsRs.getString(7));
					_hvo.setHhp(rsRs.getString(8));
					_hvo.setHemail(rsRs.getString(9));
					_hvo.setHaddr(rsRs.getString(10));
					_hvo.setHhobby(rsRs.getString(11));
					_hvo.setHphoto(rsRs.getString(12));
					_hvo.setHskill(rsRs.getString(13));
					_hvo.setHjob(rsRs.getString(14));
					_hvo.setDeleteyn(rsRs.getString(15));
					_hvo.setInsertdate(rsRs.getString(16));
					_hvo.setUpdatedate(rsRs.getString(17));
										
					aList.add(_hvo);
				}				
			}
		}catch(Exception e) {
			System.out.println("hmemSelect() �Լ����� ��񿬰� �Ǵ� �������� ������ ����׿� >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ȸ������ CRUD::ISUD �׽�Ʈ >>> : ");		
		

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n\nȸ������ ��ü��ȸ:SA, ������ȸ:S, ���:I, ����:U, ����:D, ����:Q");
			
			String isud = sc.next().toUpperCase();
			
			if ("Q".equals(isud)) break;
			
			if ("SA".equals(isud)) {
				System.out.println("ȸ������ ��ü��ȸ >>> : " + isud);
				
				CsiMember hm = new CsiMember();
				
				ArrayList<CsiMemberVO> aList = hm.hmemSelectAll();

				if (aList !=null && aList.size() > 0) {
					for (int i=0; i < aList.size(); i++) {
						
						CsiMemberVO hvo = aList.get(i);
						CsiMemberVO.printCsiMemberVO(hvo);
					}		
				}else {
					System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
				}
			}
			if ("S".equals(isud)) {
				System.out.println("ȸ������ ������ȸ >>> : " + isud);
				
				System.out.println("��ȸ���� ȸ����ȣ�� �Է��Ͻÿ� >>> : ");
				Scanner scs = new Scanner(System.in);
				String hnum = scs.next();
				
				CsiMember hm = new CsiMember();
				
				CsiMemberVO hvo = null;
				hvo = new CsiMemberVO();
				hvo.setHnum(hnum);
				
				ArrayList<CsiMemberVO> aList = hm.hmemSelect(hvo);

				if (aList !=null && aList.size() > 0) {
					for (int i=0; i < aList.size(); i++) {
						
						CsiMemberVO _hvo = aList.get(i);
						CsiMemberVO.printCsiMemberVO(_hvo);
					}		
				}else {
					System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
				}	
			}
			if ("I".equals(isud)) {
				System.out.println("ȸ������ ��� >>> : " + isud);	
			}
			if ("U".equals(isud)) {
				System.out.println("ȸ������ ���� >>> : " + isud);
			}
			if ("D".equals(isud)) {
				System.out.println("ȸ������ ���� >>> : " + isud);
			}				
		}
	}
}








