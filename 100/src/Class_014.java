import java.util.Scanner;
public class Class_014 {
	/*
 14. �]�p�@���F(w,h),�L�X�ew,��h�p�U���Ʀr�x�}�C
	(�Hw=5,h=3����)
	1  2  3  4  5
	2  4  6  8 10
	3  6  9 12 15
    �䤤�ĤG��O�Ĥ@�檺�⭿, �ĤT��O�Ĥ@�檺�T��, �H������. 
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�L���e�G");
		int w = scn.nextInt();
		System.out.print("�п�J�L�����G");
		int h = scn.nextInt();
		System.out.println("�ұo���G�p�U�G");
		for(int i=1;i<=h;i++){
			for(int j=1;j<=w;j++){
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}
}
