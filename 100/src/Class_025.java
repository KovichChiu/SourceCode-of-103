import java.util.Scanner;
public class Class_025 {

	/*
	 * 25. ���ϥΪ̿�J�@�X�k�T���Ϊ��T���a, b, c(a<=b<=c)�A
    	�P�_�ÿ�X�ӤT���ά��u�����G�v�A�u�w���G�v�A�Ρu�U���G�v�C
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�T���ΤT����G");
		System.out.print("�Ĥ@��G");
		double a = scn.nextDouble();
		System.out.print("�ĤG��G");
		double b = scn.nextDouble();
		System.out.print("�ĤT��G");
		double c = scn.nextDouble();
		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);
		double c2 = Math.pow(c, 2);
		if(a+b>c&&a+c>b&&b+c>a){
			System.out.println("�o�O�T���ΡI");
		}else{
			System.out.println("�o���O�T���ΡG");
		}
		if(a2<b2+c2||b2<a2+c2||c2<a2+b2){
			System.out.print("�o�O�U���T���ΡI");
		}
		else if(a2==b2+c2||b2==a2+c2||c2==a2+b2){
			System.out.print("�o�O�����T���ΡI");
		}
		else if (a2>b2+c2||b2>a2+c2||c2>a2+b2){
			System.out.print("�o�O�����T���ΡI");
		}
	}
}
