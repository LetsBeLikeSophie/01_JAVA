// package
package a.b.c.ch4.mem.vo;

// import


public class  Ex_MemberVO
{

	// �������
	private String mnum; 
	private String mname;
	private String mid;
	private String mpw;
	private String mhp;
	private String memail;
	private String maddr;

	public Ex_MemberVO(){
		
	}

	// setter �Լ� : ������� �ʱ�ȭ �ϴ� �Լ� 
	public void setMnum(String mnum){ this.mnum = mnum; }
	public void setMname(String mname){ this.mname = mname; }
	public void setMid(String mid){ this.mid = mid; }
	public void setMpw(String mpw){ this.mpw = mpw; }
	public void setMhp(String mhp){ this.mhp = mhp; }
	public void setMemail(String memail){ this.memail = memail; }
	public void setMaddr(String maddr){ this.maddr = maddr; }


	// getter �Լ� : ��������� �ʱ�ȭ �� ���� �����ϴ� �Լ�
	public String getMnum(){ return this.mnum; }
	public String getMname(){ return this.mname; }
	public String getMid(){ return this.mid; }
	public String getMpw(){ return this.mpw; }
	public String getMhp(){ return this.mhp; }
	public String getMemail(){ return this.memail; }
	public String getMaddr(){ return this.maddr; }
}
