package a.b.c.swing.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.common.HbeConnProperty;
import a.b.c.swing.member.sql.SwingMemberSqlMap;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberDAOImpl implements SwingMemberDAO {

	@Override
	public ArrayList<SwingMemberVO> smSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smSelectAll() �Լ� ���� >>> : ");		
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<SwingMemberVO> aList = null;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmSelectAllQuery());
			System.out.println("��ü��ȸ :: \n" + SwingMemberSqlMap.getSmSelectAllQuery());
			
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				aList = new ArrayList<SwingMemberVO>();
			
				while (rsRs.next()){
					
					SwingMemberVO _svo = new SwingMemberVO();
					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));									
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));
					
					aList.add(_svo);
				}
			}
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" ��ü��ȸ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return aList;
	}

	@Override
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smSelect() �Լ� ���� >>> : ");		
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<SwingMemberVO> aList = null;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmSelectQuery());
			System.out.println("������ȸ :: \n" + SwingMemberSqlMap.getSmSelectQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				aList = new ArrayList<SwingMemberVO>();
			
				while (rsRs.next()){
					
					SwingMemberVO _svo = new SwingMemberVO();
					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));									
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));
					
					aList.add(_svo);
				}
			}
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" ������ȸ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return aList;
	}

	@Override
	public boolean smInsert(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smInsert() �Լ� ���� >>> : ");
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		boolean bool = false;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmInsertQuery());
			System.out.println("�μ�Ʈ :: \n" + SwingMemberSqlMap.getSmInsertQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());
			pstmt.setString(2, svo.getSwname());
			pstmt.setString(3, svo.getSwid());
			pstmt.setString(4, svo.getSwpw());	
								
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();	
			if (nCnt > 0) { bool = true;}
			System.out.println("nCnt >>> : " + nCnt + " �� ��� �Ǿ��� ");			
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" �μ�Ʈ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt);	
		}
		
		return bool;
	}

	@Override
	public boolean smUpdate(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smUpdate() �Լ� ���� >>> : ");
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		boolean bool = false;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmUpdateQuery());
			System.out.println("������Ʈ :: \n" + SwingMemberSqlMap.getSmUpdateQuery());
			
			pstmt.clearParameters();			
			pstmt.setString(1, svo.getSwname());
			pstmt.setString(2, svo.getSwnum());
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();	
			if (nCnt > 0) { bool = true;}
			System.out.println("nCnt >>> : " + nCnt + " ��  ���� �Ǿ��� ");			
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" ������Ʈ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt);	
		}
		
		return bool;
	}

	@Override
	public boolean smDelete(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smDelete() �Լ� ���� >>> : ");
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		boolean bool = false;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmDeleteQuery());
			System.out.println("����Ʈ :: \n" + SwingMemberSqlMap.getSmDeleteQuery());
			
			pstmt.clearParameters();			
			pstmt.setString(1, svo.getSwname());
			pstmt.setString(2, svo.getSwnum());
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();	
			if (nCnt > 0) { bool = true;}
			System.out.println("nCnt >>> : " + nCnt + " ��  ���� �Ǿ��� ");			
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" ����Ʈ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt);	
		}
		
		return bool;
	}
}
