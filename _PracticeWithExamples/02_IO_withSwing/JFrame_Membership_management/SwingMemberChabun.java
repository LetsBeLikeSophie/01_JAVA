package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import a.b.c.mem.sql.HbeMemberSqlMap;
import a.b.c.swing.member.sql.SwingMemberSqlMap;

public class SwingMemberChabun {
	
	public static final String BIZ_GUBUN_SM = "SM"; // 회원
	
	// 채번 쿼리  불러오기 
	public static String ymdNum() {
		
		// 지역변수 선언 하고 초기화 하기 		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmChabunQuery());
			System.out.println("회원채번 쿼리 >>> \n" + SwingMemberSqlMap.getSmChabunQuery());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				while (rsRs.next()) {
					commNO = rsRs.getString("COMMNO");									
				}
			}else {
				System.out.println("채번쿼리 실패 >>> : ");
			}
			
			// 디비에서 가져온  맥스값 :: 1
			System.out.println("commNO >>> : " + commNO);			
			// 디비에서 가져온  맥스값 :: 1 + 000 채우기 : 0001
			commNO = CodeUtil.numPad(commNO);
			System.out.println("commNO >>> : " + commNO);
			// 현재 날짜형식 붙이기 : 20210818 :: 20210818 + 0001 = 202108180001
			commNO = DateUtil.yyyymmdd().concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			// 업무구분 코드 붙이기 : 회원 SM
			commNO = SwingMemberChabun.BIZ_GUBUN_SM.concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);			
		}catch(Exception e) {
			System.out.println("SwingMemberChabun ymdNum 디비 에러 >>> : " + e.getMessage());
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
