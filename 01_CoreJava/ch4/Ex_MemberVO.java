// package
package a.b.c.ch4.mem.vo;

// import


public class  Ex_MemberVO
{

	// �������
	// ��������� private ���������ڸ� ���̸�
	// �� ��������� Ŭ���� �ۿ��� ȣ���� �� �� ����. : ������ ����ȭ 
	// �� ��������� �����͸� ����Ϸ��� setter, getter �Լ��� �̿��ؾ� �Ѵ�. 
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
	// setter �Լ� ����� ��Ģ 
	// 1. ���ξ� set �� ����Ѵ�. 
	// 2. ������ ù ��° ���ڸ� �빮�ڷ� �Ѵ�. 
	// 3. 1 + 2 : set + Mnum = setMnum()
	public void setMnum(String mnum){ this.mnum = mnum; }
	public void setMname(String mname){ this.mname = mname; }
	public void setMid(String mid){ this.mid = mid; }
	public void setMpw(String mpw){ this.mpw = mpw; }
	public void setMhp(String mhp){ this.mhp = mhp; }
	public void setMemail(String memail){ this.memail = memail; }
	public void setMaddr(String maddr){ this.maddr = maddr; }


	// getter �Լ� : ��������� �ʱ�ȭ �� ���� �����ϴ� �Լ�
	// getter �Լ� ����� ��Ģ 
	// 1. ���ξ� get �� ����Ѵ�. 
	// 2. ������ ù ��° ���ڸ� �빮�ڷ� �Ѵ�. 
	// 3. 1 + 2 : get + Mnum = getMnum()
	public String getMnum(){ return this.mnum; }
	public String getMname(){ return this.mname; }
	public String getMid(){ return this.mid; }
	public String getMpw(){ return this.mpw; }
	public String getMhp(){ return this.mhp; }
	public String getMemail(){ return this.memail; }
	public String getMaddr(){ return this.maddr; }
}
