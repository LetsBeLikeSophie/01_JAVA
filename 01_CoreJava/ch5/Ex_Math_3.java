package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = (int)(Math.random()*100) + 1;
		System.out.println(" answer >>> : " + answer);

		int input = 0;
		int count = 0;

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		do{
			count++;
			System.out.println("1 �� 100���� ���� �Է��ϼ��� !!");
			
			input = sc.nextInt();
			
			if (answer > input){
				System.out.println("�� ū ���� �Է��ϼ��� !! \n");
			}else if (answer < input){
				System.out.println("�� ���� ���� �Է��ϼ��� !!\n");
			}else{
				System.out.println("GOOD !!");	
				System.out.println("�õ�Ƚ���� " + count + " �� �Դϴ�.");	
				break;
			}
		}
		while (true);
	}
}
