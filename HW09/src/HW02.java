import java.util.Scanner;
public class HW02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Ĥ@�ӭȡG");
		int m=scn.nextInt();
		System.out.print("�п�J�ĤG�ӭȡG");
		int n=scn.nextInt();
		System.out.print("�H�W��ƪ��̤j���]�Ƭ�"+pub(m,n)+"�C");
	}
	public static int pub(int m,int n){
		if(m%n==0){
			return n;
		}else{
			return pub(n,m%n);
		}
	}
}
