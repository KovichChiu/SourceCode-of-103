import java.util.Scanner;
public class �{�]1103HW_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�ӭȡG");
		int h = scn.nextInt();
		for(int i = h-1;i>=0;i--){
			for(int k = i;k>=0;k--){
				System.out.print(" ");
			}
			for(int j =1;j<=h-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
