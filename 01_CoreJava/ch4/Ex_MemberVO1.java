// package
package a.b.c.ch4.mem.vo;

// import


public class  Ex_MemberVO
{

	// 멤버변수
	private String mnum; 
	private String mname;
	private String mid;
	private String mpw;
	private String mhp;
	private String memail;
	private String maddr;

	public Ex_MemberVO(){
		
	}

	// setter 함수 : 멤버변수 초기화 하는 함수 
	public void setMnum(String mnum){ this.mnum = mnum; }
	public void setMname(String mname){ this.mname = mname; }
	public void setMid(String mid){ this.mid = mid; }
	public void setMpw(String mpw){ this.mpw = mpw; }
	public void setMhp(String mhp){ this.mhp = mhp; }
	public void setMemail(String memail){ this.memail = memail; }
	public void setMaddr(String maddr){ this.maddr = maddr; }


	// getter 함수 : 멤버변수에 초기화 된 값은 리턴하는 함수
	public String getMnum(){ return this.mnum; }
	public String getMname(){ return this.mname; }
	public String getMid(){ return this.mid; }
	public String getMpw(){ return this.mpw; }
	public String getMhp(){ return this.mhp; }
	public String getMemail(){ return this.memail; }
	public String getMaddr(){ return this.maddr; }
}
