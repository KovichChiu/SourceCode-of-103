import java.util.Scanner;
public class �{�]1103HW_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӭȡG");
		int n = scn.nextInt();
		double m = 0;
		for(int i=1;i<=n;i++){
			m=m + (1.0/((2.0*i-1.0)*(2.0*i)));
		}
		System.out.print("�g�L1/[(2n-1)(2n)]�p��X����="+m);
	}

}
