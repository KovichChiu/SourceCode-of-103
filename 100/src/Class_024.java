import java.util.Scanner;
public class Class_024 {

	/*
	 * 24. ���ϥΪ̿�J�T���Ϊ��T���a, b, c(a<=b<=c)�A�P�_�ÿ�Xa, b, c�O�_���X�k�T����C
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�T���ΤT����G");
		System.out.print("�Ĥ@��G");
		double a = scn.nextDouble();
		System.out.print("�ĤG��G");
		double b = scn.nextDouble();
		System.out.print("�ĤT��G");
		double c = scn.nextDouble();
		if(a+b>c&&a+c>b&&b+c>a){
			System.out.print("�o�O�T���ΡI");
		}else{
			System.out.print("�o���O�T���ΡG");
		}
	}
}
