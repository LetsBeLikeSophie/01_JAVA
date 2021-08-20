package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import a.b.c.mem.sql.HbeMemberSqlMap;
import a.b.c.swing.member.sql.SwingMemberSqlMap;

public class SwingMemberChabun {
	
	public static final String BIZ_GUBUN_SM = "SM"; // ȸ��
	
	// ä�� ����  �ҷ����� 
	public static String ymdNum() {
		
		// �������� ���� �ϰ� �ʱ�ȭ �ϱ� 		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmChabunQuery());
			System.out.println("ȸ��ä�� ���� >>> \n" + SwingMemberSqlMap.getSmChabunQuery());
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
			// ���� ��¥���� ���̱� : 20210818 :: 20210818 + 0001 = 202108180001
			commNO = DateUtil.yyyymmdd().concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			// �������� �ڵ� ���̱� : ȸ�� SM
			commNO = SwingMemberChabun.BIZ_GUBUN_SM.concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);			
		}catch(Exception e) {
			System.out.println("SwingMemberChabun ymdNum ��� ���� >>> : " + e.getMessage());
		}finally {
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return commNO;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String commNO = SwingMemberChabun.ymdNum();
		System.out.println("main :: commNO >>> : " + commNO);
	}
}
