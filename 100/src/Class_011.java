import java.util.Scanner;
public class Class_011 {
	/*
	 * 11. ��J��Ӿ��, �p���X, �t, ���n.
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Ĥ@�ӼơG");
		int num1 = scn.nextInt();
		System.out.print("�п�J�ĤG�ӼơG");
		int num2 = scn.nextInt();
		System.out.println("�X="+(num1+num2));
		System.out.println("�t="+(num1-num2));
		System.out.println("���n="+(num1*num2));
	}
}
