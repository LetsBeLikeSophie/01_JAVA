// package
package a.b.c.ch4.mem;

// import
import a.b.c.ch4.mem.vo.Ex_MemberVO;

/*
�ܼ� ���ø����̼����� ȸ�������� �ϴ� ���α׷� �����.
ȸ�������� ����� �μ��� �޴´�. 
ȸ������ �����ʹ� VO�� �־ ����Ѵ�.
ȸ�������� 
ȸ����ȣ : mnum
ȸ���̸� : mname
ȸ�����̵� : mid
ȸ����й�ȣ : mpw
ȸ���޴�����ȣ : mhp
ȸ���̸����ּ� : memail
ȸ���ּ� : maddr

��Ű�� : a.b.c.ch4.mem
����Ŭ������ : a.b.c.ch4.mem.Ex_Member
Ĳ��Ŭ���� : a.b.c.ch4.mem.vo.Ex_MemberVO
// �ٿ��������̽� : a.b.c.ch4.mem.dao.Ex_MemberDAO
// �ٿ�Ŭ���� : a.b.c.ch4.mem.dao.Ex_MemberDAOImpl

����� ����
1. VO ����� 
2. DAO
3. main �����
*/

public class  Ex_Member
{
	// ��� 
	// �������
	

	// ������
	public Ex_Member(){
		System.out.println("Ex_Member() ������");
	}
	// �Լ� 
	public int memInsert(Ex_MemberVO exvo){
		System.out.println("Ex_Member.memInsert() �Լ� ���� >>> ");
		System.out.println("exvo >>> : " + exvo);

		return 0;
	}
	

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// ��������, �������� 
		String mnum = ""; 
		String mname = "";
		String mid = "";
		String mpw = "";
		String mhp = "";
		String memail = "";
		String maddr = "";

		if (7 == args.length)
		{
			mnum = args[0]; 
			mname = args[1]; 
			mid = args[2]; 
			mpw = args[3]; 
			mhp = args[4]; 
			memail = args[5]; 
			maddr = args[6]; 

			Ex_MemberVO exvo = new Ex_MemberVO();
			exvo.setMnum(mnum);
			exvo.setMname(mname);
			exvo.setMid(mid);
			exvo.setMpw(mpw);
			exvo.setMhp(mhp);
			exvo.setMemail(memail);
			exvo.setMaddr(maddr);

			Ex_Member exm = new Ex_Member();
			exm.memInsert(exvo);

		}else{
			System.out.println("�����͸� �� �Է��Ͻÿ� !!!!");
		}

	}
}
