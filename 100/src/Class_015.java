import java.util.Scanner;
public class Class_015 {
	/*
	 15. �g�@�{���A���ϥΪ̿�J����(cm)���魫(kg)�A�@��촫���X����(�^�T)���魫(�S)�C(1�S=0.454����A1�T=2.54����)
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�z������(cm)�G");
		double h = scn.nextDouble();
		System.out.print("�п�J�z���魫(kg)�G");
		double w = scn.nextDouble();
		double nh = h/2.54;
		double nw = w/0.454;
		System.out.println("����᪺����(�T)�G"+nh);
		System.out.println("����᪺�魫(�S)�G"+nw);
	}

}
