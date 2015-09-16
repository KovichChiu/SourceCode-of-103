import java.util.Scanner;
public class HW05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入兩個數。");
		System.out.print("m=");
		int m=scn.nextInt();
		System.out.print("n=");
		int n=scn.nextInt();
		System.out.print(flounder(m,n));
	}
	private static int flounder(int m,int n){
		if(m%n==0){
			return m;
		}else{
			return flounder(n,m%n);
		}
	}
}
