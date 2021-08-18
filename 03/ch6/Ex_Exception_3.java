package a.b.c.ch6;


public class Ex_Exception_3 {
	
	// java.lang.ArrayIndexOutOfBoundsException
	
	// throws Exception :  �Լ��� ȣ���� ������ ���ܸ� ������ 
	// public void aM(int[] iVal) throws ArrayIndexOutOfBoundsException {
	public void aM(int[] iVal) throws Exception {
		System.out.println("aM() >>> ����");
		System.out.println("iVal >>> : " + iVal);		
		System.out.println("iVal.length >>> : " + iVal.length);
		
		for (int i=0; i <= iVal.length; i++ ){
			iVal[i] = i;
			System.out.println("iVal["+i+"] >>> : " + iVal[i]);
		}			
		
		System.out.println("aM() >>> ��");
	}

	// main() �Լ������� throws �� ����ϸ� �ʵȴ�. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main() >>> ����");
		int[] iArr = new int[5];
		System.out.println("iArr >>> : " + iArr);
		
		try{
			Ex_Exception_3 ex2 = new Ex_Exception_3();
			ex2.aM(iArr);			
		}catch (Exception e){
			System.out.println("e >>> : " + e);
		}
		
		System.out.println("main() >>> ��");
	}
}
