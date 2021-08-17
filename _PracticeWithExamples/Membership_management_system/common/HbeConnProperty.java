package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// �߻�Ŭ���� ���� : new �����ڸ� ������� ���� 
public abstract class HbeConnProperty {
	
	// ��� 
	// �����ͺ��̽� ���� ���� : DataSource : �����δ� �����ͺ��̽� ���������� �����ͼҽ���� �θ���. 
	// �����ͺ��̽� ���� �������� ������ �־�� �ϴ°� 
	// 1. jdbc ����̹� ������ ���ӽ����̽� 
	// 2. �����ͺ��̽� ���� url 
	// 3. ������
	// 4. �������� �н����� 
	private static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	private static final String ORCL_USER = "hbe00";
	private static final String ORCL_PASS = "hbe1234";
	
	
	// �����ͺ��̽� ����̹��� ã��, ���� ���� �ϴ� �Լ� 
	// �߻��Լ��� �ƴ� static �Ϲ��Լ�
	// ConnProperty.getConnection() ���� ����ϸ� �ȴ�. 
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName(HbeConnProperty.ORCL_JDBC_DIRVER);	
			conn = DriverManager.getConnection( HbeConnProperty.ORCL_URL
					                           ,HbeConnProperty.ORCL_USER
					                           ,HbeConnProperty.ORCL_PASS);
			
		}catch (Exception e) {
			System.out.println(   "ConnProperty :: �����ͺ��̽��� �����ϴµ� \n"
					            + "����̹� �Ǵ� ���� �������� ������ ���� >>> : \n" 
								+ e.getMessage() + "\n");
		}
		
		return conn;
	}
	
	// ���� �����ϴ� �Լ� 
	public static void conClose(Connection conn, PreparedStatement pstmt, ResultSet rsRs) {
		try{
			if (rsRs != null) try { rsRs.close(); rsRs = null; } catch(Exception ex){}
			if (pstmt != null) try { pstmt.close(); pstmt = null; } catch(Exception ex){}
			if (conn != null) try { conn.close(); conn = null; } catch(Exception ex){}
		}catch (Exception e2){}			
	}
	
	public static void conClose(Connection conn, PreparedStatement pstmt) {
		try{
			if (pstmt != null) try { pstmt.close(); pstmt = null; } catch(Exception ex){}
			if (conn != null) try { conn.close(); conn = null; } catch(Exception ex){}
		}catch (Exception e2){}			
	}	
}	
