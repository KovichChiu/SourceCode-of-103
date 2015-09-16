import java.util.Scanner;
public class 程設1103HW_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個值：");
		int n = scn.nextInt();
		double m = 0;
		for(int i=1;i<=n;i++){
			m=m + (1.0/((2.0*i-1.0)*(2.0*i)));
		}
		System.out.print("經過1/[(2n-1)(2n)]計算出的值="+m);
	}

}
