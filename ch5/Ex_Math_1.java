package a.b.c.ch5;

/*
25�� 
����� �μ��� �޾Ƽ� ������ ��Ģ���� �ܼ� ���ø����̼��� ����ÿ� !!
�����ڴ� ���ο��� �����ؼ� ����ϱ� 
+ : addM(int x, int y)
- : subM(int x, int y)
* : mulM(int x, int y)
/ : divM(int x, int y)
�� ���� �ƱԸ�Ʈ�� �޾Ƽ� 
���ϰ��� �޾� �ֿܼ� ����� ����Ͻÿ� 
*/

/*
1. �Լ��� ���� �� �־�� �Ѵ�. 
	�Ű����� ??
	������ ??
2. ���α׷� ������ in �Ķ���� 	
	������ �ĸ����� 2�� 
	������ 4�� 
3. �Լ� ���� �� 
	static 
	�� static
4. ����� �μ� : String �迭 	
*/	 
	
public class Ex_Math_1 {

	// ���ϱ�
	public int addM(int x, int y) {				
		return x + y;
	}
	// ����
	public int subM(int x, int y) {		
		return x - y;
	}
	// ���ϱ� 
	public int mulM(int x, int y) {		
		return x * y;
	}
	// ������
	public int divM(int x, int y) {		
		return x / y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��������, �����ڷ��� 
		int x = 0;
		int y = 0;
		
		if (2 == args.length) {
		
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			
			Ex_Math exm = new Ex_Math();
			
			int addSum = exm.addM(x, y);
			System.out.println(x + " + " + y + " = "  + addSum);
			
			int subSum = exm.subM(x, y);
			System.out.println(x + " - " + y + " = "  + subSum);
			
			int mulSum = exm.mulM(x, y);
			System.out.println(x + " * " + y + " = "  + mulSum);
			
			int divSum = exm.divM(x, y);
			System.out.println(x + " / " + y + " = "  + divSum);
			
		}else {
			System.out.println("��Ģ������ �μ��� ������ 2�� �Է��Ͻÿ� !!");
		}		
	}
}
