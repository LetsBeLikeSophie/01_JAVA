package a.b.c.ch9.csimem.sql;

public abstract class CsiMemberSqlMap {

	public static String getCsiMemberSelectAllQuery() {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("SELECT								\n");

		sb1.append("		 A.HNUM	 	\n");
		sb1.append("		,A.HNAME 	\n");
		sb1.append("		,A.HID 		\n");
		sb1.append("		,A.HPW 		\n");
		sb1.append("		,A.HBIRTH 	\n");
		sb1.append("		,A.HGENDER	\n");
		
		sb1.append("		,A.HTEL		\n");
		sb1.append("		,A.HHP		\n");
		sb1.append("		,A.HEMAIL	\n");
		sb1.append("		,A.HADDR	\n");
		
		sb1.append("		,A.HHOBBY	\n");
		sb1.append("		,A.HPHOTO	\n");
		sb1.append("		,A.HSKILL	\n");
		sb1.append("		,A.HJOB		\n");

		sb1.append("		,A.DELETEYN	\n");
		sb1.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')	\n");
		sb1.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')	\n");

		sb1.append("FROM CSI_MEMBER A		\n");
		sb1.append("WHERE DELETEYN = 'Y'	\n");
		sb1.append("ORDER BY 1 DESC			\n");
		

		return sb1.toString();
	}

	
	public static String getCsiMemberSelectQuery() {
		StringBuffer sb2 = new StringBuffer();
		
		sb2.append("SELECT								\n");

		sb2.append("		 A.HNUM			HNUM		\n");
		sb2.append("		,A.HNAME		HNAME		\n");
		sb2.append("		,A.HID			HID			\n");
		sb2.append("		,A.HPW			HPW			\n");
		sb2.append("		,A.HBIRTH		HBIRTH		\n");
		sb2.append("		,A.HGENDER		HGENDER		\n");
		
		sb2.append("		,A.HTEL			HTEL		\n");
		sb2.append("		,A.HHP			HHP			\n");
		sb2.append("		,A.HEMAIL		HEMAIL		\n");
		sb2.append("		,A.HADDR		HADDR		\n");
		
		sb2.append("		,A.HHOBBY		HHOBBY		\n");
		sb2.append("		,A.HPHOTO		HPHOTO		\n");
		sb2.append("		,A.HSKILL		HSKILL		\n");
		sb2.append("		,A.HJOB			HJOB		\n");

		sb2.append("		,A.DELETEYN		DELETEYN	\n");
		sb2.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
		sb2.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");

		sb2.append("FROM CSI_MEMBER A					\n");
		sb2.append("WHERE DELETEYN = 'Y'				\n");
		sb2.append("AND A.HUNM = ?						\n");
		

		return sb2.toString();
	}

}
