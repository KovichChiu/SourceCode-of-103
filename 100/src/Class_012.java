import java.util.Scanner;
public class Class_012 {
	/*
	 * 12. ��J���, �^��M�ƾǦ��Z, �p����`���ƤΨC�쥭�����Z
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���쪺���Z�G");
		int ch = scn.nextInt();
		System.out.print("�п�J�^��쪺���Z�G");
		int en = scn.nextInt();
		System.out.print("�п�J�ƾǬ쪺���Z�G");
		int m = scn.nextInt();
		int all = ch+en+m;
		double range = (double)all/3;
		System.out.print("�`���G"+all+"\t"+"�`�����G"+range);
	}

}
