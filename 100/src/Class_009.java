import java.util.Scanner;
public class Class_009 {
	/*
	 *9. ���ϥΪ̿�J�ʧO�P�����A�è̾ڨk�k���P, ���o(�L)�p��ÿ�X��з��魫 (�k�G(����-170)*0.6+62 �k�G(����-158)*0.5+52)�C
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�z���ʧO�G");
		String a = scn.next();
		System.out.print("�п�J�z�������G");
		double b = scn.nextDouble();
		if(a.equals("�k")){
			double c = (b-170.0)*0.6+62.0;
			System.out.print("�z���з��魫�G"+c);
		}
		else if(a.equals("�k")){
			double c =(b-158)*0.5-52;
			System.out.print("�z���з��魫�G"+c);
		}
	}
}
