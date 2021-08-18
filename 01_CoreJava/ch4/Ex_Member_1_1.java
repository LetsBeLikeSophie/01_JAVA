// package
package a.b.c.ch4.mem;

// import
import java.util.Scanner;

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

		// 데이터베이스 ISUD : CRDU 프로그램 
		// I : INSERT, S : SELECT, U : UPDATE, D : DELETE
		
		// 지역변수, 참조변수 
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

			// 회원가입
			if ("I".equals(isud.toUpperCase()))
			{
				System.out.println("회원가입 정보를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원번호를 key-in 하시오 >>> : ");
				mnum = sc.next();
				System.out.println("입력한 회원번호 >>> : " + mnum);
				
				System.out.println("회원이름를 key-in 하시오 >>> : ");
				mname = sc.next();
				System.out.println("입력한 회원이름 >>> : " + mname);
				
				System.out.println("아이디를 key-in 하시오 >>> : ");
				mid = sc.next();
				System.out.println("입력한 아이디 >>> : " + mid);
				
				System.out.println("비밀번호를 key-in 하시오 >>> : ");
				mpw = sc.next();
				System.out.println("입력한 비밀번호 >>> : " + mpw);

				System.out.println("핸드폰번호를 key-in 하시오 >>> : ");
				mhp = sc.next();
				System.out.println("입력한 핸드폰번호 >>> : " + mhp);

				System.out.println("이메일를 key-in 하시오 >>> : ");
				memail = sc.next();
				System.out.println("입력한 이메일 >>> : " + memail);
				
				System.out.println("회원주소를 key-in 하시오 >>> : ");
				maddr = sc.next();
				System.out.println("입력한 회원주소 >>> : " + maddr);
				sc.nextLine();

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

				System.out.println("회원조회 정보를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원번호를 key-in 하시오 >>> : ");
				mnum = sc.next();
				System.out.println("입력한 회원번호 >>> : " + mnum);

				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
				// 회원 조회
				exm_1.memSelect();
			}

			// 회원정보 수정 
			if ("U".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("회원수정 주소 정보를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원주소를 key-in 하시오 >>> : ");
				maddr = sc.next();
				System.out.println("입력한 회원주소 >>> : " + maddr);

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

				System.out.println("회원삭제할 회원번홀를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원번호를 key-in 하시오 >>> : ");
				mnum = sc.next();
				System.out.println("입력한 회원번호 >>> : " + mnum);


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
		}else{
			System.out.println("ISUD 구분자를 입력하시오 !!!!");		
		}	// end of if 	
	}	// end of main 함수 	
} // end of Ex_Member_1 클래스 

