package a.b.c.ch7;
import java.util.Scanner;
public class Ex_File_4 {
	
	public static int factorial (int input) {
		
		int result;
		
		if (input > 0) {
			result = input * factorial (input-1);
		}else { 
			result = 1;
		}
		return result;
	} 
	

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int input = scanner.nextInt();
		System.out.println(input + "의 팩토리얼은 : " + Ex_File_4.factorial(input));
		
		
	}

}
