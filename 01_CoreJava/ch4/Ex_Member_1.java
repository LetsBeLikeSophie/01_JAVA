// package
package a.b.c.ch4.mem;

// import


public class Ex_Member_1 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	// 회원 가입하는 함수 
	public int memInsert(){
		System.out.println("Ex_Member_1.memInsert() 진입 성공 >>> : ");
		
		// 실제는 서비스나 다오단의 함수를 호출해서 결과를 받는다. 
		int nCnt = 0;
		
		if (true)
		{
			nCnt = 1;

		}		
		return nCnt;
	}

	// 회원 조회하는 함수
	public void memSelect(){
		System.out.println("Ex_Member_1.memSelect() 진입 성공 >>> : ");
		
	}

	// 회원정보 수정하는 함수
	public int memUpdate(){
		System.out.println("Ex_Member_1.memUpdate() 진입 성공 >>> : ");

		int nCnt = 0;
		if (true)
		{
			nCnt = 1;
		}
		return nCnt;
	}

	// 회원정보 삭제하는 함수 
	public int memDelete(){
		System.out.println("Ex_Member_1.memDelete() 진입 성공 >>> : ");

		int nCnt = 0;
		if (true)
		{
			nCnt = 1;
		}
		return nCnt ;
	}


	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		// 브라우저 화면 

		// 데이터베이스에다 ISUD : CRDU 프로그램 
		// I : INSERT, S : SELECT, U : UPDATE, D : DELETE

		String isud = args[0];
		System.out.println("isud >>> : " + isud);

		// 회원가입
		if ("I".equals(isud.toUpperCase()))
		{
			System.out.println("isud >>> : " + isud);

			Ex_Member_1 exm_1 = new Ex_Member_1();
			System.out.println("exm_1 >>> : " + exm_1);
			// 회원가입
			int nCntInsert = exm_1.memInsert();
			System.out.println("nCntInsert >>> : " + nCntInsert);
			if (nCntInsert == 1)
			{
				System.out.println("회원가입 성공 !!!");
			}else{
				System.out.println("회원가입 실패 !!!");
			}
		}

		// 회원 조회
		if ("S".equals(isud.toUpperCase()))
		{
			System.out.println("isud >>> : " + isud);

			Ex_Member_1 exm_1 = new Ex_Member_1();
			System.out.println("exm_1 >>> : " + exm_1);
			// 회원 조회
			exm_1.memSelect();
		}

		// 회원정보 수정 
		if ("U".equals(isud.toUpperCase()))
		{
			System.out.println("isud >>> : " + isud);

			Ex_Member_1 exm_1 = new Ex_Member_1();
			System.out.println("exm_1 >>> : " + exm_1);
			// 회원정보 수정 
			int nCntUpdate = exm_1.memUpdate();
			System.out.println("nCntUpdate >>> : " + nCntUpdate);
			if (nCntUpdate == 1)
			{
				System.out.println("회원정보 수정 성공 !!!");
			}else{
				System.out.println("회원정보 수정 실패 !!!");			
			}
		}

		// 회원정보 삭제
		if ("D".equals(isud.toUpperCase()))
		{
			System.out.println("isud >>> : " + isud);

			Ex_Member_1 exm_1 = new Ex_Member_1();
			System.out.println("exm_1 >>> : " + exm_1);
			// 회원정보 삭제
			int nCntDelete = exm_1.memDelete();
			System.out.println("nCntDelete >>> : " + nCntDelete);
			if (nCntDelete == 1)
			{
				System.out.println("회원정보 삭제 성공 !!!");
			}else{
				System.out.println("회원정보 삭제 실패 !!!");
			}
		}
	}
}
