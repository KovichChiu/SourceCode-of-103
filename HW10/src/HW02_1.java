import java.util.Scanner;
public class HW02_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���ơG");
		int a = scn.nextInt();
		System.out.print("�п�J���ơG");
		int n = scn.nextInt();
		System.out.print("���סG \n"+a+"^"+n+" = "+power(a,n));
	}
	private static int power(int a,int n){
		if(n==1){
			return a;
		}else{
			n=n-1;
			return a*power(a,n);
		}
	}
}
