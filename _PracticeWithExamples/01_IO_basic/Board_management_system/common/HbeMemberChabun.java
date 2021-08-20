package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import a.b.c.mem.sql.HbeMemberSqlMap;

public class HbeMemberChabun {
	
	public static final String BIZ_GUBUN_M = "M"; // ȸ��
	
	// ���� ��¥ �޾ƿ��� 
//	public static String ymdFormats() {				
//		return new SimpleDateFormat("yyyyMMdd").format(new Date());
//	}

	// 0001 �ڸ��� ä��� �Լ�,  commNO �� �� ���� 0 ���� ä��� 
//	public static String numPad(String s) {
//		
//		int sLen = s.length();		
//		for (int i=sLen; i < 4; i++) {
//			s = "0" + s;
//		}		
//		return s;
//	}
	
	// ä�� ����  �ҷ����� 
	public static String ymdNum() {
		
		// �������� ���� �ϰ� �ʱ�ȭ �ϱ� 		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberChabunQuery());
			System.out.println("ȸ��ä�� ���� >>> \n" + HbeMemberSqlMap.getHbeMemberChabunQuery());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				while (rsRs.next()) {
					commNO = rsRs.getString("COMMNO");									
				}
			}else {
				System.out.println("ä������ ���� >>> : ");
			}
			
			// ��񿡼� ������  �ƽ��� :: 1
			System.out.println("commNO >>> : " + commNO);			
			// ��񿡼� ������  �ƽ��� :: 1 + 000 ä��� : 0001
			commNO = CodeUtil.numPad(commNO);
			System.out.println("commNO >>> : " + commNO);
			// ���� ��¥���� ���̱� : 20210809 :: 20210809 + 0001 = 202108090001
			commNO = DateUtil.yyyymmdd().concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			// �������� �ڵ� ���̱� : ȸ�� M
			commNO = HbeMemberChabun.BIZ_GUBUN_M.concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);			
		}catch(Exception e) {
			System.out.println("HbeMemberChabun ymdNum ��� ���� >>> : " + e.getMessage());
		}finally {
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return commNO;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String commNO = HbeMemberChabun.ymdNum();
		System.out.println("main :: commNO >>> : " + commNO);
	}
}
