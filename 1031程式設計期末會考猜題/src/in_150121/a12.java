package in_150121;
import java.util.Scanner;
public class a12 {
	/*
	 * 12. ��J���, �^��M�ƾǦ��Z, �p����`���ƤΨC�쥭�����Z
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J��妨�Z�G");
		double C = scn.nextDouble();
		System.out.print("�п�J�^�妨�Z�G");
		double E = scn.nextDouble();
		System.out.print("�п�J�ƾǦ��Z�G");
		double M = scn.nextDouble();
		System.out.print("�`�����G"+(C+E+M)+"�A�������G"+((C+E+M)/3)+"�C");
	}
}
