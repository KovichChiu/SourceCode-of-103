import java.util.Scanner;
public class HW04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�T���Ϊ��T����C");
		System.out.print("�п�J�T���Ϊ��Ĥ@��G");
		int a = scn.nextInt();
		System.out.print("�п�J�T���Ϊ��ĤG��G");
		int b = scn.nextInt();
		System.out.print("�п�J�T���Ϊ��ĤT��G");
		int c = scn.nextInt();
		double a2=Math.pow(a,2);
		double b2=Math.pow(b,2);
		double c2=Math.pow(c,2);
		if(a<(b+c)&&b<(a+c)&&c<(a+b)){
			if(a2==(b2+c2)||b2==(a2+c2)||c2==(a2+b2)){
				System.out.print("�o�O�����T���ΡC");
			}
			else if(a2>(b2+c2)||b2>(a2+c2)||c2>(a2+b2)){
				System.out.print("�o�O�w���T���ΡC");
			}else{
				System.out.print("�o�O�U���T���ΡC");
			}
		}else{
			System.out.print("���X�k���T���ΡC");
		}
	}

}
