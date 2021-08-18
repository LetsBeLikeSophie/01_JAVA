// package
package a.b.c.ch4.mem;

// import


public class Ex_Member_1 
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	// ȸ�� �����ϴ� �Լ� 
	public int memInsert(){
		System.out.println("Ex_Member_1.memInsert() ���� ���� >>> : ");
		
		// ������ ���񽺳� �ٿ����� �Լ��� ȣ���ؼ� ����� �޴´�. 
		int nCnt = 0;
		
		if (true)
		{
			nCnt = 1;

		}		
		return nCnt;
	}

	// ȸ�� ��ȸ�ϴ� �Լ�
	public void memSelect(){
		System.out.println("Ex_Member_1.memSelect() ���� ���� >>> : ");
		
	}

	// ȸ������ �����ϴ� �Լ�
	public int memUpdate(){
		System.out.println("Ex_Member_1.memUpdate() ���� ���� >>> : ");

		int nCnt = 0;
		if (true)
		{
			nCnt = 1;
		}
		return nCnt;
	}

	// ȸ������ �����ϴ� �Լ� 
	public int memDelete(){
		System.out.println("Ex_Member_1.memDelete() ���� ���� >>> : ");

		int nCnt = 0;
		if (true)
		{
			nCnt = 1;
		}
		return nCnt ;
	}


	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		// ������ ȭ�� 

		// �����ͺ��̽����� ISUD : CRDU ���α׷� 
		// I : INSERT, S : SELECT, U : UPDATE, D : DELETE

		String isud = args[0];
		System.out.println("isud >>> : " + isud);

		// ȸ������
		if ("I".equals(isud.toUpperCase()))
		{
			System.out.println("isud >>> : " + isud);

			Ex_Member_1 exm_1 = new Ex_Member_1();
			System.out.println("exm_1 >>> : " + exm_1);
			// ȸ������
			int nCntInsert = exm_1.memInsert();
			System.out.println("nCntInsert >>> : " + nCntInsert);
			if (nCntInsert == 1)
			{
				System.out.println("ȸ������ ���� !!!");
			}else{
				System.out.println("ȸ������ ���� !!!");
			}
		}

		// ȸ�� ��ȸ
		if ("S".equals(isud.toUpperCase()))
		{
			System.out.println("isud >>> : " + isud);

			Ex_Member_1 exm_1 = new Ex_Member_1();
			System.out.println("exm_1 >>> : " + exm_1);
			// ȸ�� ��ȸ
			exm_1.memSelect();
		}

		// ȸ������ ���� 
		if ("U".equals(isud.toUpperCase()))
		{
			System.out.println("isud >>> : " + isud);

			Ex_Member_1 exm_1 = new Ex_Member_1();
			System.out.println("exm_1 >>> : " + exm_1);
			// ȸ������ ���� 
			int nCntUpdate = exm_1.memUpdate();
			System.out.println("nCntUpdate >>> : " + nCntUpdate);
			if (nCntUpdate == 1)
			{
				System.out.println("ȸ������ ���� ���� !!!");
			}else{
				System.out.println("ȸ������ ���� ���� !!!");			
			}
		}

		// ȸ������ ����
		if ("D".equals(isud.toUpperCase()))
		{
			System.out.println("isud >>> : " + isud);

			Ex_Member_1 exm_1 = new Ex_Member_1();
			System.out.println("exm_1 >>> : " + exm_1);
			// ȸ������ ����
			int nCntDelete = exm_1.memDelete();
			System.out.println("nCntDelete >>> : " + nCntDelete);
			if (nCntDelete == 1)
			{
				System.out.println("ȸ������ ���� ���� !!!");
			}else{
				System.out.println("ȸ������ ���� ���� !!!");
			}
		}
	}
}
