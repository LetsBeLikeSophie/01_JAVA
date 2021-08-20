package a.b.c.swing.member.sql;

public abstract class SwingMemberSqlMap {
	
	//ä�� 
	public static String getSmChabunQuery() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT  											\n");
		sb.append("         NVL(MAX(SUBSTR(A.SWNUM, -4)), 0) + 1 COMMNO	\n");
		sb.append(" FROM    SWING_MEMBER A 								\n");	   	  

	    return sb.toString();
	};
	
	// ��ü ��ȸ
	public static String getSmSelectAllQuery() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("      A.SWNUM 		SWNUM 			\n");
		sb.append("		,A.SWNAME  		SWNAME 			\n");
		sb.append("		,A.SWID  		SWID 			\n");
		sb.append("		,A.SWPW  		SWPW			\n");	 	   	    	   
	    sb.append("		,A.DELETEYN 	DELETEYN		\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	      
	    sb.append("	FROM 								\n");
	    sb.append("		 SWING_MEMBER A 				\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	ORDER BY 1 DESC						\n");

	    return sb.toString();
	};
	
	// ���� ��ȸ
	public static String getSmSelectQuery() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("      A.SWNUM 		SWNUM 			\n");
		sb.append("		,A.SWNAME  		SWNAME 			\n");
		sb.append("		,A.SWID  		SWID 			\n");
		sb.append("		,A.SWPW  		SWPW			\n");	 	   	    	   
	    sb.append("		,A.DELETEYN 	DELETEYN		\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	      
	    sb.append("	FROM 								\n");
	    sb.append("		 SWING_MEMBER A 				\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	AND   A.SWNUM   = ?					\n");// placeholder 1	
	    
	    return sb.toString();
	};
	
	// ���
	public static String getSmInsertQuery() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append("	INSERT INTO 						\n");	
		sb.append("		SWING_MEMBER 				    \n");
		sb.append("		          (			    		\n");
		sb.append("     			 SWNUM 				\n"); // COLUMN 1
		sb.append("				  	,SWNAME 			\n"); // COLUMN 2
		sb.append("					,SWID 				\n"); // COLUMN 3
		sb.append("					,SWPW				\n"); // COLUMN 4	 
	    sb.append("					,DELETEYN			\n"); // COLUMN 5
	    sb.append("					,INSERTDATE			\n"); // COLUMN 6
	    sb.append("					,UPDATEDATE			\n"); // COLUMN 7
		sb.append("			      )						\n");
		sb.append("	       VALUES (  					\n");			
		sb.append("						 ? 				\n");// placeholder 1
	    sb.append("						,?   			\n");// placeholder 2
	    sb.append("						,?   			\n");// placeholder 3
	    sb.append("						,?   			\n");// placeholder 4
	    sb.append("						,'Y'			\n");// placeholder 5
	    sb.append("						,SYSDATE 		\n");// placeholder 6
	    sb.append("						,SYSDATE 		\n");// placeholder 7	
		sb.append("	              )						\n");		
		
		return sb.toString();
	};
	
	// ����
	public static String getSmUpdateQuery() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append("	UPDATE  							\n");	
		sb.append("		   SWING_MEMBER 			    \n");	
		sb.append("	SET  								\n");
	    sb.append("		   SWNAME  			= ?			\n");// placeholder 1	     	    	    	   
	    sb.append("		  ,UPDATEDATE 		= SYSDATE	\n");
		sb.append("	WHERE  SWNUM 			= ?			\n");// placeholder 2	    
		sb.append("	AND    DELETEYN 		= 'Y'  		\n");		
					
		return sb.toString();		
	};
	
	// ���� 
	public static String getSmDeleteQuery() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append("	UPDATE  							\n");	
		sb.append("		   SWING_MEMBER 			    \n");	
		sb.append("	SET  								\n");
	    sb.append("		   DELETEYN 	= 'N'			\n");	    	   
	    sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
		sb.append("	WHERE  SWNUM	 	= ?				\n");// placeholder 1	    
		sb.append("	AND    DELETEYN 	= 'Y'  			\n");		
					
		return sb.toString();	
	};	
}
