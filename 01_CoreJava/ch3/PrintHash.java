package a.b.c.ch3;

import java.util.Scanner;

public class PrintHash {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
	
        if (count <= 100000) {
            for (int i = 0; i < count; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
		else {
			System.out.println("100,000 이하의 값을 넣어주세요.");
		}
    }
}