// package
package a.b.c.ch4.mem;

// import
import java.util.Scanner;

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

		// �����ͺ��̽� ISUD : CRDU ���α׷� 
		// I : INSERT, S : SELECT, U : UPDATE, D : DELETE
		
		// ��������, �������� 
		String mnum = ""; 
		String mname = "";
		String mid = "";
		String mpw = "";
		String mhp = "";
		String memail = "";
		String maddr = "";

		if (1 == args.length)
		{
			String isud = args[0];

			// ȸ������
			if ("I".equals(isud.toUpperCase()))
			{
				System.out.println("ȸ������ ������ �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
				mnum = sc.next();
				System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);
				
				System.out.println("ȸ���̸��� key-in �Ͻÿ� >>> : ");
				mname = sc.next();
				System.out.println("�Է��� ȸ���̸� >>> : " + mname);
				
				System.out.println("���̵� key-in �Ͻÿ� >>> : ");
				mid = sc.next();
				System.out.println("�Է��� ���̵� >>> : " + mid);
				
				System.out.println("��й�ȣ�� key-in �Ͻÿ� >>> : ");
				mpw = sc.next();
				System.out.println("�Է��� ��й�ȣ >>> : " + mpw);

				System.out.println("�ڵ�����ȣ�� key-in �Ͻÿ� >>> : ");
				mhp = sc.next();
				System.out.println("�Է��� �ڵ�����ȣ >>> : " + mhp);

				System.out.println("�̸��ϸ� key-in �Ͻÿ� >>> : ");
				memail = sc.next();
				System.out.println("�Է��� �̸��� >>> : " + memail);
				
				System.out.println("ȸ���ּҸ� key-in �Ͻÿ� >>> : ");
				maddr = sc.next();
				System.out.println("�Է��� ȸ���ּ� >>> : " + maddr);
				sc.nextLine();

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

				System.out.println("ȸ����ȸ ������ �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
				mnum = sc.next();
				System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);

				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
				// ȸ�� ��ȸ
				exm_1.memSelect();
			}

			// ȸ������ ���� 
			if ("U".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("ȸ������ �ּ� ������ �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ���ּҸ� key-in �Ͻÿ� >>> : ");
				maddr = sc.next();
				System.out.println("�Է��� ȸ���ּ� >>> : " + maddr);

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

				System.out.println("ȸ�������� ȸ����Ȧ�� �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
				mnum = sc.next();
				System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);


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
		}else{
			System.out.println("ISUD �����ڸ� �Է��Ͻÿ� !!!!");		
		}	// end of if 	
	}	// end of main �Լ� 	
} // end of Ex_Member_1 Ŭ���� 

