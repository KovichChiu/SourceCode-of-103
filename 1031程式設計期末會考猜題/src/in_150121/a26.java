package in_150121;
import java.util.Scanner;
public class a26 {
	/*
	 * 26. �g�@���j��ơA�Dm,n��ƪ��̤j���]��gcd,m,n����L��J.
	(��:�H����۰��k,��Ƭ۰���,�A�H�䰣�ư��H�l��,����l�Ƭ��s.)
	(��: gcd(x,y) = gcd(y, x%y); gcd(x,0) = x)
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Ĥ@�ӼơG");
		int m = scn.nextInt();
		System.out.print("�п�J�ĤG�ӼơG");
		int n = scn.nextInt();
		System.out.print(m+","+n+"���̤j���]��="+gcd(m,n));
	}
	private static int gcd(int m,int n){
		if(m%n==0){
			return n;
		}else{
			return gcd(n,m%n);
		}
	}
}
