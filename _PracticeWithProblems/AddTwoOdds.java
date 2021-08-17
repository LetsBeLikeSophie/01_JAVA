import java.util.Scanner;

public class AddTwoOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[][] numbers = new int[testCase][10];
        int[] sum = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            for (int j = 0; j < 10; j++) {
                numbers[i][j] = sc.nextInt();
                if (0 > numbers[i][j] || numbers[i][j] >10000) {
                    System.out.println("please set the number under 10000 : ");
                    j--;
                }
            }
        }

        for (int i = 0; i < testCase; i++) {
            for (int j = 0; j < 10; j++) {
                if ((numbers[i][j] % 2) == 1) {
                    sum[i] += numbers[i][j];
                }
            }
            System.out.println("#" + (i+1) + " " + sum[i]);
        }
    }


}
