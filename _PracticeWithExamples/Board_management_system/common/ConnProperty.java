package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;

// �߻�Ŭ���� ���� : new �����ڸ� ������� ���� 
public abstract class ConnProperty {
	
	// ��� 
	// �����ͺ��̽� ���� ���� : DataSource : �����δ� �����ͺ��̽� ���������� �����ͼҽ���� �θ���. 
	// �����ͺ��̽� ���� �������� ������ �־�� �ϴ°� 
	// 1. jdbc ����̹� ������ ���ӽ����̽� 
	// 2. �����ͺ��̽� ���� url 
	// 3. ������
	// 4. �������� �н����� 
	private static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	private static final String ORCL_USER = "scott";
	private static final String ORCL_PASS = "tiger";
	
	
	// �����ͺ��̽� ����̹��� ã��, ���� ���� �ϴ� �Լ� 
	// �߻��Լ��� �ƴ� static �Ϲ��Լ�
	// ConnProperty.getConnection() ���� ����ϸ� �ȴ�. 
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName(ConnProperty.ORCL_JDBC_DIRVER);	
			conn = DriverManager.getConnection( ConnProperty.ORCL_URL
					                           ,ConnProperty.ORCL_USER
					                           ,ConnProperty.ORCL_PASS);
			
		}catch (Exception e) {
			System.out.println(   "ConnProperty :: �����ͺ��̽��� �����ϴµ� \n"
					            + "����̹� �Ǵ� ���� �������� ������ ���� >>> : \n" 
								+ e.getMessage() + "\n");
		}
		
		return conn;
	}
	
	// ���� �����ϴ� �Լ� 
}
