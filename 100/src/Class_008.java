import java.util.Scanner;
public class Class_008 {

	/*
	 * 8. ���ϥΪ̿�J�@���ūסA��X�۹������ؤ�ūסC(F=C*9/5+32)
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�z�n�p�⪺�ūסG");
		int a = scn.nextInt();
		System.out.print("�ФJ�z�n�����A1)�ؤ�����    2)�����ؤ�G");
		int b = scn.nextInt();
		
		if(b==1){
			double c = (a-32)*5/9;
			System.out.print("�g����᪺�ū׬O���"+c+"�סC");
		}
		else if(b==2){
			double c = a*9/5+32;
			System.out.print("�g����᪺�ū׬O�ؤ�"+c+"�סC");
		}
	}

}
