package a.b.c.ch5;

/*
��������� TestVO Ŭ���� �ڿ� = ���� 2�� + �Լ� 5��;
���� 2�� 
	������� sval
	������� ival
�Լ� 5�� 
	setSval(String sval)
	setIval(String ival)
	getSval()
	getIval()
	TestVO() ������
*/
public class TestVO
{
	private String sval;
	private String ival;

	public TestVO(){
		
	}

	public void setSval(String sval){
		this.sval = sval;
	}
	public void setIval(String ival){
		this.ival = ival;
	}

	public String getSval(){
		return this.sval; 
	}
	public String getIval(){
		return this.ival; 
	}

}